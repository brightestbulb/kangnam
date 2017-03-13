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
<link href="/resources/dist/css/AdminLTE.min.css" rel="stylesheet"
	type="text/css" />
<!-- 틀 관리 -->

<link rel="stylesheet" href="/resources/ex01.css">
<link rel="stylesheet" href="/resources/menu.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script>
	$(document).ready(function() {

		var formObj = $("form[role='form']");

		console.log(formObj);

		// 등록버튼 클릭시
		$(".btn-primary").on("click", function() {
			formObj.submit();
		});

		// 취소버튼 클릭시
		$(".btn-danger").on("click", function() {
			self.location = "/sell/list";
		});

	});
</script>

<script type="text/javascript">
	$(document).ready(function() {
		// 문서가 로드됨과 동시에 id=cpn_label은 보이지 않는 상태가 된다.
		$("#cpn_label").css("display", "none");
		$("#day_seat_sq").css("display", "none");
		$("#mon_seat_sq").css("display", "none");

		// select가 변경된다면
		$("#sl_prod_sq").change(function() {
			// 만약 value 값이 1이라면 (월회원) 월회원권 구매 UI 노출, 쿠폰 관련 UI 숨김
			if ($("#sl_prod_sq").val() == 1) {
				$("#mon_num").attr("type", "text");
				$("#mon_label").css("display", "");
				$("#lc_list").css("display", "");
				$("#seat_dvs_sq").css("display", "");
				$("#mon_seat_sq").removeAttr("disabled");
				$("#mon_seat_sq").css("display", "");
				$("#seat_label").css("display", "");

				$("#cpn_num").attr("type", "hidden");
				$("#cpn_label").css("display", "none");
				$("#day_seat_sq").attr("disabled", "disabled")
				$("#day_seat_sq").css("display", "none");
				// select 변경시 개월, 금액 폼 빈공백으로 초기화
				$("#cpn_num").val("");
				$("#sl_mn").val("");
			}
			// 만약 value 값이 2라면 (일회원) 월회원권, 쿠폰 관련 UI 숨김
			else if ($("#sl_prod_sq").val() == 2) {
				$("#mon_num").attr("type", "hidden");
				$("#mon_label").css("display", "none");
				$("#seat_dvs_sq").css("display", "none");
				$("#mon_seat_sq").attr("disabled", "disabled");
				$("#mon_seat_sq").css("display", "none");
				$("#seat_label").css("display", "");

				$("#cpn_num").attr("type", "hidden");
				$("#cpn_label").css("display", "none");
				$("#lc_list").css("display", "none");
				$("#seat_dvs_sq").css("display", "none");
				$("#day_seat_sq").removeAttr("disabled");
				$("#day_seat_sq").css("display", "");
				// select 변경시 개월, 장 입력폼 빈공백으로 초기화
				$("#mon_num").val("");
				$("#cpn_num").val("");
				// 일회원값은 어차피 고정이니까 값 정해주고
				$("#sl_mn").val("10000");

			}
			// 만약 value 값이 3이라면 (쿠폰) 쿠폰 구매 UI 노출, 월 회원 관련 UI 숨김
			else if ($("#sl_prod_sq").val() == 3) {
				$("#mon_num").attr("type", "hidden");
				$("#mon_label").css("display", "none");
				$("#seat_dvs_sq").css("display", "none");
				$("#mon_seat_sq").attr("disabled", "disabled");
				$("#day_seat_sq").attr("disabled", "disabled");
				$("#mon_seat_sq").css("display", "none");
				$("#day_seat_sq").css("display", "none");
				$("#seat_label").css("display", "none");

				$("#cpn_num").attr("type", "text");
				$("#cpn_label").css("display", "");
				$("#lc_list").css("display", "none");
				$("#seat_dvs_sq").css("display", "none");
				// select 변경시 개월, 금액 폼 빈공백으로 초기화
				$("#mon_num").val("");
				$("#sl_mn").val("");
			}

		});

		// 개월 수 입력시 자동으로 금액 입력
		$("#mon_num").keyup(function() {
			$("#sl_mn").val($("#mon_num").val() * 150000);
		});

		// 쿠폰 수 입력시 자동으로 금액 입력
		$("#cpn_num").keyup(function() {
			$("#sl_mn").val($("#cpn_num").val() * 10000);
		});

		$("#seat_dvs_sq").change(function() {
			// 자유석 이라면
			if ($("#seat_dvs_sq").val() == 1) {
				$("#mon_seat_sq").css("display", "none");
			}
			// 고정석 이라면
			else if ($("#seat_dvs_sq").val() == 2) {
				$("#mon_seat_sq").css("display", "");
			}
		});

		/* 
		$("#mem_nm").click(function() 
		{
			// Get, Post 방식
			// 데이터를 전송할 컨트롤러
			// {변수명 : 데이터, 변수명 : 데이터}
			// function(ajax 처리된 데이터를 받아올 변수명)
			// $(식별자).뿌릴방식(ajax 처리된 데이터를 받아올 변수명 위와 동일)
			$.post("/ajax/memList", {}, function(data) 
		    {
				// test에 뿌려라
				$("#test").html(data);
		    }); 
		}); 
		 */

	});
</script>





</head>
<!-- Main content -->
<section class="content">





	<!-- Modal -->
	<!-- <div class="modal fade" id="myModal" role="dialog">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">회원목록</h4>
				</div>
				<div class="modal-body">
				
				
				
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div> -->


	<div id="test"></div>

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
					<h3 class="box-title">판매 등록</h3>
				</div>
				<!-- /.box-header -->

				<form role="form" action="/sell/insert" method="post">
					<div class="box-body">
						<!-- 
						<div class="form-group">
							<input type="text" name="admn_id" value=""> <input
								type="text" id="mem_sq" name="mem_sq" value="">
						</div>
 -->
						<div class="form-group">
							<label for="exampleInputEmail1">회원번호</label>
							<!-- Trigger the modal with a button -->
							<input type="text" id="mem_sq" name='mem_sq' class="form-control"
								data-toggle="modal" data-target="#myModal">
						</div>

						<div class="form-group">
							<label for="exampleInputEmail1">판매물품</label> <select
								class="form-control" id="sl_prod_sq" name="sl_prod_sq">
								<c:forEach items="${sl_prod_list }" var="vo">
									<option value="${vo.sl_prod_sq}">${vo.sl_prod_nm }</option>
								</c:forEach>
							</select> <input type="text" id="mon_num" name="mon_mem_end_dd"
								class="form-control" placeholder="입력해주세요."> <label
								id="mon_label" for="exampleInputEmail1">개월</label> <input
								type="hidden" id="cpn_num" name='cpn_num' class="form-control"
								placeholder="입력해주세요."> <label id="cpn_label"
								for="exampleInputEmail1">장</label>

						</div>

						<div class="form-group">
							<label for="exampleInputEmail1" id="seat_label">좌석선택</label> <select
								class="form-control" id="seat_dvs_sq" name="seat_dvs_sq">
								<c:forEach items="${seat_dvs_list }" var="vo">
									<option value="${vo.seat_dvs_sq}">${vo.seat_dvs_nm }</option>
								</c:forEach>
							</select> <select class="form-control" id="mon_seat_sq" name="seat_sq">
								<c:forEach items="${mon_seat_list }" var="vo">
									<option value="${vo.seat_sq}">${vo.seat_nm }</option>
								</c:forEach>
							</select> <select class="form-control" id="day_seat_sq" name="seat_sq"
								disabled="disabled">
								<c:forEach items="${day_seat_list }" var="vo">
									<option value="${vo.seat_sq}">${vo.seat_nm }</option>
								</c:forEach>
							</select>
						</div>


						<div id="lc_list" class="form-group">
							<label for="exampleInputEmail1">사물함</label> <select
								class="form-control" id="lc_sq" name="lc_sq">
								<option value="null">사물함 미등록</option>
								<c:forEach items="${lc_list }" var="vo">
									<option value=${vo.lc_sq }>${vo.lc_nm }</option>
								</c:forEach>
							</select>
						</div>

						<div class="form-group">
							<label for="exampleInputEmail1">결제방법</label> <select
								class="form-control" id="by_sq" name="by_sq">
								<c:forEach items="${by_list }" var="vo">
									<option value="${vo.by_sq}">${vo.by_nm }</option>
								</c:forEach>
							</select>
						</div>

						<div class="form-group">
							<label for="exampleInputEmail1">판매금액</label> <input type="text"
								id="sl_mn" name="sl_mn" class="form-control" readonly="readonly">
						</div>



					</div>
					<!-- /.box-body -->

					<div class="box-footer">
						<button type="button" class="btn btn-primary">등록</button>
						<button type="button" class="btn btn-danger" id="cenBtn">취소</button>
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