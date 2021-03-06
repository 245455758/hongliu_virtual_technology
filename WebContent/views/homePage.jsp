<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>homePage</title>
    <script src="../../Tools-Box/bootstrap/dist/js/jquery-3.2.1.min.js"></script>
    <script src="../../Tools-Box/bootstrap/dist/js/bootstrap.min.js"></script>
    <script src="../../js/homePage.js"></script>
    <!-- /HongLiuTechnology/WebContent/Tools-Box/bootstrap/dist/js/bootstrap.min.js -->
    <link rel="stylesheet" href="../Tools-Box/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../Tools-Box/bootstrap/dist/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="../Tools-Box/animate.css/animate.min.css">
    <link rel="stylesheet" href="../Tools-Box/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="../css/homePage.css">
</head>
<body>
	<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="jumbotron">
                <h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${sessionScope.user.username }, welcome to hongliu virtual site.</h1>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-sm-6 col-md-4">
            <a href="${pageContext.request.contextPath }/noticeAction_showAllNotices" class="navigation">
                <div class="thumbnail">
                    <img src="../img/circle1.jpg" alt="首页图" class="img-responsive">
                    <div class="caption">
                        <h3 class="text-center">首页</h3>
                    </div>
                </div>
            </a>
        </div>
        <div class="col-sm-6 col-md-4">
            <a href="${pageContext.request.contextPath }/intoForum" class="navigation">
                <div class="thumbnail">
                    <img src="../img/circle2.jpg" alt="论坛图" class="img-responsive">
                    <div class="caption">
                        <h3 class="text-center">论坛</h3>
                    </div>
                </div>
            </a>
        </div>
        <div class="col-sm-6 col-md-4">
            <a href="${pageContext.request.contextPath }/noticeAction_showAllNotices" class="navigation">
                <div class="thumbnail">
                    <img src="../img/circle3.jpg" alt="其他图" class="img-responsive">
                    <div class="caption">
                        <h3 class="text-center">其他</h3>
                    </div>
                </div>
            </a>
        </div>
    </div>
    <div class="row">
        <div class="col-md-1">
            <i class="fa fa-tags fa-5x fa-spin" aria-hidden="true"></i>
        </div>
        <div class="col-md-6">
            <span><h2>红柳简介</h2></span>
        </div>
    </div>
    <div class="row">
        <div class="col-md-10 col-md-offset-1">
            <h4>
                红柳虚拟是由一群对编程有兴趣的学长一起创办的一个社团，社团创建之初是用来进行编程学习的分享，后来演变成用来跟学弟学妹分享自己的学习经验并且教授学弟学妹编程知识的学术性社团。
            </h4>
        </div>
    </div>
    <div class="row footer">
        <div class="col-md-4">
            <i class="fa fa-users fa-5x users" aria-hidden="true"></i>
            <br>
            <br>
            <br>
            <span><h2>网站开发人员介绍</h2></span>
            <h3 style="color: #0B6DE9; opacity: 0.8;text-indent: 2em">前端工程师：王彬林(右)</h3>
            <h3 style="color: #0B6DE9; opacity: 0.8;text-indent: 2em">后端工程师：储亚波(左)</h3>
            <br>
            <br>
            <br>
            <a href="https://github.com/bigbigDreamer/Philippine-Virtual-Front-Page">
                <span>前端代码仓库<i class="fa fa-github fa-5x github" aria-hidden="true"></i></span>
            </a>
            <a href="">
                <span>后端代码仓库<i class="fa fa-github fa-5x github" aria-hidden="true"></i></span>
            </a>
        </div>
        <div class="col-md-4">
            <img src="../img/Person-bobo.jpg" alt="储亚波" class="img-responsive person">
            <br>
            <figcaption class="text-center">
                <a href="">
                    <i class="fa fa-weixin fa-4x weixin" aria-hidden="true"></i>
                </a>
                <span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
                <a href="">
                    <i class="fa fa-qq fa-4x qq" aria-hidden="true"></i>
                </a>
            </figcaption>

        </div>
        <div class="col-md-4">
            <img src="../img/Person-binbin.jpg" alt="王彬林" class="img-responsive person">
            <br>
            <figcaption class="text-center">
                <a href="">
                    <i class="fa fa-weixin fa-4x weixin" aria-hidden="true"></i>
                </a>
                <span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
                <a href="">
                    <i class="fa fa-qq fa-4x qq" aria-hidden="true"></i>
                </a>
            </figcaption>
        </div>
    </div>
    <br>
    <div class="row">
        <div class="col-md-12 version text-center">
            <span>@兰州理工大学红柳虚拟科技官网&nbsp;&nbsp;&nbsp;2018</span>
            <br>
            <span>本网站受法律保护，未在网站工作人员许可下禁止复用</span>
            <br>
            陇ICP备案号:-1825069&nbsp;&nbsp;&nbsp;甘公网备案号：-895445
        </div>
    </div>
</div>
</body>
</html>