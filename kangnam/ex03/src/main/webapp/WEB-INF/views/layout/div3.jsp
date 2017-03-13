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
<title>사물함</title>

<script src="/resources/plugins/jQuery/jQuery-2.1.4.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<link rel="stylesheet" href="/resources/div34.css">
</head>
<body>
	<div>
		<table class="tg">
			<tr>
			<c:set var="i" value="1"/>
			<c:forEach items="${lockList }" var="lockifmListVO">
			
			<c:choose>
				<c:when test="${i == 1}"> <td class="tg-031e" id="lc${i }">${i}<br><br>${lockifmListVO.mem_nm }<br><br>${lockifmListVO.mon_mem_end_dd}</td> </c:when>
				<c:when test="${i == 2}"> <td class="tg-031e" id="lc${i }">${i}<br><br>${lockifmListVO.mem_nm }<br><br>${lockifmListVO.mon_mem_end_dd}</td> </c:when>
				<c:when test="${i == 3}"> <td class="tg-031e" id="lc${i }">${i}<br><br>${lockifmListVO.mem_nm }<br><br>${lockifmListVO.mon_mem_end_dd}</td> </c:when>
				<c:when test="${i == 14}"> <td class="tg-031e" id="lc${i }">${i}<br><br>${lockifmListVO.mem_nm }<br><br>${lockifmListVO.mon_mem_end_dd}</td> </c:when>
				<c:when test="${i == 15}"> <td class="tg-031e" id="lc${i }">${i}<br><br>${lockifmListVO.mem_nm }<br><br>${lockifmListVO.mon_mem_end_dd}</td> </c:when>
				<c:when test="${i == 16}"> <td class="tg-031e" id="lc${i }">${i}<br><br>${lockifmListVO.mem_nm }<br><br>${lockifmListVO.mon_mem_end_dd}</td> </c:when>
				<c:when test="${i == 27}"> <td class="tg-031e" id="lc${i }">${i}<br><br>${lockifmListVO.mem_nm }<br><br>${lockifmListVO.mon_mem_end_dd}</td> </c:when>
				<c:when test="${i == 28}"> <td class="tg-031e" id="lc${i }">${i}<br><br>${lockifmListVO.mem_nm }<br><br>${lockifmListVO.mon_mem_end_dd}</td> </c:when>
				<c:when test="${i == 29}"> <td class="tg-031e" id="lc${i }">${i}<br><br>${lockifmListVO.mem_nm }<br><br>${lockifmListVO.mon_mem_end_dd}</td> </c:when>
				<c:when test="${i % 39 == 0}"> <td class="tg-031e" id="lc${i }">${i}<br><br>${lockifmListVO.mem_nm }<br><br>${lockifmListVO.mon_mem_end_dd}</td></tr> </c:when>
				<c:when test="${i % 13 == 0}"> <td class="tg-031e" id="lc${i }">${i}<br><br>${lockifmListVO.mem_nm }<br><br>${lockifmListVO.mon_mem_end_dd}</td></tr><tr> </c:when>
				<c:otherwise> <td class="tg-031e" id="lc${i }">${i}<br><br>${lockifmListVO.mem_nm }<br><br>${lockifmListVO.mon_mem_end_dd}</td> </c:otherwise>
			</c:choose>
			
			
				<c:set var="i" value="${i+1 }"></c:set>
			
			</c:forEach>
	
		</table>

		
		<table class="tgg">
			<tr>
				<td class="tg-01">인원현황</td>
				<td class="tg-01">명</td>
			</tr>
			
			<c:forEach items="${cntList }" var="lockifmListVO">
				<tr>
					<td class="tg-01">${lockifmListVO.mem_dvs } </td>
					<td class="tg-01">${lockifmListVO.cnt } </td>
				</tr>
			</c:forEach>
			
			<c:forEach items="${totList }" var="lockifmListVO">
				<tr>
					<td class="tg-01">총 </td>
					<td class="tg-01">${lockifmListVO.tot } </td>
				</tr>
			</c:forEach>
		<!-- 	<tr>
				<td class="tg-031e">월 회원</td>
				<td class="tg-031e"></td>
			</tr>
			<tr>
				<td class="tg-031e">1day</td>
				<td class="tg-031e"></td>
			</tr>
			<tr>
				<td class="tg-yw4l">쿠폰</td>
				<td class="tg-yw4l"></td>
			</tr>
			<tr>
				<td class="tg-yw4l">총</td>
				<td class="tg-yw4l"></td>
			</tr> -->
			
			
		</table>

	</div>
</body>
</html>