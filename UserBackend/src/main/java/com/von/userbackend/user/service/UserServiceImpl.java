package com.von.userbackend.user.service;

import com.von.userbackend.common.component.security.JwtProvider;
import com.von.userbackend.common.component.MessengerVO;
import com.von.userbackend.user.model.User;
import com.von.userbackend.user.model.UserDTO;
import com.von.userbackend.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Base64;
import java.util.List;
import java.util.Optional;

@Log4j2
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    private final JwtProvider jwtProvider;


    @Override
    public MessengerVO save(UserDTO t) {
        entityToDTO((repository.save(dtoToEntity(t))));
        return MessengerVO.builder().message("True").build();
    }

    @Override
    public MessengerVO modify(UserDTO t) {
        entityToDTO((repository.save(dtoToEntity(t))));
        return MessengerVO.builder().message("True").build();
    }

    @Override
    public MessengerVO deleteById(Long id) {
        repository.deleteById(id);
        return MessengerVO.builder()
                .message(repository.findById(id).isPresent() ? "SUCCESS" : "FAIL")
                .build();
    }

    @Override
    public List<UserDTO> findAll() {
        return repository.findAll().stream().map(i -> entityToDTO(i)).toList();
    }

    @Override
    public Optional<UserDTO> findById(Long id) {
        return repository.findById(id).map(i -> entityToDTO(i));
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public boolean existsById(Long id) {
        return repository.existsById(id);
    }


    @Override
    public MessengerVO changePassword(User user) {
        return null;
    }

    @Override
    public List<UserDTO> findUsersByName(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findUsersByName'");
    }

    @Override
    public List<UserDTO> findUsersByJob(String job) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findUsersByJob'");
    }


    @Override
    public Optional<User> findUserByUsername(String username) {
        return repository.findByUsername(username);
    }

    //단일책임원칙(SRP)에 따라 아이디 존재여부를 프론트에서 먼저 판단하고, 넘어옴 (시큐리티)
    @Transactional
    @Override
    public MessengerVO login(UserDTO dto) {
        var user = repository.findByUsername(dto.getUsername()).get();
        var accessToken = jwtProvider.createToken(entityToDTO(user));
        boolean flag = user.getPassword().equals(dto.getPassword());
        repository.modifyTokenById(user.getId(),accessToken);
        log.info(accessToken);

        // 토큰을 각 섹션(Header, Payload, Signature)으로 분할
        jwtProvider.printPayload(accessToken);

        return MessengerVO.builder()
                .message(flag ? "SUCCESS" : "FAILURE")
                .accessToken(flag ? accessToken : "None")
                .build();

    }
    @Transactional
    @Override
    public Boolean logout(String accessToken) {
        Long id = 7L;
        String deletedToken = "";
        repository.modifyTokenById(id,deletedToken);
        return repository.findById(id).get().getToken().equals("");
    }

    public MessengerVO findByUsername(String username) {
        return MessengerVO.builder().message(repository.findByUsername(username).isPresent() ? "True" : "False").build();
    }

}