<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh Sách Sinh Viên</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<h1 style="text-align: center; color: blue;">Cập nhật sinh viên</h1>
	<div class="container">
		<form action="/PH14249/update" method="POST">
			<div class="row col-12">
				<div class="row mt-4">
					<div class="col-6">
						<label><strong> Mã Sinh Viên :</strong></label>
						<input type="text" name="masv" value="${sinhvien.masv}"; class="form-control" placeholder="Vui lòng nhập mã sinh viên !" required  />
					</div>
					<div class="col-6">
						<label><strong> Họ Tên :</strong></label>
						 <input type="text"	name="name" value="${sinhvien.name}" class="form-control" placeholder="Vui lòng nhập họ tên !" required  />
					</div>
				</div>
				<div class="row mt-4">
					<div class="col-6">
						<label><strong> Chuyên Ngành :</strong></label>
						<input type="text"	name="majoring" value="${sinhvien.majoring}" class="form-control" placeholder="Vui lòng nhập chuyên ngành !" required  />
					</div>
					<div class="col-6">
						<label><strong> Học Phí :</strong></label>
					    <input type="number" name="price" value="${sinhvien.price}" class="form-control"	placeholder="Vui lòng nhập học phí !" required  />
					</div>
				</div>
				<div class="row mt-4">
					<div class="col-6">
						<label><strong> Ngày Sinh :</strong></label> 
						<input type="text"	name="dateofbirth" value="<fmt:formatDate pattern="dd/MM/yyyy" value="${sinhvien.dateofbirth}" />" class="form-control"	placeholder="(dd/mm/yyyy)" required  />
					</div>
					<div class="col-6">
						<label><strong> Giới tính :</strong></label> 
						<br>
						<input type="radio" value="true" class="form-check-input" name="gender" checked="checked"/> 
						<label>Nam</label>
						<input type="radio" value="false" class="form-check-input" name="gender" />
						<label>Nữ</label>
					</div>
				</div>
				<div class="row mt-4">
					<div class="col-6">
						<label><strong> Mô Tả :</strong></label>
						 <input type="text" name="description" value="${sinhvien.description}" class="form-control" placeholder="Vui lòng nhập mô tả !">
					</div>
					<div class="col-6">
						<label><strong> Trạng Thái :</strong></label> 
						<br>
						<input type="radio" value="true" class="form-check-input" name="status" checked="checked"/>
						<label>Đang Học</label> 
						<input type="radio" value="false" class="form-check-input" name="status" />
						<label>Đã Nghỉ</label>
					</div>
				</div>
				<label style="color: red;">${mess}</label>
			</div>
			<br>
			<div class="col-12">
				<button type="submit" class="btn btn-primary" value="/PH14249/update?id=${sinhvien.id})">Cập Nhật</button>
			</div>
		</form>
	</div>

</body>
</html>