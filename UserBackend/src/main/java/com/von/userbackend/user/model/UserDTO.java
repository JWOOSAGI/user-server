package com.von.userbackend.user.model;

import org.springframework.stereotype.Component;
import lombok.*;

@Component
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO  {
    private Long id;
    private String username;
    private String password;
    private String name;
    private String phone;
    private String email;
    private String job;
    private String regDate;
    private String modDate;
    private String token;
}