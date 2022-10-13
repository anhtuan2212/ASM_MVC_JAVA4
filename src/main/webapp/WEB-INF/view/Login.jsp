<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng Nhập</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<style>
* {
	box-sizing: border-box;
	-moz-box-sizing: border-box;
	-webkit-box-sizing: border-box;
	font-family: arial;
}

body {
	background: red;
}

h1 {
	color: #ccc;
	text-align: center;
	font-family: 'Vibur', cursive;
	font-size: 50px;
}

.login-form {
	width: 350px;
	padding: 40px 30px;
	background: #eee;
	margin: auto;
	border: 1px solid #fff;
	position: absolute;
	left: 0;
	right: 0;
	top: 10%;
}

.form-group {
	position: relative;
	margin-bottom: 15px;
}

.form-control {
	width: 100%;
	height: 50px;
	border: none;
	padding: 5px 7px 5px 15px;
	background: #fff;
	color: #666;
	border: 2px solid #ddd;
}

.form-group .mdi {
	position: absolute;
	right: 15px;
	top: 17px;
	color: #999;
}

.mdi {
	top: 13px !important;
	color: #0AC986 !important;
}

.form-control:focus {
	background-color: #fff;
	border-color: #fff !important;
	outline: none;
	box-shadow: none;
}

.log-status.wrong-entry .form-control, .wrong-entry .form-control+.mdi {
	border-color: #ed1c24;
	color: #ed1c24;
}

.log-btn {
	background: #0AC986;
	display: inline-block;
	width: 100%;
	font-size: 16px;
	height: 50px;
	color: #fff;
	text-decoration: none;
	border: none;
}

.link {
	text-decoration: none;
	color: #C6C6C6;
	float: right;
	font-size: 12px;
	margin-bottom: 15px;
}

.alert {
	display: none;
	font-size: 12px;
	color: #f00;
	float: left;
}

a {
	text-decoration: none !important;
}

#video_background {
	position: absolute;
	bottom: 0px;
	right: 0px;
	min-width: 100%;
	min-height: 100%;
	width: auto;
	height: auto;
	z-index: -1000;
	overflow: hidden;
}

#formlogin {
	top: 35%;
}
</style>

	<div>
		<video id="video_background"
			src="https://webstatic.hoyoverse.com/upload/contentweb/2022/03/08/9161410d38a10ffee50d1111a1f12a78_3021467832140208775.mp4"
			muted="muted" loop="loop" autoplay="autoplay"
			poster="https://webstatic.hoyoverse.com/upload/uploadstatic/contentweb/20210803/2021080317082766109.jpg"
			class="bg-video"></video>
	</div>
	<form action="/PH14249/login" method="POST">
		<div class="login-form" id="formlogin">
			<h1>Login</h1>
			<div class="form-group ">
				<input type="text" class="form-control" placeholder="User"
					name="username" required> <i class="mdi mdi-account" ></i>
			</div>
			<div class="form-group log-status">
				<input type="password" class="form-control" placeholder="Password"
					name="password" required> <i class="mdi mdi-lock"></i>
			</div>
			<label> <p>${error}</p> </label>
			 <a class="link"
				href="/PH14249/register">Đăng Ký</a>
			<button class="btn btn-success" type="submit">Đăng Nhập</button>
		</div>
	</form>

</body>
</html>