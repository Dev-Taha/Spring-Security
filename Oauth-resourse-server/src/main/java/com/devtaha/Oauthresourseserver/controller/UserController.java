package com.devtaha.Oauthresourseserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/api/users")
    public String[] getUsers(){
        return new String[] {"Taha","Ahmed","Omar"};
    }
}
