package com.example.msauth.service;

import com.example.msauth.dto.AuthDto;
import com.example.msauth.entity.Auth;
import com.example.msauth.entity.TokenDto;

public interface AuthUserService {
    public Auth save(AuthDto authDto);


    public TokenDto login(AuthDto authDto);


    public TokenDto validate(String token);
}
