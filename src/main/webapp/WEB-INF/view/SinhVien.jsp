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
	<div class="container">
		<form action="/PH14249/Sinh-Vien" method="POST">
			<div class="row col-12">
				<div class="row mt-4">
					<div class="col-6">
						<label><strong> Mã Sinh Viên :</strong></label>
						<input type="text" name="masv" class="form-control" placeholder="Vui lòng nhập mã sinh viên !" required  />
					</div>
					<div class="col-6">
						<label><strong> Họ Tên :</strong></label>
						 <input type="text"	name="name" class="form-control" placeholder="Vui lòng nhập họ tên !" required  />
					</div>
				</div>
				<div class="row mt-4">
					<div class="col-6">
						<label><strong> Chuyên Ngành :</strong></label>
						<select
							name="majoring" class="form-select">
							<option value="UDPM">Ứng dụng phần mềm</option>
							<option value="TKTW">Thiết kế trang web</option>
							<option value="LTMT">Lập trình máy tính</option>
							<option value="TKDH">Thiết Kế Đồ Họa</option>
						</select>
					</div>
					<div class="col-6">
						<label><strong> Học Phí :</strong></label>
					    <input type="number" name="price" class="form-control"	placeholder="Vui lòng nhập học phí !" required  />
					</div>
				</div>
				<div class="row mt-4">
					<div class="col-6">
						<label><strong> Ngày Sinh :</strong></label> 
						<input type="text"	name="dateofbirth" class="form-control"	placeholder="(dd/mm/yyyy)" required  />
					</div>
					<div class="col-6">
						<label><strong> Giới tính :</strong></label> 
						<br>
						<input type="radio" value="true" class="form-check-input" name="gender" checked="checked" /> 
						<label>Nam</label>
						<input type="radio" value="false" class="form-check-input" name="gender" />
						<label>Nữ</label>
					</div>
				</div>
				<div class="row mt-4">
					<div class="col-6">
						<label><strong> Mô Tả :</strong></label>
						 <input type="text" name="description" class="form-control" placeholder="Vui lòng nhập mô tả !">
					</div>
					<div class="col-6">
						<label><strong> Trạng Thái :</strong></label> 
						<br>
						<input type="radio" value="true" class="form-check-input" name="status" checked="checked" />
						<label>Đang Học</label> 
						<input type="radio" value="false" class="form-check-input" name="status" />
						<label>Đã Nghỉ</label>
					</div>
				</div>
			</div>
			<br>
			<div class="col-12">
				<button type="submit" class="btn btn-primary">Thêm</button>
			</div>
		</form>
	</div>

</body>
</html>