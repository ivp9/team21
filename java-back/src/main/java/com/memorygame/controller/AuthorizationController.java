package com.memorygame.controller;

import com.memorygame.model.LoginFormMain;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class AuthorizationController {

    @PostMapping(value = "login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String login(@RequestBody LoginFormMain loginFormMain) {
        UUID uuid = UUID.randomUUID();
        return loginFormMain.getEmail() + " " + loginFormMain.getPassword() + " " + uuid;
    }
}
