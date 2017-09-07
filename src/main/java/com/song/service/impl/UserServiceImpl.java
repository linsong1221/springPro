package com.song.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.song.dao.IUserDao;
import com.song.pojo.User;
import com.song.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;
    @Override
    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(userId);
    }

}
