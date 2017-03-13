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

<!-- Bootstrap 3.3.4 -->
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
	<div class="row">
		<!-- left column -->
		<div class="col-md-12">
			<!-- general form elements -->
			<div class='box'>
				<c:import url="/WEB-INF/views/menu/menu.jsp"></c:import>
				<div class='box-body'></div>
			</div>
			<div class="box box-primary">
				<div class="box-header">
					<h3 class="box-title">쿠폰등록</h3>
				</div>
				<!-- /.box-header -->

				<form role="form" method="post">
					<div class="box-body">


						<div class="form-group">
							<label for="exampleInputEmail1">회원번호</label> <input type="text"
								name='mem_sq' class="form-control" placeholder="입력해주세요.">
						</div>

						<!-- <div class="form-group">
			<label for="exampleInputEmail1">구매일</label> <input type="text"
				name='cpn_by_dd' class="form-control" placeholder="입력해주세요.">
		</div>
		
		<div class="form-group">
			<label for="exampleInputEmail1">종료일</label> <input type="text"
				name='cpn_end_dd' class="form-control" placeholder="입력해주세요.">
		</div>
		-->
						<div class="form-group">
							<label for="exampleInputEmail1">쿠폰갯수</label> <input type="text"
								name='cpn_num' class="form-control" placeholder="입력해주세요.">
						</div>

					</div>
					<!-- /.box-body -->

					<div class="box-footer">
						<button type="submit" class="btn btn-primary">Submit</button>
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