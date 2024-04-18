package com.von.userbackend.board;

import com.von.userbackend.board.model.BoardDTO;
import com.von.userbackend.board.serivce.BoardServiceImpl;

import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequiredArgsConstructor
@Log4j2
@RequestMapping("/api/boards")
public class BoardController {

    private final BoardServiceImpl service;

    @GetMapping("/list")
    public ResponseEntity<List<BoardDTO>> findAll()   {
        log.info("입력받은 정보 : {}" );
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(path = "/detail")
    public ResponseEntity<Optional<BoardDTO>> findById(@RequestParam("id") Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
}