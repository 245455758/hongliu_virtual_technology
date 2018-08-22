<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1"/>
	<title>Login&RegisterPage</title>
    <script src="../Tools-Box/bootstrap/dist/js/jquery-3.2.1.min.js"></script>
    <script src="../Tools-Box/bootstrap/dist/js/bootstrap.min.js"></script>
    <script src="../js/index.js"></script>
    <link rel="stylesheet" href="../Tools-Box/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../Tools-Box/bootstrap/dist/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="../Tools-Box/animate.css/animate.min.css">
    <link rel="stylesheet" href="../Tools-Box/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="../css/index.css">
</head>
<body>
<div class="container">
    <div class="row login-panel">
        <div class="col-md-6 col-md-offset-3">
            <div class="panel panel-info">
                <div class="panel-heading">
                    <div class="tablist text-center">
                    	${sessionScope.register_failed }
                    	<br/>
                        <a href="#" id="login">Login</a>
                        <span>|</span>
                        <a href="#" id="register">Enroll</a>
                    </div>
                </div>
                <div class="panel-body login-body">
                    <form action="${pageContext.request.contextPath }/userAction_login" id="Login-Form">
                        <div class="row">
                            <div class="form-group">
                                <div class="col-md-1 col-md-offset-1 col-sm-1">
                                    <label for="username">
                                        <i class="fa fa-user fa-fw fa-2x" aria-hidden="true">
                                        </i>
                                    </label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="form-control" id="studentId" name="studentId" placeholder="username">
                                </div>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="form-group">
                                <div class="col-md-1 col-md-offset-1 col-sm-1">
                                    <label for="password">
                                        <i class="fa fa-unlock-alt fa-fw fa-2x" aria-hidden="true">
                                        </i>
                                    </label>
                                </div>
                                <div class="col-md-8">
                                    <input type="password" class="form-control" id="password" name="password" placeholder="password">
                                    <br/>
                                    <span id="message" style="color:red">${sessionScope.login_failed }</span>
                                </div>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="col-md-6 col-md-offset-6">
                                <button class="btn btn-default" type="button" style="width: 100px;" id="Login-Button">
                                    <i class="fa fa-paper-plane fa-fw fa-2x" aria-hidden="true"></i>
                                    Login
                                </button>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="panel-body Register-body">
                    <form action="${pageContext.request.contextPath }/userAction_register" id="Enroll-Form">
                        <div class="row">
                            <div class="form-group">
                                <div class="col-md-1 col-md-offset-1 col-sm-1">
                                    <label for="StuNumber">
                                        <i class="fa fa-graduation-cap fa-fw fa-2x" aria-hidden="true">
                                        </i>
                                    </label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="form-control" id="studentId" name="studentId" placeholder="Student Number">
                                </div>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="form-group">
                                <div class="col-md-1 col-md-offset-1 col-sm-1">
                                    <label for="Rusername">
                                        <i class="fa fa-user fa-fw fa-2x" aria-hidden="true">
                                        </i>
                                    </label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="form-control" id="username" name="username" placeholder="username">
                                </div>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="form-group">
                                <div class="col-md-1 col-md-offset-1 col-sm-1">
                                    <label for="Rpassword">
                                        <i class="fa fa-unlock-alt fa-fw fa-2x" aria-hidden="true">
                                        </i>
                                    </label>
                                </div>
                                <div class="col-md-8">
                                    <input type="password" class="form-control" id="password" name="password" placeholder="password">
                                </div>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="form-group">
                                <div class="col-md-1 col-md-offset-1 col-sm-1">
                                    <label for="Telephone">
                                        <i class="fa fa-mobile fa-fw fa-2x" aria-hidden="true">
                                        </i>
                                    </label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="form-control" id="telephone" name="telephone" placeholder="Telephone">
                                </div>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="col-md-6 col-md-offset-6">
                                <button class="btn btn-default" type="button" style="width: 100px;" id="Enroll-Button">
                                    <i class="fa fa-paper-plane-o fa-fw fa-2x" aria-hidden="true"></i>
                                    Enroll
                                </button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>