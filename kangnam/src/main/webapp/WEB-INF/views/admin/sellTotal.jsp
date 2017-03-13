<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String cp = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SellTotal</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="/resources/ex01.css">
<link href="/resources/dist/css/AdminLTE.min.css" rel="stylesheet"
	type="text/css" />
<link rel="stylesheet" href="/resources/ex01.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script>
	var formObj = $("form[role='form']");

	console.log(formObj);

	$(document).ready(
			function() {
				if ($("#admn_id").val() != "admin") {
					alert("해당 계정은 접속할 수 없습니다.");
					window.close();
				}

				$('#searchBtn').on(
						"click",
						function(event) {
							self.location = "sellTotal"
									+ '${pageMaker.makeQuery(1)}'
									+ "&searchType=" + $("#sl_strt").val()
									+ "&keyword=" + $("#sl_end").val();

						});
			});
</script>

<style type="text/css">
.box {
	background: #D7AC87;
}

.table-row {
	background: #D7AC87;
	text-align: center;
}

.box-footer {
	background: #D7AC87;
}

html, body {
	background-image: url(/resources/dist/img/photo2.png);
	background-size: 100% 100%;
	height: 100%;
	font-weight: bold;
	font-size: 15px;
}

}
.box-title {
	font-weight: bold;
	font-size: 20px;
}
</style>
</head>
<body>
	<input id="admn_id" type="hidden" value="${admn_id }">
	<section class="content">
		<div class="row">
			<div class="col-md-12">



				<div class="box">
					<div class="box-header with-border">
						<h3 class="box-title">매출 정산</h3>
					</div>
					<form action="" method="get" role="form">
						<div class='box-body'>
							<input type="date" id="sl_strt" name="sl_strt"
								value="${cri.searchType}"> <input type="date"
								id="sl_end" name="sl_end" value="${cri.keyword}">
							<button type="button" id="searchBtn" name="searchBtn">Search</button>
						</div>
					</form>
					<div class="box-body">
						<table class="table table-bordered">
							<tr class="table-row">
								<th style="width: 100px">날짜</th>
								<th>쿠폰</th>
								<th>일 회원권</th>
								<th>월 회원권</th>
								<th>총합</th>
							</tr>

							<c:forEach items="${list}" var="vo">
								<tr>
									<td>${vo.sl_dt}</td>
									<td>${vo.cpn}</td>
									<td>${vo.oneday}</td>
									<td>${vo.monday}</td>
									<td>${vo.total}</td>
								</tr>
							</c:forEach>

							<tr>
								<th>총 합</th>
								<td>${total.sumcpn}</td>
								<td>${total.sumone}</td>
								<td>${total.summon}</td>
								<td>${total.sumtotal}</td>
							</tr>
						</table>
					</div>
					<!-- /.box-body -->

					<div class="box-footer">

						<div class="text-center">
							<ul class="pagination">

								<c:if test="${pageMaker.prev}">
									<li><a
										href="selltotal${pageMaker.makeSearch(pageMaker.startPage - 1) }">&laquo;</a></li>
								</c:if>

								<c:forEach begin="${pageMaker.startPage }"
									end="${pageMaker.endPage }" var="idx">
									<li
										<c:out value="${pageMaker.cri.page == idx?'class =active':''}"/>>
										<a href="selltotal${pageMaker.makeSearch(idx)}">${idx}</a>
									</li>
								</c:forEach>

								<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
									<li><a
										href="selltotal${pageMaker.makeSearch(pageMaker.endPage +1) }">&raquo;</a></li>
								</c:if>

							</ul>
						</div>

					</div>
					<!-- /.box-body -->


					<!-- /.box-footer-->
				</div>




			</div>
		</div>
	</section>

</body>
</html>