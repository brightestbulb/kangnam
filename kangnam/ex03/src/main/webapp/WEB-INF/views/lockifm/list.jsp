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
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="/resources/ex01.css">
<link href="/resources/dist/css/AdminLTE.min.css" rel="stylesheet"
	type="text/css" />
<link rel="stylesheet" href="/resources/ex01.css">
<link rel="stylesheet" href="/resources/menu.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</head>
<body>

	<section class="content">
		<div class="row">
			<div class="col-md-12">

				<div class='box'>

					<c:import url="/WEB-INF/views/menu/menu.jsp"></c:import>

					<div class='box-body'>
						<select name="searchType">
							<option value="n"
								<c:out value="${cri.searchType == null?'selected':''}"/>>
								---</option>
							<option value="t"
								<c:out value="${cri.searchType eq 't'?'selected':''}"/>>
								회원번호</option>
							<option value="c"
								<c:out value="${cri.searchType eq 'c'?'selected':''}"/>>
								이름</option>
							<option value="w"
								<c:out value="${cri.searchType eq 'w'?'selected':''}"/>>
								전화번호</option>
							<option value="tc"
								<c:out value="${cri.searchType eq 'tc'?'selected':''}"/>>
								사물함번호</option>
						</select> <input type="text" name='keyword' id="keywordInput"
							value='${cri.keyword }'>
						<button id='searchBtn'>회원검색</button>

					</div>
				</div>


				<div class="box">
					<div class="box-header with-border">
						<h3 class="box-title">사물함 회원목록</h3>
					</div>
					<div class="box-body">
						<table class="table table-bordered">
							<tr>
								<th style="width: 100px">회원번호</th>
								<th>이름</th>
								<th>전화번호</th>
								<th>사물함번호</th>
								<th>월회원종료</th>
							</tr>

							<c:forEach items="${list}" var="lockifmVO">
								<tr>
									<td>${lockifmVO.mem_sq}</td>
									<td><a
										href='/lockifm/readPage${pageMaker.makeSearch(pageMaker.cri.page) }&mem_sq=${lockifmVO.mem_sq}'>
											${lockifmVO.mem_nm}</a></td>
									<td>${lockifmVO.mem_pthon}</td>
									<td>${lockifmVO.lc_nm}</td>
									<td>${lockifmVO.mon_mem_end_dd}</td>
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
					<!-- /.box-body -->
					<!-- /.box-footer-->
				</div>
			</div>
		</div>
	</section>

	<script>
		$(document).ready(
				function() {

					$('#searchBtn').on(
							"click",
							function(event) {

								self.location = "list"
										+ '${pageMaker.makeQuery(1)}'
										+ "&searchType="
										+ $("select option:selected").val()
										+ "&keyword="
										+ $('#keywordInput').val();

							});

					$('#newBtn').on("click", function(evt) {

						self.location = "register";

					});

				});
	</script>





</body>
</html>