package com.von.userbackend.board.repository;

import com.von.userbackend.board.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository  extends JpaRepository<Board, Long> {

}