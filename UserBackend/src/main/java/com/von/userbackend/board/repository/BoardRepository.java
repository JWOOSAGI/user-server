package com.von.userbackend.board.repository;

import com.von.userbackend.article.model.Article;
import com.von.userbackend.board.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository  extends JpaRepository<Board, Long> {

//    List<Board> findAllOrderByContent();

}