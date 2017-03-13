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
<script type="text/javascript">
	$(document).ready(function() {
		$("#cansel").click(function() {
			location.href = "/notebook/list";
		});
	});
</script>
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
					<h3 class="box-title">노트북 등록</h3>
				</div>
				<!-- /.box-header -->

				<form role="form" method="post">
					<div class="box-body">

						<div class="form-group">
							<label for="exampleInputEmail1">회원번호</label> <input type="text"
								id='mem_sq' name='mem_sq' class="form-control"
								placeholder="입력해주세요.">
						</div>

						<div class="form-group">
							<label for="exampleInputEmail1" id="ntbk_sq_label">노트북이름</label>
							<select class="form-control" id="ntbk_sq" name="ntbk_sq">
								<c:forEach items="${ntbkList}" var="vo">
									<option value="${vo.ntbk_sq}">${vo.ntbk_nm}</option>
								</c:forEach>
							</select>
						</div>

						<div class="form-group">
							<label for="exampleInputEmail1">관리자</label> <input type="text"
								name='admn_id' class="form-control" placeholder="입력해주세요.">
						</div>
					</div>
					<!-- /.box-body -->

					<div class="box-footer">
						<button type="submit" class="btn btn-primary">확인</button>
						<button id="cansel" type="button" class="btn btn-danger">취소</button>
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