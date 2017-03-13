<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KANGNAM 독서실</title>

<!-- Bootstrap 3.3.4 -->

<script src="/resources/plugins/jQuery/jQuery-2.1.4.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<link rel="stylesheet" href="/resources/ex01.css">

<script type="text/javascript">
	$(document).ready(function() {

		// 퇴실 클릭시
		$(".btnOut").click(function() {
			location.href = "/seat/list?seat_aloc_sq=" + $(this).attr("id");
		});
	});
</script>

</head>
<!-- jQuery 2.1.4 -->


<body>


	<div id=wrap>

		<div class="G1"></div>
		<div class="G2"></div>
		<div class="G3"></div>
		<div class="G4"></div>

		<div>
			<div class="s_box" style="top: 0px; left: 0px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G101_no">${seatifmlist[0].seat_nm}</td>
							<td width="*" colspan="2" id="G101_name">${seatifmlist[0].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G101_inOut" align="center">${seatifmlist[0].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G101_btnIn" value="G101">입실</button> -->
								<button class="btnOut" id="${seatifmlist[0].seat_aloc_sq}"
									value="G101">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>

			<div class="s_box" style="top: 0px; left: 100px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G102_no">${seatifmlist[1].seat_nm}</td>
							<td width="*" colspan="2" id="G102_name">${seatifmlist[1].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G102_inOut" align="center">${seatifmlist[1].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G102_btnIn" value="G102">입실</button> -->
								<button class="btnOut" id="${seatifmlist[1].seat_aloc_sq}"
									value="G102">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>

			<div class="s_box" style="top: 0px; left: 200px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G103_no">${seatifmlist[2].seat_nm}</td>
							<td width="*" colspan="2" id="G103_name">${seatifmlist[2].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G103_inOut" align="center">${seatifmlist[2].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G103_btnIn" value="G103">입실</button> -->
								<button class="btnOut" id="${seatifmlist[2].seat_aloc_sq}"
									value="G103">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>

			<div class="s_box" style="top: 0px; left: 300px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G104_no">${seatifmlist[3].seat_nm}</td>
							<td width="*" colspan="2" id="G104_name">${seatifmlist[3].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G104_inOut" align="center">${seatifmlist[3].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G104_btnIn" value="G104">입실</button> -->
								<button class="btnOut" id="${seatifmlist[3].seat_aloc_sq}"
									value="G104">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>

			<div class="s_box" style="top: 0px; left: 400px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G105_no">${seatifmlist[4].seat_nm}</td>
							<td width="*" colspan="2" id="G105_name">${seatifmlist[4].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G105_inOut" align="center">${seatifmlist[4].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G105_btnIn" value="G105">입실</button> -->
								<button class="btnOut" id="${seatifmlist[4].seat_aloc_sq}"
									value="G105">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 0px; left: 500px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G106_no">${seatifmlist[5].seat_nm}</td>
							<td width="*" colspan="2" id="G106_name">${seatifmlist[5].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G106_inOut" align="center">${seatifmlist[5].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G106_btnIn" value="G106">입실</button> -->
								<button class="btnOut" id="${seatifmlist[5].seat_aloc_sq}"
									value="G106">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 100px; left: 500px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G107_no">${seatifmlist[6].seat_nm}</td>
							<td width="*" colspan="2" id="G107_name">${seatifmlist[6].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G107_inOut" align="center">${seatifmlist[6].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G107_btnIn" value="G107">입실</button> -->
								<button class="btnOut" id="${seatifmlist[6].seat_aloc_sq}"
									value="G107">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 200px; left: 500px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G108_no">${seatifmlist[7].seat_nm}</td>
							<td width="*" colspan="2" id="G108_name">${seatifmlist[7].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G108_inOut" align="center">${seatifmlist[7].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- 	<button class="btnIn" id="G108_btnIn" value="G108">입실</button> -->
								<button class="btnOut" id="${seatifmlist[7].seat_aloc_sq}"
									value="G108">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 300px; left: 500px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G109_no">${seatifmlist[8].seat_nm}</td>
							<td width="*" colspan="2" id="G109_name">${seatifmlist[8].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G109_inOut" align="center">${seatifmlist[8].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G109_btnIn" value="G109">입실</button> -->
								<button class="btnOut" id="${seatifmlist[8].seat_aloc_sq}"
									value="G109">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 400px; left: 500px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G110_no">${seatifmlist[9].seat_nm}</td>
							<td width="*" colspan="2" id="G110_name">${seatifmlist[9].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G110_inOut" align="center">${seatifmlist[9].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G110_btnIn" value="G110">입실</button> -->
								<button class="btnOut" id="${seatifmlist[9].seat_aloc_sq}"
									value="G110">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 400px; left: 400px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G111_no">${seatifmlist[10].seat_nm}</td>
							<td width="*" colspan="2" id="G111_name">${seatifmlist[10].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G111_inOut" align="center">${seatifmlist[10].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G111_btnIn" value="G111">입실</button> -->
								<button class="btnOut" id="${seatifmlist[10].seat_aloc_sq}"
									value="G111">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 400px; left: 300px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G112_no">${seatifmlist[11].seat_nm}</td>
							<td width="*" colspan="2" id="G112_name">${seatifmlist[11].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G112_inOut" align="center">${seatifmlist[11].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- 	<button class="btnIn" id="G112_btnIn" value="G112">입실</button> -->
								<button class="btnOut" id="${seatifmlist[11].seat_aloc_sq}"
									value="G112">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 400px; left: 200px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G113_no">${seatifmlist[12].seat_nm}</td>
							<td width="*" colspan="2" id="G113_name">${seatifmlist[12].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G113_inOut" align="center">${seatifmlist[12].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G113_btnIn" value="G113">입실</button> -->
								<button class="btnOut" id="${seatifmlist[12].seat_aloc_sq}"
									value="G113">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 400px; left: 0px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G114_no">${seatifmlist[13].seat_nm}</td>
							<td width="*" colspan="2" id="G114_name">${seatifmlist[13].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G114_inOut" align="center">${seatifmlist[13].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G114_btnIn" value="G114">입실</button> -->
								<button class="btnOut" id="${seatifmlist[13].seat_aloc_sq}"
									value="G114">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 300px; left: 0px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G115_no">${seatifmlist[14].seat_nm}</td>
							<td width="*" colspan="2" id="G115_name">${seatifmlist[14].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G115_inOut" align="center">${seatifmlist[14].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G115_btnIn" value="G115">입실</button> -->
								<button class="btnOut" id="${seatifmlist[14].seat_aloc_sq}"
									value="G115">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 200px; left: 0px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G116_no">${seatifmlist[15].seat_nm}</td>
							<td width="*" colspan="2" id="G116_name">${seatifmlist[15].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G116_inOut" align="center">${seatifmlist[15].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- 	<button class="btnIn" id="G116_btnIn" value="G116">입실</button> -->
								<button class="btnOut" id="${seatifmlist[15].seat_aloc_sq}"
									value="G116">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 100px; left: 0px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G117_no">${seatifmlist[16].seat_nm}</td>
							<td width="*" colspan="2" id="G117_name">${seatifmlist[16].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G117_inOut" align="center">${seatifmlist[16].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G117_btnIn" value="G117">입실</button> -->
								<button class="btnOut" id="${seatifmlist[16].seat_aloc_sq}"
									value="G117">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 200px; left: 200px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G118_no">${seatifmlist[17].seat_nm}</td>
							<td width="*" colspan="2" id="G118_name">${seatifmlist[17].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G118_inOut" align="center">${seatifmlist[17].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G118_btnIn" value="G118">입실</button> -->
								<button class="btnOut" id="${seatifmlist[17].seat_aloc_sq}"
									value="G118">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 200px; left: 300px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G119_no">${seatifmlist[18].seat_nm}</td>
							<td width="*" colspan="2" id="G119_name">${seatifmlist[18].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G119_inOut" align="center">${seatifmlist[18].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G119_btnIn" value="G119">입실</button> -->
								<button class="btnOut" id="${seatifmlist[18].seat_aloc_sq}"
									value="G119">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>

		</div>

		<div>


			<div class="s_box" style="top: 0px; left: 650px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G201_no">${seatifmlist[19].seat_nm}</td>
							<td width="*" colspan="2" id="G201_name">${seatifmlist[19].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G201_inOut" align="center">${seatifmlist[19].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G201_btnIn" value="G201">입실</button> -->
								<button class="btnOut" id="${seatifmlist[19].seat_aloc_sq}"
									value="G201">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>

			<div class="s_box" style="top: 0px; left: 750px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G202_no">${seatifmlist[20].seat_nm}</td>
							<td width="*" colspan="2" id="G202_name">${seatifmlist[20].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G202_inOut" align="center">${seatifmlist[20].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G202_btnIn" value="G202">입실</button> -->
								<button class="btnOut" id="${seatifmlist[20].seat_aloc_sq}"
									value="G202">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>

			<div class="s_box" style="top: 0px; left: 850px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G203_no">${seatifmlist[21].seat_nm}</td>
							<td width="*" colspan="2" id="G203_name">${seatifmlist[21].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G203_inOut" align="center">${seatifmlist[21].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G203_btnIn" value="G203">입실</button> -->
								<button class="btnOut" id="${seatifmlist[21].seat_aloc_sq}"
									value="G203">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>

			<div class="s_box" style="top: 0px; left: 950px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G204_no">${seatifmlist[22].seat_nm}</td>
							<td width="*" colspan="2" id="G204_name">${seatifmlist[22].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G204_inOut" align="center">${seatifmlist[22].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- 	<button class="btnIn" id="G204_btnIn" value="G204">입실</button> -->
								<button class="btnOut" id="${seatifmlist[22].seat_aloc_sq}"
									value="G204">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>

			<div class="s_box" style="top: 0px; left: 1050px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G205_no">${seatifmlist[23].seat_nm}</td>
							<td width="*" colspan="2" id="G205_name">${seatifmlist[23].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G205_inOut" align="center">${seatifmlist[23].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G205_btnIn" value="G205">입실</button> -->
								<button class="btnOut" id="${seatifmlist[23].seat_aloc_sq}"
									value="G205">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 200px; left: 1050px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G206_no">${seatifmlist[24].seat_nm}</td>
							<td width="*" colspan="2" id="G206_name">${seatifmlist[24].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G201_inOut" align="center">${seatifmlist[24].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G206_btnIn" value="G206">입실</button> -->
								<button class="btnOut" id="${seatifmlist[24].seat_aloc_sq}"
									value="G206">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 200px; left: 950px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G207_no">${seatifmlist[25].seat_nm}</td>
							<td width="*" colspan="2" id="G207_name">${seatifmlist[25].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G207_inOut" align="center">${seatifmlist[25].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G207_btnIn" value="G207">입실</button> -->
								<button class="btnOut" id="${seatifmlist[25].seat_aloc_sq}"
									value="G207">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 200px; left: 850px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G208_no">${seatifmlist[26].seat_nm}</td>
							<td width="*" colspan="2" id="G208_name">${seatifmlist[26].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G208_inOut" align="center">${seatifmlist[26].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G208_btnIn" value="G208">입실</button> -->
								<button class="btnOut" id="${seatifmlist[26].seat_aloc_sq}"
									value="G208">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 100px; left: 650px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G209_no">${seatifmlist[27].seat_nm}</td>
							<td width="*" colspan="2" id="G209_name">${seatifmlist[27].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G209_inOut" align="center">${seatifmlist[27].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G209_btnIn" value="G209">입실</button> -->
								<button class="btnOut" id="${seatifmlist[27].seat_aloc_sq}"
									value="G209">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 200px; left: 650px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G210_no">${seatifmlist[28].seat_nm}</td>
							<td width="*" colspan="2" id="G210_name">${seatifmlist[28].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G210_inOut" align="center">${seatifmlist[28].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G210_btnIn" value="G210">입실</button> -->
								<button class="btnOut" id="${seatifmlist[28].seat_aloc_sq}"
									value="G210">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 300px; left: 650px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G211_no">${seatifmlist[29].seat_nm}</td>
							<td width="*" colspan="2" id="G211_name">${seatifmlist[29].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G211_inOut" align="center">${seatifmlist[29].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G211_btnIn" value="G211">입실</button> -->
								<button class="btnOut" id="${seatifmlist[29].seat_aloc_sq}"
									value="G211">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 400px; left: 650px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G212_no">${seatifmlist[30].seat_nm}</td>
							<td width="*" colspan="2" id="G212_name">${seatifmlist[30].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G212_inOut" align="center">${seatifmlist[30].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G212_btnIn" value="G212">입실</button> -->
								<button class="btnOut" id="${seatifmlist[30].seat_aloc_sq}"
									value="G212">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 400px; left: 850px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G213_no">${seatifmlist[31].seat_nm}</td>
							<td width="*" colspan="2" id="G213_name">${seatifmlist[31].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G213_inOut" align="center">${seatifmlist[31].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G213_btnIn" value="G213">입실</button> -->
								<button class="btnOut" id="${seatifmlist[31].seat_aloc_sq}"
									value="G213">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 400px; left: 950px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G214_no">${seatifmlist[32].seat_nm}</td>
							<td width="*" colspan="2" id="G214_name">${seatifmlist[32].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G214_inOut" align="center">${seatifmlist[32].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G214_btnIn" value="G214">입실</button> -->
								<button class="btnOut" id="${seatifmlist[32].seat_aloc_sq}"
									value="G214">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 400px; left: 1050px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G215_no">${seatifmlist[33].seat_nm}</td>
							<td width="*" colspan="2" id="G215_name">${seatifmlist[33].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G215_inOut" align="center">${seatifmlist[33].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G215_btnIn" value="G215">입실</button> -->
								<button class="btnOut" id="${seatifmlist[33].seat_aloc_sq}"
									value="G215">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>


		</div>


		<div>


			<div class="s_box" style="top: 550px; left: 0px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G301_no">${seatifmlist[34].seat_nm}</td>
							<td width="*" colspan="2" id="G301_name">${seatifmlist[34].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G201_inOut" align="center">${seatifmlist[34].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G301_btnIn" value="G301">입실</button> -->
								<button class="btnOut" id="${seatifmlist[34].seat_aloc_sq}"
									value="G301">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>

			<div class="s_box" style="top: 550px; left: 100px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G302_no">${seatifmlist[35].seat_nm}</td>
							<td width="*" colspan="2" id="G302_name">${seatifmlist[35].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G302_inOut" align="center">${seatifmlist[35].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G302_btnIn" value="G302">입실</button> -->
								<button class="btnOut" id="${seatifmlist[35].seat_aloc_sq}"
									value="G302">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>

			<div class="s_box" style="top: 550px; left: 200px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G303_no">${seatifmlist[36].seat_nm}</td>
							<td width="*" colspan="2" id="G303_name">${seatifmlist[36].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G303_inOut" align="center">${seatifmlist[36].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G303_btnIn" value="G303">입실</button> -->
								<button class="btnOut" id="${seatifmlist[36].seat_aloc_sq}"
									value="G303">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>

			<div class="s_box" style="top: 550px; left: 300px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G304_no">${seatifmlist[37].seat_nm}</td>
							<td width="*" colspan="2" id="G304_name">${seatifmlist[37].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G304_inOut" align="center">${seatifmlist[37].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G304_btnIn" value="G304">입실</button> -->
								<button class="btnOut" id="${seatifmlist[37].seat_aloc_sq}"
									value="G304">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>

			<div class="s_box" style="top: 550px; left: 400px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G305_no">${seatifmlist[38].seat_nm}</td>
							<td width="*" colspan="2" id="G305_name">${seatifmlist[38].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G305_inOut" align="center">${seatifmlist[38].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G305_btnIn" value="G305">입실</button> -->
								<button class="btnOut" id="${seatifmlist[38].seat_aloc_sq}"
									value="G305">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 750px; left: 0px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G306_no">${seatifmlist[39].seat_nm}</td>
							<td width="*" colspan="2" id="G206_name">${seatifmlist[39].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G301_inOut" align="center">${seatifmlist[39].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G306_btnIn" value="G306">입실</button> -->
								<button class="btnOut" id="${seatifmlist[39].seat_aloc_sq}"
									value="G306">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 750px; left: 100px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G307_no">${seatifmlist[40].seat_nm}</td>
							<td width="*" colspan="2" id="G307_name">${seatifmlist[40].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G307_inOut" align="center">${seatifmlist[40].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G307_btnIn" value="G307">입실</button> -->
								<button class="btnOut" id="${seatifmlist[40].seat_aloc_sq}"
									value="G307">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 750px; left: 200px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G308_no">${seatifmlist[41].seat_nm}</td>
							<td width="*" colspan="2" id="G308_name">${seatifmlist[41].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G308_inOut" align="center">${seatifmlist[41].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G308_btnIn" value="G308">입실</button> -->
								<button class="btnOut" id="${seatifmlist[41].seat_aloc_sq}"
									value="G308">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 750px; left: 300px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G309_no">${seatifmlist[42].seat_nm}</td>
							<td width="*" colspan="2" id="G309_name">${seatifmlist[42].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G309_inOut" align="center">${seatifmlist[42].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G309_btnIn" value="G309">입실</button> -->
								<button class="btnOut" id="${seatifmlist[42].seat_aloc_sq}"
									value="G309">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 950px; left: 0px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G310_no">${seatifmlist[43].seat_nm}</td>
							<td width="*" colspan="2" id="G310_name">${seatifmlist[43].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G310_inOut" align="center">${seatifmlist[43].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G310_btnIn" value="G310">입실</button> -->
								<button class="btnOut" id="${seatifmlist[43].seat_aloc_sq}"
									value="G310">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 950px; left: 100px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G311_no">${seatifmlist[44].seat_nm}</td>
							<td width="*" colspan="2" id="G311_name">${seatifmlist[44].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G311_inOut" align="center">${seatifmlist[44].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G311_btnIn" value="G311">입실</button> -->
								<button class="btnOut" id="${seatifmlist[44].seat_aloc_sq}"
									value="G311">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 950px; left: 200px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G312_no">${seatifmlist[45].seat_nm}</td>
							<td width="*" colspan="2" id="G312_name">${seatifmlist[45].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G312_inOut" align="center">${seatifmlist[45].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G312_btnIn" value="G312">입실</button> -->
								<button class="btnOut" id="${seatifmlist[45].seat_aloc_sq}"
									value="G312">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 950px; left: 300px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G313_no">${seatifmlist[46].seat_nm}</td>
							<td width="*" colspan="2" id="G313_name">${seatifmlist[46].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G313_inOut" align="center">${seatifmlist[46].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G313_btnIn" value="G313">입실</button> -->
								<button class="btnOut" id="${seatifmlist[46].seat_aloc_sq}"
									value="G313">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box" style="top: 950px; left: 400px">
				<table>
					<tbody>
						<tr>
							<td width="40px" id="G314_no">${seatifmlist[47].seat_nm}</td>
							<td width="*" colspan="2" id="G314_name">${seatifmlist[47].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G314_inOut" align="center">${seatifmlist[47].seat_aloc_strt_tm}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">
								<!-- <button class="btnIn" id="G314_btnIn" value="G314">입실</button> -->
								<button class="btnOut" id="${seatifmlist[47].seat_aloc_sq}"
									value="G314">퇴실</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>

		</div>

		<div>


			<div class="s_box2" style="top: 650px; left: 550px">
				<table>
					<tbody>
						<tr>
							<td width="40px" class="GS4">${monList[0].seat_nm}</td>
							<td width="*" colspan="2" id="G401_name">${monList[0].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G401_inOut" align="center">${monList[0].mon_mem_end_dd}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">고정석 <%--  <button class="btnIn" id="G401_btnIn" value="G401">입실</button> 
								 <button class="btnOut" id="${monList[0].seat_aloc_sq}" value="G401">퇴실</button>  --%>
							</td>
						</tr>
					</tbody>
				</table>
			</div>

			<div class="s_box2" style="top: 750px; left: 550px">
				<table>
					<tbody>
						<tr>
							<td width="40px" class="GS4">${monList[1].seat_nm}</td>
							<td width="*" colspan="2" id="G402_name">${monList[1].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G402_inOut" align="center">${monList[1].mon_mem_end_dd}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">고정석 <!-- <button class="btnIn" id="G402_btnIn" value="G402">입실</button> -->
								<%-- <button class="btnOut" id="${monList[1].seat_aloc_sq}" value="G402">퇴실</button> --%>
							</td>
						</tr>
					</tbody>
				</table>
			</div>

			<div class="s_box2" style="top: 850px; left: 550px">
				<table>
					<tbody>
						<tr>
							<td width="40px" class="GS4">${monList[2].seat_nm}</td>
							<td width="*" colspan="2" id="G403_name">${monList[2].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G403_inOut" align="center">${monList[2].mon_mem_end_dd}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">고정석 <!-- 	<button class="btnIn" id="G403_btnIn" value="G403">입실</button> -->
								<%-- 	<button class="btnOut" id="${monList[2].seat_aloc_sq}" value="G403">퇴실</button> --%>
							</td>
						</tr>
					</tbody>
				</table>
			</div>

			<div class="s_box2" style="top: 950px; left: 550px">
				<table>
					<tbody>
						<tr>
							<td width="40px" class="GS4">${monList[3].seat_nm}</td>
							<td width="*" colspan="2" id="G404_name">${monList[3].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G404_inOut" align="center">${monList[3].mon_mem_end_dd}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">고정석 <!-- <button class="btnIn" id="G404_btnIn" value="G404">입실</button> -->
								<%-- <button class="btnOut" id="${monList[3].seat_aloc_sq}" value="G404">퇴실</button> --%>
							</td>
						</tr>
					</tbody>
				</table>
			</div>

			<div class="s_box2" style="top: 650px; left: 750px">
				<table>
					<tbody>
						<tr>
							<td width="40px" class="GS4">${monList[4].seat_nm}</td>
							<td width="*" colspan="2" id="G405_name">${monList[4].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G405_inOut" align="center">${monList[4].mon_mem_end_dd}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">고정석 <!-- <button class="btnIn" id="G405_btnIn" value="G405">입실</button> -->
								<%-- 	<button class="btnOut" id="${monList[4].seat_aloc_sq}" value="G405">퇴실</button> --%>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box2" style="top: 750px; left: 750px">
				<table>
					<tbody>
						<tr>
							<td width="40px" class="GS4">${monList[5].seat_nm}</td>
							<td width="*" colspan="2" id="G406_name">${monList[5].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G406_inOut" align="center">${monList[5].mon_mem_end_dd}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">고정석 <!-- <button class="btnIn" id="G406_btnIn" value="G406">입실</button> -->
								<%-- 	<button class="btnOut" id="${monList[5].seat_aloc_sq}" value="G406">퇴실</button> --%>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box2" style="top: 850px; left: 750px">
				<table>
					<tbody>
						<tr>
							<td width="40px" class="GS4">${monList[6].seat_nm}</td>
							<td width="*" colspan="2" id="G407_name">${monList[6].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G407_inOut" align="center">${monList[6].mon_mem_end_dd}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">고정석 <!-- 	<button class="btnIn" id="G407_btnIn" value="G407">입실</button> -->
								<%-- <button class="btnOut" id="${monList[6].seat_aloc_sq}" value="G407">퇴실</button> --%>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box2" style="top: 950px; left: 750px">
				<table>
					<tbody>
						<tr>
							<td width="40px" class="GS4">${monList[7].seat_nm}</td>
							<td width="*" colspan="2" id="G408_name">${monList[7].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G408_inOut" align="center">${monList[7].mon_mem_end_dd}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">고정석 <!-- <button class="btnIn" id="G408_btnIn" value="G408">입실</button> -->
								<%-- 	<button class="btnOut" id="${monList[7].seat_aloc_sq}" value="G408">퇴실</button> --%>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box2" style="top: 650px; left: 850px">
				<table>
					<tbody>
						<tr>
							<td width="40px" class="GS4">${monList[8].seat_nm}</td>
							<td width="*" colspan="2" id="G409_name">${monList[8].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G409_inOut" align="center">${monList[8].mon_mem_end_dd}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">고정석 <%-- 	<button class="btnIn" id="G409_btnIn" value="G409">입실</button>
								<button class="btnOut" id="${monList[8].seat_aloc_sq}" value="G409">퇴실</button> --%>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box2" style="top: 750px; left: 850px">
				<table>
					<tbody>
						<tr>
							<td width="40px" class="GS4">${monList[9].seat_nm}</td>
							<td width="*" colspan="2" id="G410_name">${monList[9].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G410_inOut" align="center">${monList[9].mon_mem_end_dd}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">고정석 <%-- 	<button class="btnIn" id="G410_btnIn" value="G410">입실</button>
								<button class="btnOut" id="${monList[9].seat_aloc_sq}" value="G410">퇴실</button> --%>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box2" style="top: 850px; left: 850px">
				<table>
					<tbody>
						<tr>
							<td width="40px" class="GS4">${monList[10].seat_nm}</td>
							<td width="*" colspan="2" id="G411_name">${monList[10].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G411_inOut" align="center">${monList[10].mon_mem_end_dd}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">고정석 <%-- <button class="btnIn" id="G411_btnIn" value="G411">입실</button>
								<button class="btnOut" id="${monList[10].seat_aloc_sq}" value="G411">퇴실</button> --%>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box2" style="top: 950px; left: 850px">
				<table>
					<tbody>
						<tr>
							<td width="40px" class="GS4">${monList[11].seat_nm}</td>
							<td width="*" colspan="2" id="G412_name">${monList[11].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G412_inOut" align="center">${monList[11].mon_mem_end_dd}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">고정석 <%-- <button class="btnIn" id="G412_btnIn" value="G412">입실</button>
								<button class="btnOut" id="${monList[11].seat_aloc_sq}" value="G412">퇴실</button> --%>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box2" style="top: 550px; left: 1050px">
				<table>
					<tbody>
						<tr>
							<td width="40px" class="GS4">${monList[12].seat_nm}</td>
							<td width="*" colspan="2" id="G413_name">${monList[12].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G413_inOut" align="center">${monList[12].mon_mem_end_dd}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">고정석 <%-- <button class="btnIn" id="G413_btnIn" value="G413">입실</button>
								<button class="btnOut" id="${monList[12].seat_aloc_sq}" value="G413">퇴실</button> --%>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box2" style="top: 650px; left: 1050px">
				<table>
					<tbody>
						<tr>
							<td width="40px" class="GS4">${monList[13].seat_nm}</td>
							<td width="*" colspan="2" id="G414_name">${monList[13].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G414_inOut" align="center">${monList[13].mon_mem_end_dd}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">고정석 <%-- 	<button class="btnIn" id="G414_btnIn" value="G414">입실</button>
								<button class="btnOut" id="${monList[13].seat_aloc_sq}" value="G414">퇴실</button> --%>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box2" style="top: 750px; left: 1050px">
				<table>
					<tbody>
						<tr>
							<td width="40px" class="GS4">${monList[14].seat_nm}</td>
							<td width="*" colspan="2" id="G415_name">${monList[14].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G415_inOut" align="center">${monList[14].mon_mem_end_dd}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">고정석 <%-- <button class="btnIn" id="G415_btnIn" value="G415">입실</button>
								<button class="btnOut" id="${monList[14].seat_aloc_sq}" value="G415">퇴실</button> --%>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box2" style="top: 850px; left: 1050px">
				<table>
					<tbody>
						<tr>
							<td width="40px" class="GS4">${monList[15].seat_nm}</td>
							<td width="*" colspan="2" id="G416_name">${monList[15].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G416_inOut" align="center">${monList[15].mon_mem_end_dd}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">고정석 <%-- <button class="btnIn" id="G416_btnIn" value="G416">입실</button>
								<button class="btnOut" id="${monList[15].seat_aloc_sq}" value="G416">퇴실</button> --%>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="s_box2" style="top: 950px; left: 1050px">
				<table>
					<tbody>
						<tr>
							<td width="40px" class="GS4">${monList[16].seat_nm}</td>
							<td width="*" colspan="2" id="G417_name">${monList[16].mem_nm}</td>
						</tr>
						<tr>
							<td colspan="4" id="G417_inOut" align="center">${monList[16].mon_mem_end_dd}</td>
						</tr>
						<tr>
							<td colspan="4" class="clearfix">고정석 <%-- 	<button class="btnIn" id="G417_btnIn" value="G417">입실</button>
								<button class="btnOut" id="${monList[16].seat_aloc_sq}" value="G417">퇴실</button> --%>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>

		<div class="laptop" style="top: 50px; left: 1170px">
			<button class="lapname">노트북 1</button>
		</div>
		<div class="laptop" style="top: 150px; left: 1170px">
			<button class="lapname">노트북 2</button>
		</div>
		<div class="laptop" style="top: 250px; left: 1170px">
			<button class="lapname">노트북 3</button>
		</div>
		<div class="laptop" style="top: 350px; left: 1170px">
			<button class="lapname">노트북 4</button>
		</div>


	</div>
	<!--wrap 종료태그 -->


</body>

<!-- 
<script>
$('.btnIn').click(function(){           // #의 필요성  ,  . 은 클래스 명을 가져올때
  console.log('입실로직 실행->' + $(this).val());
  $("#"+$(this).val()+"_name").html('정-'+$(this).val());
  $("#"+$(this).val()+"_status").attr('bgcolor', 'green');

  var now = new Date();
  var nowHHmmSS = now.getHours() + ":" + now.getHours() + ":" + now.getSeconds();
  $("#"+$(this).val()+"_inOut").html(nowHHmmSS);

  // 버튼 비 활성화 : 중복실행 방지...
  $(this).attr('disabled', true);
});



$('.btnOut').click(function(){
  if ($("#"+$(this).val()+"_name").html() == '') {
	  console.log('빈자리임..');
	  return;
  }
  console.log('퇴실로직 실행->' + $(this).val());
  $("#"+$(this).val()+"_name").html('');
  $("#"+$(this).val()+"_status").attr('bgcolor', 'efefef');
  $("#"+$(this).val()+"_inOut").html('');

  // 입실버튼 활성화
  $("#"+$(this).val()+"_btnIn").attr('disabled', false);
});
</script> -->