<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>

	<nav id="topMenu">
		<ul>
			<li class="topMenuLi"><a class="menuLink" href="#">menu</a>

				<ul class="submenu">
					<li><a class="submenuLink longLink" href="/sboard/list">공지</a></li>
					<li><a class="submenuLink longLink" href="/member/list">회원</a></li>
					<li><a class="submenuLink longLink" href="/seat/list">좌석</a></li>
					<li><a class="submenuLink longLink" href="/coupon/list">쿠폰</a></li>
					<li><a class="submenuLink longLink" href="/notebook/list">노트북</a></li>
					<li><a class="submenuLink longLink" href="/lockifm/list">사물함</a></li>
					<li><a class="submenuLink longLink" href="/sell/list">판매</a></li>
					<li><a class="submenuLink longLink" href="/expense/list">지출</a></li>
					<li><a class="submenuLink longLink" href="/admin/sellTotal"
						target="_blank">정산</a></li>
				</ul></li>
			<li class="topMenuLi"><a class="menuLink" href="/login/logout">Logout</a>
			</li>
		</ul>
	</nav>






</body>
</html>