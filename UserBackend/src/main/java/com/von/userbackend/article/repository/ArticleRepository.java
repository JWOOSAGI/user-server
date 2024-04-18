package com.von.userbackend.article.repository;


import com.von.userbackend.article.model.Article;
import com.von.userbackend.article.model.ArticleDTO;
import com.von.userbackend.board.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long>{
    // JPQL Default 방식
    @Query("select a from articles a where a.board.id = :boardId")
    public List<Article> findAllByBoardId(@Param("boardId") Long boardId);

//    List<Article> findAllByBoardId(Long id);

//    @Query("select id, title, content from articles where board = :board ")
//    public List<Article> getArticlesByBoardId(@Param("board") Board boardId);




    // Native 방식
//    @Query(value = "select a from articles a where a.board.id = :boardId", nativeQuery = true)
//    public List<Map<String, Object>> getQnaArticles(@Param("boardId") Long boardId); // Review 카테고리값이 2
//
//    // JPSQL Return Type DTO
//    String articleDTOMapping = "new com.von.api.article.model.ArticleDTO("+
//            "a.id, a.title, a.content, a.writer.Id, a.board.Id" +
//            ", a.regDate, a.modDate)";
//    @Query("select " + articleDTOMapping + " from articles a where a.board.id = :boardId")
//    public List<ArticleDTO> getArticleDTOsBoardId (@Param("boardId") Long boardId); // Review 카테고리값이 2


}