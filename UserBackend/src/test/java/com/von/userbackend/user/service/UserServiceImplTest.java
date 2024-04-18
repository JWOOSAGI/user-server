package com.von.userbackend.user.service;

import com.von.userbackend.user.model.UserDTO;
import com.von.userbackend.user.repository.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@Nested
@SpringBootTest
@Transactional
class UserServiceImplTest {
    @Autowired
    UserServiceImpl service;
    UserRepository repository;

    @Test
    @DisplayName("가입된 회원 수")
    void count() {
        long totalUsers = service.count();
        assertThat(totalUsers).isEqualTo(15);
    }

//    @Test
//    void save() {
//        // Given
//        UserDTO user = new User();
//        user.setName("John Doe");
//        user.setEmail("john@example.com");
//
//        // When
//        service.save(user);
//
//        // Then
//        long totalUsers = service.count();
//        assertThat(totalUsers).isEqualTo(16); // 새로운 사용자를 저장했으므로 기존 사용자 수에 1을 더한 값과 같아야 함
//    }


//    @Test
//    void modify() {
//        // Given
//        long userId = 1L;
//        Optional<UserDTO> user = service.findById(userId);
//        user.set("modified@example.com");
//
//        // When
//        service.modify(user);
//
//        // Then
//        Optional<UserDTO> modifiedUser = service.findById(userId);
//        assertThat(modifiedUser.getEmail()).isEqualTo("modified@example.com"); // 이메일이 정확히 변경되었는지 확인
//    }


    @Test
    void deleteById() {
        // Given
        long userId = 1L;

        // When
        service.deleteById(userId);

        // Then
        Optional<UserDTO> deletedUser = service.findById(userId);
        assertThat(deletedUser).isNull(); // 삭제된 사용자는 더 이상 찾을 수 없어야 함

    }

    @Test
    void findAll() {
        // When
        List<UserDTO> users = service.findAll();

        // Then
        assertThat(users.size()).isEqualTo(15); // 예상된 사용자 수와 일치해야 함
    }

//    @Test
//    void findById() {
// Given
//        long userId = 1L;
//
//        // When
//        Optional<UserDTO> user = service.findById(userId);
//
//        // Then
//        assertThat(user).isNotNull(); // 사용자가 존재해야 함
//        assertThat(user.getId()).isEqualTo(userId); // 조회한 사용자의 ID가 일치해야 함
//    }
}