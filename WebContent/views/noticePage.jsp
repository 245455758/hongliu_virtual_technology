<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
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
<script>
        function informDisplay(id){//测试id是你jsp页面传过来的，遍历的时候一定传给函数，然后在span中根据显示获取就行了。
         //alert("你点我干嘛")
          $.post("${pageContext.request.contextPath }/NoticeAjaxJsonExecution",{id:id},function (data) {
              console.log(data)
              $("#notice_"+id).after(
                  "<br><span>内容:"+data.context+"</span><br>"+
                  "<span>发布者:"+data.publisher+"</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
                  "<span>发布时间:"+data.time+"</span>"
              )
          })
      }
        function exerciseDisplay(id){
            $.post("${pageContext.request.contextPath }/ExerciseAjaxJsonExecution",{id:id},function (data) {
                console.log(data)
                $("#exercise_"+id).after(
                  "<br><span>内容:"+data.context+"</span><br>"+
                  "<span><a href="+data.url+">题目链接"+"</a></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
                  "<span>发布时间:"+data.time+"</span>"
              )
            })
        }
        function jobDisplay(id){
            $.post("${pageContext.request.contextPath }/HomeworkAjaxJsonExecution",{id:id},function (data) {
                console.log(data)
                $("#homework_"+id).after(
                  "<br><span>内容:"+data.context+"</span><br>"+
                  "<span>发布者:"+data.publisher+"</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
                  "<span>发布时间:"+data.time+"</span><br/>"+
                  "<span>电子邮箱:"+data.email+"</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
                  "<span>附件:"+data.file+"</span>"
              )
            })
        }
    </script>
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
								<li>
									<s:property value="#ns.count"/>:
									<a href="javascript:informDisplay(<s:property value='#notice.notice_id'/>)" id="notice_<s:property value='#notice.notice_id'/>">
										<s:property value="#notice.title"/>
									</a>
								</li>
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
								<li>
									<a href="javascript:exerciseDisplay(<s:property value='#exercise.exercise_id'/>)" id="exercise_<s:property value='#exercise.exercise_id'/>">
										<s:property value="#ec.count"/>:<s:property value="#exercise.title"/>
									</a>
								</li>
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
								<li>
									<a href="javascript:jobDisplay(<s:property value='#homework.homework_id'/>)" id="homework_<s:property value='#homework.homework_id'/>">
										<s:property value="#hw.count"/>:<s:property value="#homework.title"/>
									</a>
								</li>
							</s:iterator>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>

</html>