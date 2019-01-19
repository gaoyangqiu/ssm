package com.test.ssm.dao;

import com.test.ssm.model.user;

public interface userMapper {
    int deleteByPrimaryKey(Long uid);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(Long uid);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);
}