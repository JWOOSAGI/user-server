package com.von.userbackend.user.model;

import com.von.userbackend.article.model.Article;
import com.von.userbackend.common.model.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
@Entity(name = "users")
public class User extends BaseEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String passwordConfirm;
    private String name;
    private String phone;
    private String email;
    private String job;


    @OneToMany(mappedBy = "writer", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Article> article;

    @Builder(builderMethodName = "builder")
    public User(Long id, String username, String password, String passwordConfirm, String name,  String phone,
                String job, String email){
        this.id = id;
        this.username = username;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.job = job;


    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return  "{username=" + username + '\n' +
                " password=" + password + '\n' +
                " name=" + name + '\n' +
                " phoneNumber=" + phone + '\n' +
                " job=" + job +
                '}'+'\n'+'\n';
    }



}