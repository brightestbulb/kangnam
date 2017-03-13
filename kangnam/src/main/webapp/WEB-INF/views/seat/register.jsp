<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KANGNAM 독서실</title>
<link href="/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<link href="/resources/dist/css/AdminLTE.min.css" rel="stylesheet"
	type="text/css" />
<!-- 틀 관리 -->
<script src="/resources/plugins/jQuery/jQuery-2.1.4.min.js"></script>
<link rel="stylesheet" href="/resources/ex01.css">
<link rel="stylesheet" href="/resources/menu.css">

</head>
<!-- Main content -->
<section class="content">

	<!-- left column -->
	<div class="col-md-12">

		<!-- general form elements -->
		<div class='box'>
			<c:import url="/WEB-INF/views/menu/menu.jsp"></c:import>
			<div class='box-body'></div>
		</div>
		<div class="box box-primary">
			<div class="box-header">
				<h3 class="box-title">좌석등록</h3>
			</div>
			<!-- /.box-header -->


			<form role="form" method="post">
				<div class="box-body">
					<!-- <div class="form-group">
							<label for="exampleInputEmail1">좌석번호</label> 
							<input type="text" name='seat_sq' class="form-control" placeholder="좌석번호">
						</div> -->

					<div class="form-group">
						<label for="exampleInputEmail1" id="seat_label">좌석선택</label> <select
							class="form-control" id="day_seat_sq" name="seat_sq">
							<c:forEach items="${day_seat_list }" var="vo">
								<option value="${vo.seat_sq}">${vo.seat_nm }</option>
							</c:forEach>
						</select>
					</div>




					<div class="form-group">
						<label for="exampleInputEmail1">회원번호</label> <input type="text"
							name='mem_sq' class="form-control" placeholder="회원번호">
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">시작시간</label> <input type="text"
							name='seat_aloc_strt_tm' class="form-control"
							placeholder="hh:mm:ss">
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">관리자</label> <input type="text"
							name="admn_id" class="form-control" placeholder="관리자">
					</div>
				</div>
				<!-- /.box-body -->

				<div class="box-footer">
					<button type="submit" class="btn btn-primary">확인</button>

				</div>
			</form>


		</div>
		<!-- /.box -->
	</div>
	<!--/.col (left) -->

	</div>
	<!-- /.row -->
</section>


<!-- /.content -->

<!-- /.content-wrapper -->