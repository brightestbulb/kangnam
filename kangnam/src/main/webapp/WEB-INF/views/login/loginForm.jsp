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
<title>로그인</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<style type="text/css">
html, body {
	background-image: url(/resources/dist/img/loginForm2.png);
	background-size: 100% 100%;
	height: 100%;
}

.div_wrap {
	height: 100%;
	margin: 0;
	display: -ms-flexbox;
	display: -webkit-flex;
	display: flex;
	-ms-flex-align: center;
	-webkit-align-items: center;
	-webkit-box-align: center;
	align-items: center;
}

#div1 {
	height: 100%;
}

label {
	color: white;
}
</style>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		var errMsg = "${errMsg}";

		if (errMsg != "")
			alert(errMsg);

		var formObj = $("form[role='form']");

		console.log(formObj);

		$("#loginBtn").click(function() {
			if ($("#id").val() == "") {
				alert("계정을 입력해주세요.");
				return;
			} else if ($("#pwd").val() == "") {
				alert("비밀번호를 입력해주세요.");
				return;
			}

			formObj.submit();
		});

	});
</script>
</head>
<body>


	<div id="div1" class="container-fluid">
		<div class="div_wrap">
			<div class="col-xs-12">
				<form action="/login/login" role="form" id="loginForm"
					class="form-horizontal" method="post">
					<div class="row">


						<div class="form-logo">
							<h1></h1>
						</div>

						<div class="form-group">
							<label for="Account" class="col-sm-8 control-label">Account</label>
							<div class="col-sm-4">
								<input type="text" id="id" class="form-control" name="admn_id"
									placeholder="Account">
							</div>
						</div>
						<div class="form-group">
							<label for="Password" class="col-sm-8 control-label">Password</label>
							<div class="col-sm-4">
								<input type="password" id="pwd" class="form-control"
									name="admn_pwd" placeholder="Password">
							</div>
						</div>

						<div class="form-group text-right">
							<div class="col-sm-12">
								<button id="loginBtn" type="button" class="btn btn-default">Sign
									in</button>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>


</body>
</html>