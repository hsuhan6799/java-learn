package com.xh.fristWebProject.controller;

import com.xh.fristWebProject.entity.User;
import com.xh.fristWebProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/users")
    public String getUsers(HttpServletRequest request, ModelMap map,@RequestParam(value = "name",required = false) String name) {
        List<User> users = userService.findByUsername(name);
        map.put("users", users);
        return "user";
    }
}
