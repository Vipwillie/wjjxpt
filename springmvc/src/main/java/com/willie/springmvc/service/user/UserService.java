package com.willie.springmvc.service.user;

import com.willie.springmvc.domain.User;

import java.util.List;

/**
 * Created by liang on 2016/12/18.
 */
public interface UserService {
    /**
     * 查询全部用户
     *
     * @return全部用户
     */
    List<User> findAll();

    /**
     * 根据用户名查询用户
     *
     * @param username 用户名
     * @return 用户
     */
    User findUserByAccount(String username);
}
