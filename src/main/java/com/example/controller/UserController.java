package com.example.controller;

import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/hello")
    public User login(){
        return new User(2020,"liufa",24,"184363089");
    }
    @GetMapping("/getuser")
    public List<User> getUser(){
        return userService.findAll();
    }
    public void print(String s){
        System.out.println("liufa");
    }
}
