<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>noticePage</title>
<script src="../Tools-Box/bootstrap/dist/js/jquery-3.2.1.min.js"></script>
<script src="../Tools-Box/bootstrap/dist/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="../Tools-Box/bootstrap/dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="../Tools-Box/bootstrap/dist/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="../Tools-Box/animate.css/animate.min.css">
<link rel="stylesheet"
	href="../Tools-Box/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="../css/noticePage.css">
<title>Insert title here</title>
</head>
<body>
<s:debug/>
	<nav class="navbar " role="navigation">
	<div class="container">
		<div class="navbar-header">
			<span class="navbar-brand">Philippine virtual</span>
		</div>
		<div class="navbar-right">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><span class="glyphicon glyphicon-user"></span>个人信息</a></li>
				<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
						退出</a></li>
			</ul>
		</div>
	</div>
	</nav>
	<div class="container">
		<hr>
		<div class="row">
			<div class="col-md-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							<i class="fa fa-tags" aria-hidden="true"></i>通知
						</h3>
					</div>
					<div class="panel-body">
						<ul>
						 	<s:iterator value="#session.notices" var="notice" status="ns">
								<li><s:property value="#ns.count"/>:<s:property value="#notice.title"/></li>
							</s:iterator> 
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							<i class="fa fa-sticky-note" aria-hidden="true"></i>练习
						</h3>
					</div>
					<div class="panel-body">
						<ul>
							<s:iterator value="#session.exercises" var="exercise" status="ec">
								<li><s:property value="#ec.count"/>:<s:property value="#exercise.title"/></li>
							</s:iterator>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							<i class="fa fa-tasks" aria-hidden="true"></i>作业
						</h3>
					</div>
					<div class="panel-body">
						<ul>
							<s:iterator value="#session.homeworks" var="homework" status="hw">
								<li><s:property value="#hw.count"/>:<s:property value="#homework.title"/></li>
							</s:iterator>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>