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

		$("#mon_mem_addr").attr("readonly", "readonly");
		$("#mon_mem_brthday").attr("readonly", "readonly");

		$("#mem_dvs").change(function() {

			// 일반회원이면
			if ($("#mem_dvs").val() == 1) {
				$("#mon_mem_addr").attr("readonly", "readonly");
				$("#mon_mem_brthday").attr("readonly", "readonly");
			} else if ($("#mem_dvs").val() == 2) {
				$("#mon_mem_addr").removeAttr("readonly");
				$("#mon_mem_brthday").removeAttr("readonly");
			}
		});
		
		
		$(document).ready(function() {
			$("#cansel").click(function() {
				location.href="/member/list";
			});
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
					<h3 class="box-title">회원등록</h3>
				</div>
				<!-- /.box-header -->

				<form role="form" method="post">
					<div class="box-body">
						<div class="form-group">
							<div class="sl_prod_sq_div">
								<label for="exampleInputEmail1" id="sl_prod_sq_label">회원구분</label>
								<select id="mem_dvs" class="form-control" name="mem_dvs">
									<option value="1">일반회원</option>
									<option value="2">월 회원</option>
								</select>
							</div>
						</div>

						<div class="form-group">
							<label for="exampleInputEmail1">이름</label> <input type="text"
								id='mem_nm' name='mem_nm' class="form-control"
								placeholder="입력해주세요.">
						</div>

						<div class="form-group">
							<label for="exampleInputEmail1">전화번호</label> <input type="text"
								id='mem_pthon' name='mem_pthon' class="form-control"
								placeholder="입력해주세요.">
						</div>



						<div class="form-group">
							<label for="exampleInputEmail1" id="addr_label">주소</label> <input
								type="text" id='mon_mem_addr' name='mon_mem_addr'
								class="form-control" placeholder="입력해주세요.">
						</div>

						<div class="form-group">
							<label for="exampleInputEmail1" id="brth_label">생일</label> <input
								type="date" id='mon_mem_brthday' name='mon_mem_brthday'
								class="form-control">
						</div>

						<input type="hidden" name='admn_id' class="form-control"
							value="${admn_id }">

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