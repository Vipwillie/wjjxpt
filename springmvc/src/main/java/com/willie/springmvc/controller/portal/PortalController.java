package com.willie.springmvc.controller.portal;

import com.willie.springmvc.base.ExceptionTypeEnum;
import com.willie.springmvc.controller.base.BaseController;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by liang on 2016/12/18.
 */
@Controller
@RequestMapping("/portal")
public class PortalController extends BaseController {
    private static final String LOGIN_PAGE = "/user/login";//登录页面
    private static final String INDEX = "index";//系统首页

    /**
     * 首页跳转
     *
     * @return 跳转到登录界面
     */
    @RequestMapping("/index")
    public String index() {
        return LOGIN_PAGE;
    }

    /**
     * 登录页面
     *
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam(value = "account", required = true) String account, @RequestParam(value = "password", required = true) String password, @RequestParam(value = "rememberMe") Boolean rememberMe, Model model) {
        if (!StringUtils.hasText(account)) {
            logger.info("帐号为空！");
            model.addAttribute("msg", "登录帐号不能为空！");
            return LOGIN_PAGE;
        }

        if (!StringUtils.hasText(password)) {
            logger.info("密码为空!");
            model.addAttribute("msg", "登录密码不能为空！");
            return LOGIN_PAGE;
        }

        UsernamePasswordToken token = new UsernamePasswordToken(account, password, rememberMe);

        try {
            SecurityUtils.getSubject().login(token);
        } catch (UnknownAccountException uae) {
            logger.error("帐号异常！", uae);
            model.addAttribute("msg", "帐号异常！");
            return LOGIN_PAGE;
        } catch (IncorrectCredentialsException ice) {
            logger.error("密码错误!", ice);
            model.addAttribute("msg", "密码错误！");
            return LOGIN_PAGE;
        } catch (AuthenticationException ae) {
            logger.error("认证异常！", ae);
            model.addAttribute("msg", "认证异常！");
            return LOGIN_PAGE;
        } catch (Exception e) {
            logger.error(ExceptionTypeEnum.UN_KNOW_EXCEPTION.getMessage(), e);
            model.addAttribute("msg", ExceptionTypeEnum.UN_KNOW_EXCEPTION.getMessage());
            return LOGIN_PAGE;
        }
        return INDEX;
    }

    /**
     * 退出登录
     *
     * @return
     */
    public String logout() {
        SecurityUtils.getSubject().logout();
        return LOGIN_PAGE;
    }
}
