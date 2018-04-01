package com.willie.springmvc.base;

import com.willie.springmvc.domain.User;
import com.willie.springmvc.service.user.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/2/2 16:01</p>
 */
public class MyRealm extends AuthorizingRealm {
    @Autowired
    private UserService userService;

    /**
     * 授权
     *
     * @param principalCollection
     * @return
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.addRoles(Arrays.asList("role1", "admin"));
        simpleAuthorizationInfo.addStringPermissions(Arrays.asList("user:create", "user:update"));
        return simpleAuthorizationInfo;
    }

    /**
     * 校验
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = (String) authenticationToken.getPrincipal();//得到用户名
        String password = new String((char[]) authenticationToken.getCredentials());

        //这里需要对传过来的密码进行加密处理,然后对比密码进行校验,具体操作暂且省略

        User user = userService.findUserByAccount(username);//取得用户名

        if (!user.getName().equals(username)) {
            throw new UnknownAccountException();//用户错误
        }

        if (!user.getPassword().equals(password)) {
            throw new IncorrectCredentialsException();//密码错误
        }

        //如果身份验证成功，返回一个AuthenticationInfo
        return new SimpleAuthenticationInfo(username, password, getName());
    }
}
