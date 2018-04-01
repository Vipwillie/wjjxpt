package com.willie.springmvc.service.user.impl;

import com.willie.springmvc.dao.user.UserDao;
import com.willie.springmvc.domain.User;
import com.willie.springmvc.service.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/2/2 11:35</p>
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }

    public User findUserByAccount(String username) {
        return userDao.findUserByAccount(username);
    }
}
