<%--
  Created by IntelliJ IDEA.
  User: liang
  Date: 2016/12/18
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>基地管理系统首页</title>
    <%@ include file="/commons/public.jsp" %>
    <link rel="stylesheet"
          href="${CTX_PATH}/static/css/nav/nav.css">
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class=".col-lg-12 nav">
            <%@include file="/commons/nav.jsp" %>
        </div>
    </div>
    <div>
        <div class=".col-lg-3">
            <%@include file="/commons/menu.jsp" %>
        </div>
        <div class="content">

        </div>
    </div>
    <div class="foot"></div>
</div>
</body>
</html>
