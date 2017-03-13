<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String cp = request.getContextPath();
%>
<!DOCTYPE html">
<html>
<head>
<meta charset="UTF-8">
<title>KANGNAM 독서실</title>
<link href="/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<link href="/resources/dist/css/AdminLTE.min.css" rel="stylesheet"
	type="text/css" />
<!-- 틀 관리 -->
<!--  <script src="/resources/plugins/jQuery/jQuery-2.1.4.min.js"></script> -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<link rel="stylesheet" href="/resources/ex01.css">
<link rel="stylesheet" href="/resources/menu.css">
<script type="text/javascript" src="/resources/js/upload.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>



<script>
		$(document).ready(function() {
	
			var formObj = $("form[role='form']");
	
			console.log(formObj);
	
			// 수정버튼 클릭시
			$(".btn-warning").on("click", function() {
				formObj.attr("action", "/lockifm/modifyPage");
				formObj.attr("method", "get");
				formObj.submit();
			});
	
			// 취소버튼 클릭시
			$(".btn-danger").on("click", function() {
				self.location = "/lockifm/list";
			});
	
		});

	</script>


<script type="text/javascript">
		$(document).ready(function() 
		{
			$("select").change(function() 
			{
				document.getElementById("lc_sq").value = $(this).val();
			});
		});
	</script>
</head>
<body>

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
						<h3 class="box-title">사물함 조회</h3>
					</div>
					<!-- /.box-header -->
					<form role="form" action="modifyPage" method="post">

						<input type='hidden' name='mem_sq' value="${LockifmVO.mem_sq}">
						<input type='hidden' name='page' value="${cri.page}"> <input
							type='hidden' name='perPageNum' value="${cri.perPageNum}">
						<input type='hidden' name='searchType' value="${cri.searchType}">
						<input type='hidden' name='keyword' value="${cri.keyword}">
						<input type='hidden' name='lc_sq' id="lc_sq">
					</form>


					<div class="box-body">
						<div class="form-group">
							<label for="exampleInputEmail1">회원 이름</label> <input type="text"
								name='membername' class="form-control"
								value="${LockifmVO.mem_nm}" readonly="readonly">
						</div>

						<div class="form-group">
							<label for="exampleInputEmail1">사물함 번호</label> <input type="text"
								name='curlc_nm' class="form-control" value="${LockifmVO.lc_nm}"
								readonly="readonly">
						</div>

						<div class="form-group">
							<label for="exampleInputEmail1">사물함 수정</label> <select
								class="form-control">
								<option value="null">사물함 회수</option>
								<c:forEach items="${nullLockifm }" var="nullLockifm">
									<option value=${nullLockifm.lc_nm }>${nullLockifm.lc_nm }</option>
								</c:forEach>
							</select>
						</div>

						<div class="form-group">
							<label for="exampleInputEmail1">시작일</label> <input type="text"
								name='mon_mem_strt_dd' class="form-control"
								value="${LockifmVO.mon_mem_strt_dd}" readonly="readonly">
						</div>

						<div class="form-group">
							<label for="exampleInputEmail1">종료일</label> <input type="text"
								name='mon_mem_end_dd' class="form-control"
								value="${LockifmVO.mon_mem_end_dd}" readonly="readonly">
						</div>

					</div>
					<!-- /.box-body -->

					<div class="box-footer">


						<button type="submit" class="btn btn-warning" id="modifyBtn">수정</button>
						<button type="button" class="btn btn-danger" id="cenBtn">취소</button>
					</div>

				</div>
			</div>
		</div>
	</section>


</body>
</html>