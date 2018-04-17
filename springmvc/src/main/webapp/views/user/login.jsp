<%--
  Created by IntelliJ IDEA.
  User: liang
  Date: 2016/12/18
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>广州武警教学系统</title>
    <%@ include file="/commons/public.jsp"%>
    <link type="text/css" rel="stylesheet" href="${CTX_PATH}/static/css/login/fluid.css">
</head>
<body>
    <div class="login-bg-top">
        <img src="${CTX_PATH}/static/images/login//u19.jpg"/>
        <h1>广州武警总队训练基地</h1>
        <h3>教学管理系统</h3>
    </div>

    <%--登录框--%>
    <div class="login">
        <div class="login-left">
            <div class="login-photo">
                <img src="${CTX_PATH}/static/images/login/u28.jpg"/>
            </div>
        </div>
        <div class="mid-line"></div>
        <div class="login-right text-center">
            <form id="dologin" action="${CTX_PATH}/login" method="post">
                <h4>用户登录</h4>
                <input id="account" class="inputBox inputCon" type="text" name="account" autocomplete="off"><br/>
                <img class="userId-logo" src="${CTX_PATH}/static/images/login/u65.png">
                <img class="userId-del" src="${CTX_PATH}/static/images/login/u57.png">
                <input id="password" class="inputBox inputCon" type="password" name="password"><br/>
                <img class="userpw-logo" src="${CTX_PATH}/static/images/login/u63.png">
                <img class="userpw-del" src="${CTX_PATH}/static/images/login/u57.png">
                <input class="inputBox button" type="submit" value="登录"/><br/>
                <input style="margin: 4px 4px 0;" class="checkBox" name="rememberMe" type="checkbox" value="false"/><span>记住账号</span>
                <p><a href="#">忘记密码？</a></p>
            </form>
        </div>
    </div>

    <%--底部--%>
    <div class="login-bg-bottom">
        <p>copyright @ 2016-2017EPTIME Cn,ALL Rights Reserved,教学管理系统v1.0</p>
    </div>

    <%--js--%>
    <script type="text/javascript">
        // 用户名校验
        $("#account").change(function () {

        })

        //密码校验
        $("#password").change(function () {

        })

        // 登录
        function doLogin() {

        }

    </script>
</body>
</html>
