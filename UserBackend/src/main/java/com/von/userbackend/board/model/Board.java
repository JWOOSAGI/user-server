package com.von.userbackend.board.model;
import com.von.userbackend.article.model.Article;
import com.von.userbackend.common.model.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@Getter
@ToString
@AllArgsConstructor
@Builder
@Entity(name = "boards")
public class Board extends BaseEntity {

    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;
    private String description;

    @OneToMany(mappedBy = "board" , cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Article> articles;
}
