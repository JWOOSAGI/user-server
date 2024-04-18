package com.von.userbackend.article.repository;


import com.von.userbackend.article.model.Article;
import com.von.userbackend.board.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long>{

//    List<Article> findAllByBoardId(Long id);
//
//    @Query("select id, title, content from articles where board = :board ")
//    public List<Article> getArticlesByBoardId(@Param("board") Board boardId);

    @Query("select a from articles a where a.board.id = :boardId")
    public List<Article> findAllByBoardId(@Param("boardId") Long boardId);

}