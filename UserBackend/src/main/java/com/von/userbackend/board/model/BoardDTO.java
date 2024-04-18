package com.von.userbackend.board.model;

import com.von.userbackend.article.model.Article;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
@Data // getter, settter, toString

@Component
public class BoardDTO {
    private Long id;
    private String title;
    private String description;
    private List<Article> articles ;
    private String regDate;
    private String modDate;
}