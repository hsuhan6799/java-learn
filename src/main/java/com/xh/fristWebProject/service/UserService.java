package com.xh.fristWebProject.service;

import com.xh.fristWebProject.entity.User;

import java.util.List;

public interface UserService {
    List<User> findByUsername();
}
