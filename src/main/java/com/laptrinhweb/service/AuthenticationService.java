package com.laptrinhweb.service;

import com.laptrinhweb.repository.UserRepo;
import com.laptrinhweb.security.CustomUserDetails;
import com.laptrinhweb.Dto.auth.AuthenticationRequest;
import com.laptrinhweb.Dto.auth.AuthenticationResponse;
import com.laptrinhweb.Dto.auth.AuthenticationResponse;
import com.laptrinhweb.Dto.auth.AuthenticationRequest;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepo userRepo;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;

    public AuthenticationResponse authenticate(AuthenticationRequest authenticationRequest){
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getEmail(),authenticationRequest.getPassword()));
        CustomUserDetails user = new CustomUserDetails(userRepo.findByEmail(authenticationRequest.getEmail()).orElseThrow());
        if(user!=null){
            String role=user.getAuthorities().toString();
        }
        var jwtToken = jwtService.generateToken(user);
        var jwtRefreshToken = jwtService.generateRefreshToken(user);
        return AuthenticationResponse.builder().token(jwtToken).refreshToken(jwtRefreshToken).build();
    }
}
