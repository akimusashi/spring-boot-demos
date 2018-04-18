package com.moon.angulartest01.controller;

import com.moon.angulartest01.dao.UserMapper;
import com.moon.angulartest01.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    private final UserMapper userMapper;

    @Autowired
    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @RequestMapping(value = "/find-all")
    public List<UserEntity> findAllUserWithAgeOrder() {
        return userMapper.findAllUserWithAgeOrder();
    }

    @RequestMapping(value = "/find-by-id")
    public UserEntity findUserById(Integer id) {
        return userMapper.findUserById(id);
    }
}
