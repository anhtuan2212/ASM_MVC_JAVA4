<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LUTLPH14249</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body class="container">
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="/PH14249/index">Trang Chủ</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarScroll"
				aria-controls="navbarScroll" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarScroll">
				<ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll"
					style="-bs-scroll-height: 100px;">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
					<li class="nav-item dropdown"><a class="nav-link"
						href="/PH14249/login" style="display: flex; right: 10px">Đăng
							Nhập</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="mt-4">
		<div class="col-6">
			<h3>
				<c:if test="${empty name}">Chưa Đăng Nhập</c:if>
				<c:if test="${!empty name}">Họ Tên: ${name}</c:if>
				<c:if test="${!empty rlx}"> Quản Trị</c:if>
			</h3>
		</div>
		<div class="col-6"></div>
	</div>
	<conten>
	<h1 style="text-align: center; color: blue;">Danh Sách Sinh Viên</h1>
	<c:if test="${empty sinhviens}">
		<h1>Không Có Dữ Liệu</h1>
	</c:if> <c:if test="${!empty sinhviens}">
		<table class="table table-light">
			<tr>
				<th>Mã Sinh Viên</th>
				<th>Họ Tên</th>
				<th>Giới Tính</th>
				<th>Ngày Sinh</th>
				<th>Người Tạo</th>
				<th>Ngày Tạo</th>
				<th>Người Chỉnh Sửa Cuối</th>
				<th>Ngày chỉnh sửa cuối</th>
				<th>Chuyên Ngành</th>
				<th>Học Phí</th>
				<th>Mô Tả</th>
				<th>Trạng Thái</th>
				<th>Hành Động</th>
			</tr>
			<c:forEach items="${sinhviens}" var="sinhviens">
				<tr>
					<td>${sinhviens.masv}</td>
					<td>${sinhviens.name}</td>
					<td><c:if test="${sinhviens.gender==true}">Nam</c:if> <c:if
							test="${sinhviens.gender==false}">Nữ</c:if></td>
					<td><fmt:formatDate type="date"
							value="${sinhviens.dateofbirth}" /></td>
					<td>${sinhviens.createdUser}</td>
					<td><fmt:formatDate type="date"
							value="${sinhviens.createdDate}" /></td>
					<td>${sinhviens.lastModifiedUser}</td>
					<td><fmt:formatDate type="date"
							value="${sinhviens.lastModifiedDate}" /></td>
					<td>${sinhviens.majoring}</td>
					<td>${sinhviens.price}</td>
					<td>${sinhviens.description}</td>
					<td><c:if test="${sinhviens.status==true}">Đang Học</c:if> <c:if
							test="${sinhviens.status==false}">Đã Nghỉ</c:if></td>
					<td>
						
						<c:if test="${!empty rlx }">
							<a class="btn btn-primary" href="/PH14249/delete?id=${sinhviens.id }">Xóa</a>
							<a class="btn btn-primary" href="/PH14249/update?id=${sinhviens.id }">Sửa</a>
						</c:if>
					</td>
				</tr>
			</c:forEach>
		</table>
	</c:if> </conten>
	<div class="col">
	<c:if test="${!empty rlx }"><a class="btn btn-primary" href="/PH14249/Sinh-Vien">Thêm Sinh Viên Mới</a>
	 <a class="btn btn-primary" href="/PH14249/logout" style="position: absolute; right: 8%;">Logout</a></c:if>
	 <c:if test="${!empty rly }"><a class="btn btn-primary" href="/PH14249/Sinh-Vien">Thêm Sinh Viên Mới</a>
	 <a class="btn btn-primary" href="/PH14249/logout" style="position: absolute; right: 8%;">Logout</a></c:if>
	 
	</div>


</body>
</html>