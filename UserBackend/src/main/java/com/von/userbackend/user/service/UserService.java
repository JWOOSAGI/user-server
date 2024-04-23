package com.von.userbackend.user.service;

import com.von.userbackend.common.component.MessengerVO;
import com.von.userbackend.common.service.CommandService;
import com.von.userbackend.common.service.QueryService;
import com.von.userbackend.user.model.User;
import com.von.userbackend.user.model.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserService extends CommandService<UserDTO>, QueryService<UserDTO> {
    MessengerVO changePassword(User user);
    List<UserDTO> findUsersByName(String name);
    List<UserDTO> findUsersByJob(String job);
    Optional<User> findUserByUsername(String username);

    default User dtoToEntity(UserDTO dto){
        return User.builder()
                .id(dto.getId())
                .username(dto.getUsername())
                .password(dto.getPassword())
                .name(dto.getName())
                .phone(dto.getPhone())
                .job(dto.getJob())
                .build();
    }

    default UserDTO entityToDTO(User user){
        return UserDTO.builder()
                .id(user.getId())
                .username(user.getUsername())
                .password(user.getPassword())
                .name(user.getName())
                .phone(user.getPhone())
                .job(user.getJob())
                .build();
    }
    MessengerVO login(UserDTO param);
    Boolean logout(Long id);

    // default UserDto entityToDto(Optional<User> optional){
    //     return UserDto.builder().build();
    // }
}
