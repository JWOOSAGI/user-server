package com.von.userbackend.user;

import com.von.userbackend.common.component.MessengerVO;
import com.von.userbackend.user.model.UserDTO;

import com.von.userbackend.user.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/users")
@Slf4j
public class UserController {
    private final UserServiceImpl service;

    @SuppressWarnings("static-access")
    @PostMapping( "/save")
    public ResponseEntity<MessengerVO> save(@RequestBody UserDTO dto) {
        log.info("입력받은 정보 : {}", dto );
        return ResponseEntity.ok(service.save(dto));
    }


    @GetMapping("/list")
    public ResponseEntity<List<UserDTO>> findAll(){
        log.info("입력받은 정보 : {}" );
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(path = "/detail")
    public ResponseEntity<Optional<UserDTO>> findById(@RequestParam Long id) {
        log.info("입력받은 정보 : {}", id );
        return ResponseEntity.ok(service.findById(id));
    }

    @PutMapping("/modify")
    public ResponseEntity<MessengerVO> modify(@RequestBody UserDTO param) {
        log.info("입력받은 정보 : {}", param );
        return ResponseEntity.ok(service.modify(param));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<MessengerVO> deleteById(@RequestParam Long id) {
        log.info("입력받은 정보 : {}", id );
        return ResponseEntity.ok(service.deleteById(id));
    }

    @GetMapping("/count")
    public ResponseEntity<Long> count() {
        return ResponseEntity.ok(service.count());
    }

    @PostMapping("/search")
    public ResponseEntity<List<UserDTO>> findUsersByName(@RequestBody UserDTO param) {
        //log.info("입력받은 정보 : {}", name );
        return ResponseEntity.ok(service.findUsersByName(param.getName()));
    }

    @GetMapping("/logout")
    public ResponseEntity<Boolean> logout(@RequestHeader("Authorization") String accessToken) {
        log.info("1- logout request : {}", accessToken);
        var flag = service.logout(accessToken);
        return ResponseEntity.ok(flag);
    }


//    @PostMapping(path = "/exists")
//    public ResponseEntity<MessengerVO> exists(@RequestBody UserDTO param ) {
//        log.info("입력받은 정보 : {}", param );
//        return ResponseEntity.ok(service.exists(param));
//    }
}