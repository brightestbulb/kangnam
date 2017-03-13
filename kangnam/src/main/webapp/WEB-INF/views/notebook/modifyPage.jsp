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
<script src="/resou	rces/plugins/jQuery/jQuery-2.1.4.min.js"></script>
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
					<h3 class="box-title">노트북 사용종료</h3>
				</div>
				<!-- /.box-header -->

				<form role="form" action="modifyPage" method="post">
					<input type='hidden' name='ntbk_rnt_sq'
						value="${notebookVO.ntbk_rnt_sq}"> <input type='hidden'
						name='page' value="${cri.page}"> <input type='hidden'
						name='perPageNum' value="${cri.perPageNum}"> <input
						type='hidden' name='searchType' value="${cri.searchType}">
					<input type='hidden' name='keyword' value="${cri.keyword}">

					<div class="box-body">


						<div class="form-group">
							<label for="exampleInputEmail1">회원번호</label> <input type="text"
								name='mem_sq' class="form-control" value="${notebookVO.mem_sq}"
								readonly="readonly">
						</div>

						<div class="form-group">
							<label for="exampleInputEmail1">노트북번호</label> <input type="text"
								name="ntbk_sq" class="form-control"
								value="${notebookVO.ntbk_sq}">
						</div>


					</div>


					<!-- /.box-body -->
				</form>
				<div class="box-footer">
					<button type="submit" class="btn btn-primary">사용종료</button>
					<button type="submit" class="btn btn-warning">취소</button>
				</div>

				<script>
$(document).ready(
	function() {

		var formObj = $("form[role='form']");

		console.log(formObj);

		$(".btn-warning")
				.on("click",function() {
					self.location = "/notebook/list?page=${cri.page}&perPageNum=${cri.perPageNum}"
							+ "&searchType=${cri.searchType}&keyword=${cri.keyword}";
				});

		$(".btn-primary").on("click",
				function() {
					formObj.submit();
				});
	});
</script>
			</div>
			<!-- /.box -->
		</div>
		<!--/.col (left) -->

	</div>
	<!-- /.row -->
</section>
<!-- /.content -->
<!-- /.content-wrapper -->