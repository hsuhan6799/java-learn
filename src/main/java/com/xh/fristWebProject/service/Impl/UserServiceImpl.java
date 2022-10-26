package com.xh.fristWebProject.service.Impl;

import com.xh.fristWebProject.entity.User;
import com.xh.fristWebProject.mapper.UserMapper;
import com.xh.fristWebProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findByUsername(String name) {
        return userMapper.getUserByUsername(name);
    }
}
