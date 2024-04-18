package com.von.userbackend.common.component;

import com.von.userbackend.user.model.UserDTO;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import io.jsonwebtoken.io.Decoders;
import javax.crypto.SecretKey;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@Log4j2
@Component
public class JwtProvider {
    @Value("${jwt.iss}")
    private String issuer;

    private final SecretKey secretKey;
    Instant expiredDate = Instant.now().plus(1, ChronoUnit.DAYS);

    public JwtProvider(@Value("${jwt.secret}")String secretKey){
        this.secretKey = Keys.hmacShaKeyFor(Decoders.BASE64.decode(secretKey));
    }

    public String createToken(UserDTO dto){

        String token = Jwts.builder()
                .issuer(issuer)
                .signWith(secretKey)
                .expiration(new Date(System.currentTimeMillis()+24*60*60*1000))
                .subject("von")
                .claim("username", dto.getUsername())
                .claim("job", dto.getJob())
                .claim("userId", dto.getId())
                .compact();

        log.info("로그인 성공, 발급된 토큰 : "+token);

        return token;
    }



}
