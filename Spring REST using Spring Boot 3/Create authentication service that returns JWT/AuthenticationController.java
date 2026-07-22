package com.cognizant.jwtauthenticationservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public Map<String,String> authenticate() {

        Map<String,String> response = new HashMap<>();

        response.put("token",
                "eyJhbGciOiJIUzI1NiJ9.fake-token");

        return response;
    }
}
