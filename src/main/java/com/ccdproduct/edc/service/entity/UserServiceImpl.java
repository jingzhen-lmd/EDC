package com.ccdproduct.edc.service.entity;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ccdproduct.edc.mapper.UserMapper;
import com.ccdproduct.edc.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
