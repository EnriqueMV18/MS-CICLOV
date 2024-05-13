package com.example.msauth.service.impl;

import com.example.msauth.dto.AuthDto;
import com.example.msauth.entity.Auth;
import com.example.msauth.entity.TokenDto;
import com.example.msauth.repository.AuthRepository;
import com.example.msauth.security.JwtProvider;
import com.example.msauth.service.AuthUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthUserServiceImpl implements AuthUserService {
    @Autowired
    AuthRepository authRepository;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    JwtProvider jwtProvider;


    @Override
    public Auth save(AuthDto authUserDto) {
        Optional<Auth> user = authRepository.findByUserName(authUserDto.getUserName());
        if (user.isPresent())
            return null;
        String password = passwordEncoder.encode(authUserDto.getPassword());
        Auth authUser = Auth.builder()
                .userName(authUserDto.getUserName())
                .password(password)
                .build();

        return authRepository.save(authUser);
    }

    @Override
    public TokenDto login(AuthDto authUserDto) {
        Optional<Auth> user = authRepository.findByUserName(authUserDto.getUserName());
        if (!user.isPresent())
            return null;
        if (passwordEncoder.matches(authUserDto.getPassword(), user.get().getPassword()))
            return new TokenDto(jwtProvider.createToken(user.get()));
        return null;
    }

    @Override
    public TokenDto validate(String token) {
        if (!jwtProvider.validate(token))
            return null;
        String username = jwtProvider.getUserNameFromToken(token);
        if (!authRepository.findByUserName(username).isPresent())
            return null;
        return new TokenDto(token);
    }
}


