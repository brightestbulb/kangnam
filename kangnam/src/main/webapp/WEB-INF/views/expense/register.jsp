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


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$("#cansel").click(function() {
			location.href = "/expense/list";
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
					<h3 class="box-title">지출등록</h3>
				</div>
				<!-- /.box-header -->

				<form role="form" method="post">
					<div class="box-body">


						<div class="form-group">
							<label for="exampleInputEmail1">거래처</label> <select
								class="form-control" id="accnt_sq" name="accnt_sq">
								<c:forEach items="${exlist}" var="vo">
									<option value="${vo.accnt_sq}">${vo.accnt_nm}</option>
								</c:forEach>
							</select>
						</div>

						<div class="form-group">
							<label for="exampleInputEmail1">지출구분</label> <select
								class="form-control" id="exps_dvs_sq" name="exps_dvs_sq">
								<c:forEach items="${dvslist}" var="vo">
									<option value="${vo.exps_dvs_sq}">${vo.exps_dvs_nm}</option>
								</c:forEach>
							</select>
						</div>

						<div class="form-group">
							<label for="exampleInputEmail1">지출명</label> <input type="text"
								name='exps_nm' class="form-control" placeholder="입력해주세요.">
						</div>

						<div class="form-group">
							<label for="exampleInputEmail1">지출금액</label> <input type="text"
								name='exps_mn' class="form-control" placeholder="입력해주세요.">
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