package com.laptrinhweb.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.laptrinhweb.security.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class JwtService {
    private static final String Secret_key="123";
    public String generateToken(CustomUserDetails user){
        Algorithm algorithm = Algorithm.HMAC256(Secret_key.getBytes());
        return JWT.create()
                .withSubject(user.getUsername())
                .withExpiresAt(new Date(System.currentTimeMillis()+50*60*1000))
                .withClaim("role", String.valueOf(user.getAuthorities()))
                .sign(algorithm);
    }
    public String generateRefreshToken(CustomUserDetails user){
        Algorithm algorithm = Algorithm.HMAC256(Secret_key.getBytes());
        return JWT.create()
                .withSubject(user.getUsername())
                .withExpiresAt(new Date(System.currentTimeMillis()+50*60*1000))
                .sign(algorithm);
    }
}
