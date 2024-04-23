package com.von.userbackend.common.component.security;

import com.von.userbackend.user.model.User;
import com.von.userbackend.user.model.UserDTO;
import com.von.userbackend.user.repository.UserRepository;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import io.jsonwebtoken.io.Decoders;

import javax.crypto.SecretKey;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Date;
import java.util.stream.Stream;

@Log4j2
@Component
public class JwtProvider {
    @Value("${jwt.iss}")
    private String issuer;

    private final SecretKey secretKey;

    Instant expiredDate = Instant.now().plus(1, ChronoUnit.DAYS);

    public JwtProvider(@Value("${jwt.secret}") String secretKey) {
        this.secretKey = Keys.hmacShaKeyFor(Decoders.BASE64.decode(secretKey));
    }

    public String createToken(UserDTO dto) {

        String token = Jwts.builder()
                .issuer(issuer)
                .signWith(secretKey)
                .expiration(new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000))
                .subject("von")
                .claim("username", dto.getUsername())
                .claim("job", dto.getJob())
                .claim("userId", dto.getId())
                .compact();

        log.info("로그인 성공, 발급된 토큰 : " + token);

        return token;
    }


    public String extractTokenFromHeader(HttpServletRequest request) {
        log.info("프론트에서 넘어온 리퀘스트 값 : {}", request.getServletPath());
        String bearerToken = request.getHeader("Authorization");
        log.info("프론트에서 넘어온 토큰 값 : {}", bearerToken);
        return bearerToken != null && bearerToken.startsWith("Bearer ") ?
                bearerToken.substring(7) : "undefined";

    }

    public void printPayload(String accessToken) {
        String[] chunks = accessToken.split("\\.");
        Base64.Decoder decoder = Base64.getDecoder();

        String header = new String(decoder.decode(chunks[0]));
        String payload = new String(decoder.decode(chunks[1]));

        log.info("Token header : " + header);
        log.info("Token payload : " + payload);

//        return new StringBuilder().append(header).append(payload).toString();

    }

    public Claims getPayload(String token) {
        return Jwts.parser().verifyWith(secretKey).build().parseSignedClaims(token).getPayload();
    }

//    public UserDTO getUserDTO(HttpServletRequest request) {
//        Long id = Stream.of(request)
//        .map(i -> this.extractTokenFromHeader(i))
//        .filter(token -> !token.equals("undefined"))
//        .peek(token -> log.info("1- 인터셉터 토큰 로그 Bearer 포함 : {}", token))
//        .map(token -> this.getPayload(token).get("userId", Long.class))
//        .findFirst()
//        .get();
//
//        return null;
//    }

}
