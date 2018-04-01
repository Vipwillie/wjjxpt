package com.willie.springmvc.dao.user;

import com.willie.springmvc.dao.BaseDao;
import com.willie.springmvc.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Created by liang on 2016/11/23.
 */
@Repository("userDao")
public interface UserDao extends BaseDao<User> {
    /**
     * 根据用户名查询用户
     *
     * @param username 用户名
     * @return 用户
     */
    User findUserByAccount(String username);
}
