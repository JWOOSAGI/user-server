package com.von.userbackend.article.model;

import com.von.userbackend.board.model.Board;
import com.von.userbackend.common.model.BaseEntity;
import com.von.userbackend.user.model.User;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString(exclude = {"id"})
@Entity(name = "articles")
@Builder
public class Article extends BaseEntity {
    @Id
    @Column(name="id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", length = 128)
    private String title;

    @Column(name = "content", length = 1024)
    private String content;
    //    private Long writer;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id", nullable = true)
    private Board board;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = true)
    private User writer;

    public static Article of(String title,String content){
        Article article = new Article();
        article.title = title;
        article.content = content;

        return article;
    }
}
