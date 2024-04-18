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
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @OneToMany(mappedBy = "board" , cascade = CascadeType.REMOVE)
    private List<Article> articles;
}
