package com.example.service;

import com.example.domain.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired(required = false)
    private UserMapper userMapper;

    public List<User> findAll(){
        return userMapper.findAll();
    }
}
