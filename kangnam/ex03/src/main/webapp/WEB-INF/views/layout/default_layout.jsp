<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="/resources/plugins/jQuery/jQuery-2.1.4.min.js"></script>
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<link rel="stylesheet" href="/resources/layout.css">

</head>

<body>

<div class ="wrap">

    <div class = "div1">
        <tiles:insertAttribute name="div1" />
    </div>
    
    <div class = "div2">
        <tiles:insertAttribute name="div2" />
    </div>
     
     <div class = "div3">
        <tiles:insertAttribute name="div3" />
    </div>
    
    <div class = "div4">
         <tiles:insertAttribute name="div4" />
    </div>
    

    
</div>

</body>
</html>