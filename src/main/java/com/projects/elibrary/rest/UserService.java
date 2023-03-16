package com.projects.elibrary.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {

    @GetMapping("/")
    public String index(){
        return "Welcome to home page of library!";
    }
}