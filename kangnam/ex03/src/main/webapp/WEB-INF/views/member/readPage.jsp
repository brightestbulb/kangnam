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
    <link href="/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="/resources/dist/css/AdminLTE.min.css" rel="stylesheet" type="text/css" />  <!-- 틀 관리 --> 
    <script src="/resources/plugins/jQuery/jQuery-2.1.4.min.js"></script>
   	<link rel="stylesheet" href="/resources/ex01.css">
   	<link rel="stylesheet" href="/resources/menu.css">
    <script type="text/javascript" src="/resources/js/upload.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
</head>



<section class="content">
	<div class="row">
		<!-- left column -->
		<div class="col-md-12">
			<!-- general form elements -->
			<div class='box'>
	<c:import url="/WEB-INF/views/menu/menu.jsp"></c:import>
				<div class='box-body'>
				</div>
			</div>
			<div class="box box-primary">
				<div class="box-header">
					<h3 class="box-title">회원정보 조회</h3>
				</div>
				<!-- /.box-header -->
<form role="form" action="modifyPage" method="post">

					<input type='hidden' name='mem_sq' value="${vo.mem_sq}">
					<input type='hidden' name='mon_mem_rgstrt_sq' value="${vo.mon_mem_rgstrt_sq}"> <input
						type='hidden' name='page' value="${cri.page}"> <input
						type='hidden' name='perPageNum' value="${cri.perPageNum}">
					<input type='hidden' name='searchType' value="${cri.searchType}">
					<input type='hidden' name='keyword' value="${cri.keyword}">

				</form>
				

				<div class="box-body">
						<div class="form-group">
							<label for="exampleInputEmail1">회원이름</label> <input type="text"
								name='mem_nm' class="form-control" value="${vo.mem_nm}" readonly="readonly">
						</div>
						
						<div class="form-group">
							<label for="exampleInputEmail1">전화번호</label> <input
								type="text" name="mem_pthon" class="form-control"value="${vo.mem_pthon}" readonly="readonly">
						</div>
						
						<div class="form-group">
							<label for="exampleInputEmail1">주소</label> <input
								type="text" name="mon_mem_addr" class="form-control"value="${vo.mon_mem_addr}" readonly="readonly">
						</div>
					
				     	<div class="form-group">
							<label for="exampleInputEmail1">생일</label> <input type="text"
								name='mon_mem_brthday' class="form-control" value="${vo.mon_mem_brthday}" readonly="readonly">
							</div>
						<div class="form-group">
							<label for="exampleInputEmail1">좌석명</label> <input type="text"
								name='seat_nm' class="form-control" value="${vo.seat_nm}" readonly="readonly">
						</div>
						<div class="form-group">
							<label for="exampleInputEmail1">사물함</label> <input type="text"
								name='lc_nm' class="form-control" value="${vo.lc_nm}" readonly="readonly">
						</div>
						
						<div class="form-group">
							<label for="exampleInputEmail1">시작일</label> <input type="text"
								name='mon_mem_strt_dd' class="form-control" value="${vo.mon_mem_strt_dd}" readonly="readonly">
						</div>
					
						<div class="form-group">
							<label for="exampleInputEmail1">종료일</label> <input type="text"
								name='mon_mem_end_dd' class="form-control" value="${vo.mon_mem_end_dd}" readonly="readonly">
						</div>
				</div>
				<!-- /.box-body -->
				
  <div class="box-footer">
    

    <button type="submit" class="btn btn-warning" id="modifyBtn">수정</button>
    <button type="submit" class="btn btn-danger" id="removeBtn">삭제</button>
    <button type="submit" class="btn btn-primary" id="goListBtn">목록</button>
  </div>

</div>
</div>
</div>
</section>

<script>
$(document).ready(function(){

 var formObj = $("form[role='form']");
 
 console.log(formObj);
 
 $(".btn-warning").on("click", function(){
 formObj.attr("action","/member/modifyPage");
 formObj.attr("method","get");
 formObj.submit();
 });
 
  $(".btn-danger").on("click", function(){
 formObj.attr("action","/member/removePage");
 formObj.submit();
 });
 
  $(".btn-primary").on("click", function(){
 self.location = "/member/list";
 });
});

</script>

