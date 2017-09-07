package com.song.dao;

import com.song.pojo.User;

public interface IUserDao {

    int insert(User record);


    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}