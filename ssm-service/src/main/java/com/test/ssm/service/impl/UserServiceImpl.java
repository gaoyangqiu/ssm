package com.test.ssm.service.impl;

import com.test.ssm.dao.userMapper;
import com.test.ssm.model.user;
import com.test.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 72038667
 * @Date: 2019/1/17 18:43
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private userMapper mapper;
    public int insert(user user) {
        return mapper.insert(user);
    }
}
