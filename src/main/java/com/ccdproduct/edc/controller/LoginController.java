package com.ccdproduct.edc.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ccdproduct.edc.pojo.User;
import com.ccdproduct.edc.service.entity.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录
 */
@RestController
public class LoginController {

    @Autowired
    private UserService service;

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userName", user.getUserName());
        queryWrapper.eq("passWord", user.getPassWord());

        User one = service.getOne(queryWrapper);
        return one;
    }
}
