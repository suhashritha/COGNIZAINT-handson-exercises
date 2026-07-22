package com.cognizant.jwtauthenticationservice.util;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

import org.springframework.stereotype.Component;


@Component
public class JwtUtil {


    private String secret =
            "mysecretkey";


    public String generateToken(String username){


        return Jwts.builder()

                .setSubject(username)

                .setIssuedAt(new Date())

                .setExpiration(
                        new Date(System.currentTimeMillis()
                                +1000*60*60))

                .signWith(
                        SignatureAlgorithm.HS256,
                        secret)

                .compact();

    }

}
