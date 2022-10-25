package com.xh.fristWebProject.mapper;

import com.xh.fristWebProject.entity.User;
import com.xh.fristWebProject.service.UserService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
   List<User> getUserByUsername();
}
