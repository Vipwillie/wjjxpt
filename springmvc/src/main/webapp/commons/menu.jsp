<%--
  Created by IntelliJ IDEA.
  User: liang
  Date: 2017/1/8
  Time: 13:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span2">
            <div class="slidebar-tit"></div>
            <div class="panel-group" id="accordion">
                <div class="panel panel-default">
                    <div class="panel-heading" id="personal" style="background-color: #EEEEEE;">
                        <a data-parent="#accordion"
                           href="#collapse1">
                            <img src="${CTX_PATH}/images/index/u39.png" class="img">
                            个人中心
                        </a>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <a data-parent="#accordion"
                           href="#collapse2">
                            <img src="${CTX_PATH}/images/index/u27.png" class="img">
                            信息输入
                        </a>
                    </div>
                    <div id="collapse2" class="panel-collapse collapse">
                        <div class="panel-body">
                            <ul>
                                <li>
                                    <a href="#home" aria-controls="home" role="tab" data-toggle="tab">课程安排</a>
                                </li>
                                <li>
                                    <a href="#dom" aria-controls="home" role="tab" data-toggle="tab">考核安排</a>
                                </li>
                                <li>
                                    <a href="#classManage" aria-controls="home" role="tab" data-toggle="tab">课堂管理</a>
                                </li>
                                <li>
                                    <a href="#classGrade" aria-controls="home" role="tab" data-toggle="tab">课程成绩</a>
                                </li>
                                <li>
                                    <a href="#checkGrade" aria-controls="home" role="tab" data-toggle="tab">考核成绩</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <a data-parent="#accordion"
                           href="#collapse3">
                            <img src="${CTX_PATH}/images/index/u29.png" class="img">
                            教学查询
                        </a>
                    </div>
                    <div id="collapse3" class="panel-collapse collapse">
                        <div class="panel-body">
                            <ul>
                                <li>
                                    <a href="#classT" aria-controls="home" role="tab" data-toggle="tab">课程表</a>
                                </li>
                                <li>
                                    <a href="#classNews" aria-controls="home" role="tab" data-toggle="tab">课程信息</a>
                                </li>
                                <li>
                                    <a href="#checkNews" aria-controls="home" role="tab" data-toggle="tab">考核信息</a>
                                </li>
                                <li>
                                    <a href="#joinC" aria-controls="home" role="tab" data-toggle="tab">课堂管理</a>
                                </li>
                                <li>
                                    <a href="#joinC" aria-controls="home" role="tab" data-toggle="tab">课程成绩</a>
                                </li>
                                <li>
                                    <a href="#joinC" aria-controls="home" role="tab" data-toggle="tab">考核成绩</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <a data-parent="#accordion"
                           href="#collapse4">
                            <img src="${CTX_PATH}/images/index/u31.png" class="img">
                            统计分析
                        </a>
                    </div>
                    <div id="collapse4" class="panel-collapse collapse">
                        <div class="panel-body">
                            <ul>
                                <li>
                                    <a href="#joinC" aria-controls="home" role="tab" data-toggle="tab">参课率</a>
                                </li>
                                <li>
                                    <a href="#home" aria-controls="home" role="tab" data-toggle="tab">课程统计</a>
                                </li>
                                <li>
                                    <a href="#home" aria-controls="home" role="tab" data-toggle="tab">单课成绩</a>
                                </li>
                                <li>
                                    <a href="#home" aria-controls="home" role="tab" data-toggle="tab">全课成绩</a>
                                </li>
                                <li>
                                    <a href="#home" aria-controls="home" role="tab" data-toggle="tab">个人战力</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>