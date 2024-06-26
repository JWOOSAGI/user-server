package com.von.userbackend.user.repository;

import com.von.userbackend.article.model.Article;
import com.von.userbackend.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String userName);
//    List<User> findAllOrderById();


    @Modifying
    @Query("update users set token = :token where id = :id")
    public void modifyTokenById( @Param("id")Long id, @Param("token") String token);



}