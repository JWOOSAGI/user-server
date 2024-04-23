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
@RequestMapping(path = "/api/auth")
@Slf4j
public class AuthController {
    private final UserServiceImpl service;

    @PostMapping(path = "/login")
    public ResponseEntity<MessengerVO> login(@RequestBody UserDTO param ) {
        log.info("입력받은 정보 : {}", param );
        return ResponseEntity.ok(service.login(param));
    }

    @GetMapping(path = "/exists-username")
    public ResponseEntity<MessengerVO> findByUsername(@RequestParam("username") String username) {
        log.info("입력받은 정보 : {}", username);
        return ResponseEntity.ok(service.findByUsername(username));
    }

}