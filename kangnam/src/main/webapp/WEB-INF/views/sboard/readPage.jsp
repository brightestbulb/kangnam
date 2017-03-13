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
					<h3 class="box-title">공지사항</h3>
				</div>
				<!-- /.box-header -->

				<form role="form" action="modifyPage" method="post">
					<!-- form 태그 내에서 bno,page,perpagenum,searchtype,keyword 정보를 가지도록 작업 -->

					<input type='hidden' name='ntc_sq' value="${boardVO.ntc_sq}">
					<input type='hidden' name='page' value="${cri.page}"> <input
						type='hidden' name='perPageNum' value="${cri.perPageNum}">
					<input type='hidden' name='searchType' value="${cri.searchType}">
					<input type='hidden' name='keyword' value="${cri.keyword}">

				</form>

				<div class="box-body">
					<div class="form-group">
						<label for="exampleInputEmail1">제목</label> <input type="text"
							name='ntc_sbjct' class="form-control"
							value="${boardVO.ntc_sbjct}" readonly="readonly">
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">내용</label>
						<textarea class="form-control" name="ntc_cmt" rows="3"
							readonly="readonly">${boardVO.ntc_cmt}</textarea>
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">작성자</label> <input type="text"
							name="admn_nm" class="form-control" value="${boardVO.admn_nm}"
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
		<!--/.col (left) -->

	</div>
	<!-- /.row -->





</section>
<!-- /.content -->

<script>
$(document).ready(function(){
	
	var formObj = $("form[role='form']");
	
	console.log(formObj);
	
	$("#modifyBtn").on("click", function(){
		formObj.attr("action", "/sboard/modifyPage");
		formObj.attr("method", "get");		
		formObj.submit();
	});
	
	$("#removeBtn").on("click", function(){
		formObj.attr("action", "/sboard/removePage");
		formObj.submit();
	});
	
	$("#goListBtn ").on("click", function(){
		formObj.attr("method", "get");
		formObj.attr("action", "/sboard/list");
		formObj.submit();
	});
	
});
</script>