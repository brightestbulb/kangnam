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
<link rel="stylesheet" href="/resources/menu.css">


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

				<div class='box-body'>
					<select name="searchType">
						<option value="n"
							<c:out value="${cri.searchType == null?'selected':''}"/>>
							---</option>
						<option value="t"
							<c:out value="${cri.searchType eq 't'?'selected':''}"/>>
							이름</option>
						<option value="c"
							<c:out value="${cri.searchType eq 'c'?'selected':''}"/>>
							거래처</option>
					</select> <input type="text" name='keyword' id="keywordInput"
						value='${cri.keyword }'>

					<button id='searchBtn'>검색</button>
					<button id='newBtn'>등록</button>

				</div>
			</div>


			<div class="box">
				<div class="box-header with-border">
					<h3 class="box-title">지출내역</h3>
				</div>
				<div class="box-body">




					<table class="table table-bordered">
						<tr>
							<th style="width: 10px">번호</th>
							<th>거래처</th>
							<th>지출일</th>
							<th>비용</th>
							<th>관리자</th>
							<th>지출명</th>
						</tr>

						<c:forEach items="${list}" var="expenseVO">

							<tr>
								<td>${expenseVO.exps_sq}</td>
								<td><a
									href='/expense/readPage${pageMaker.makeSearch(pageMaker.cri.page)}&exps_sq=${expenseVO.exps_sq}'>${expenseVO.accnt_nm}</a></td>
								<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm"
										value="${expenseVO.exps_dt}" /></td>
								<td>${expenseVO.exps_mn}</td>
								<td>${expenseVO.admn_nm}</td>
								<td>${expenseVO.exps_nm}</td>
							</tr>

						</c:forEach>

					</table>

				</div>
				<!-- /.box-body -->
				<div class="box-footer">

					<div class="text-center">
						<ul class="pagination">

							<c:if test="${pageMaker.prev}">
								<li><a
									href="list${pageMaker.makeSearch(pageMaker.startPage - 1) }">&laquo;</a></li>
							</c:if>

							<c:forEach begin="${pageMaker.startPage }"
								end="${pageMaker.endPage }" var="idx">
								<li
									<c:out value="${pageMaker.cri.page == idx?'class =active':''}"/>>
									<a href="list${pageMaker.makeSearch(idx)}">${idx}</a>
								</li>
							</c:forEach>

							<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
								<li><a
									href="list${pageMaker.makeSearch(pageMaker.endPage +1) }">&raquo;</a></li>
							</c:if>

						</ul>
					</div>

				</div>

			</div>
			<!-- /.box-footer-->
		</div>
	</div>
	<!--/.col (left) -->

	<!-- /.row -->
</section>
<!-- /.content -->


<script>
	var result = '${msg}';

	if (result == 'SUCCESS') {
		alert("처리가 완료되었습니다.");
	}
</script>

<script>
	$(document).ready(
			function() {

				$('#searchBtn').on(  //검색 버튼의 동작처리
						"click",
						function(event) {

							self.location = "list"
									+ '${pageMaker.makeQuery(1)}'
									+ "&searchType="
									+ $("select option:selected").val()
									+ "&keyword=" + $('#keywordInput').val();

						});

				$('#newBtn').on("click", function(evt) {

					self.location = "register";

				});

			});
</script>