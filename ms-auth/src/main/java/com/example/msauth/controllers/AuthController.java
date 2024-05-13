package com.example.msauth.controllers;

import com.example.msauth.dto.AuthDto;
import com.example.msauth.entity.Auth;
import com.example.msauth.entity.TokenDto;
import com.example.msauth.service.AuthUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    AuthUserService authUserService;


    @PostMapping("/login")
    public ResponseEntity<TokenDto> login(@RequestBody AuthDto authUserDto) {
        TokenDto tokenDto = authUserService.login(authUserDto);
        if (tokenDto == null)
            return ResponseEntity.badRequest().build();
        return ResponseEntity.ok(tokenDto);
    }


    @PostMapping("/validate")
    public ResponseEntity<TokenDto> validate(@RequestParam String token) {
        TokenDto tokenDto = authUserService.validate(token);
        if (tokenDto == null)
            return ResponseEntity.badRequest().build();
        return ResponseEntity.ok(tokenDto);
    }


    @PostMapping("/create")
    public ResponseEntity<Auth> create(@RequestBody AuthDto authUserDto) {
        Auth authUser = authUserService.save(authUserDto);
        if (authUser == null)
            return ResponseEntity.badRequest().build();
        return ResponseEntity.ok(authUser);
    }
}
