package com.von.userbackend.article.service;

import com.von.userbackend.article.model.Article;
import com.von.userbackend.article.model.ArticleDTO;
import com.von.userbackend.board.model.Board;
import com.von.userbackend.board.repository.BoardRepository;
import com.von.userbackend.common.service.CommandService;
import com.von.userbackend.common.service.QueryService;

import java.util.List;

public interface ArticleService extends CommandService<ArticleDTO>, QueryService<ArticleDTO> {


    default Article dtoToEntity(ArticleDTO dto){
        return Article.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .content(dto.getContent())
                .board(Board.builder().id(dto.getBoardId()).build())
                .build();
    }
    default  ArticleDTO entityToDTO(Article article){
        return ArticleDTO.builder()
                .id(article.getId())
                .title(article.getTitle())
                .content(article.getContent())
                .boardId(article.getBoard().getId())
                .modDate(String.valueOf(article.getModDate()))
                .regDate(String.valueOf(article.getRegDate()))
                .build();
    }

    List<ArticleDTO> myList(Long id);
}
