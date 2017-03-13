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
<title>사물함</title>

<script src="/resources/plugins/jQuery/jQuery-2.1.4.min.js"></script>
<script
   src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<link rel="stylesheet" href="/resources/div34.css">
</head>
<body>
   <div>
      <table class="ttg">
         
             <tr>
               <th class="tg-031e">월 회원권</th>
               <td class="tg-031e">
                  <c:forEach items="${today_sell}" var="vo">
                     <c:if test="${vo.sl_prod_nm eq 'MON'}">${vo.sl_mn}</c:if>
                  </c:forEach>
               </td>
            </tr>
            <tr>
               <th class="tg-031e">일 회원권</th>
               <td class="tg-031e">
                  <c:forEach items="${today_sell}" var="vo">
                     <c:if test="${vo.sl_prod_nm eq 'DAY'}">${vo.sl_mn}</c:if>
                  </c:forEach>
               </td>
            </tr>
            <tr>
               <th class="tg-031e">쿠폰</th>
               <td class="tg-031e">
                  <c:forEach items="${today_sell}" var="vo">
                     <c:if test="${vo.sl_prod_nm eq 'CPN'}">${vo.sl_mn}</c:if>
                  </c:forEach>
               </td>
            </tr>
            <tr> 
               <th class="tg-031e">총합</th>
               <td class="tg-031e">${today_sell[0].sl_mn + today_sell[1].sl_mn + today_sell[2].sl_mn}</td>
            </tr>
         
      </table>
   </div>
</body>
</html>