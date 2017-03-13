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
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>

</head>
<!-- jQuery 2.1.4 -->



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
					<h3 class="box-title">지출내역조회</h3>
				</div>
				<!-- /.box-header -->

				<form role="form" action="modifyPage" method="post">

					<input type='hidden' name='exps_sq' value="${expenseVO.exps_sq}">
					<input type='hidden' name='page' value="${cri.page}"> <input
						type='hidden' name='perPageNum' value="${cri.perPageNum}">
					<input type='hidden' name='searchType' value="${cri.searchType}">
					<input type='hidden' name='keyword' value="${cri.keyword}">

				</form>

				<div class="box-body">
					<div class="form-group">
						<label for="exampleInputEmail1">거래처</label> <input type="text"
							name='accnt_nm' class="form-control"
							value="${expenseVO.accnt_nm}" readonly="readonly">
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">지출명</label> <input type="text"
							name='exps_nm' class="form-control" value="${expenseVO.exps_nm}"
							readonly="readonly">
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">지출날짜</label> <input type="text"
							name='exps_dt' class="form-control" value="${expenseVO.exps_dt}"
							readonly="readonly" />>
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">지출금액</label> <input type="text"
							name='exps_mn' class="form-control" value="${expenseVO.exps_mn}"
							readonly="readonly">
					</div>

				</div>
				<!-- /.box-body -->

				<div class="box-footer">


					<button type="submit" class="btn btn-warning" id="modifyBtn">수정</button>
					<button type="submit" class="btn btn-danger" id="removeBtn">삭제</button>
					<button type="submit" class="btn btn-primary" id="goListBtn">목록</button>
				</div>

			</div>
			<!-- /.box -->
		</div>

	</div>

</section>
<!-- /.content -->

<script>
	$(document).ready(function() {

		var formObj = $("form[role='form']");

		console.log(formObj);

		$(".btn-warning").on("click", function() {
			formObj.attr("action", "/expense/modifyPage");
			formObj.attr("method", "get");
			formObj.submit();
		});

		$(".btn-danger").on("click", function() {
			formObj.attr("action", "/expense/removePage");
			formObj.submit();
		});

		$(".btn-primary").on("click", function() {
			self.location = "/expense/list";
		});

	});
</script>