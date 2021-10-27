<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <!-- JQuery -->
    <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
    
    <!-- Bootstrap CSS -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
	
	<!-- Common JSP -->
	<%@ include file="/WEB-INF/views/include/common.jsp" %>
	
	<title>JayTR</title>
</head>
<body onload="onPageLoad()">
<div class="container">
<div style="height: 180px;"></div>

<div class="row">
	<div class="col-1 col-sm-3 col-lg-4"></div>
	<div class="col-10 col-sm-6 col-lg-4">
		<div class="mb-3 border-bottom">
			<div class="py-2">
				<a class="fs-5 fw-bolder text-dark text-decoration-none" href="">JayTR</a>
			</div>
		</div>
		<form action="member/login" method="POST">
		<input name="email" class="form-control form-control-sm mb-2" type="email" 
			placeholder="Email" 
			required
			oninvalid="this.setCustomValidity('메일 주소를 입력해주세요.')"
			oninput = "setCustomValidity('')"
		/>
		<input name="password" class="form-control form-control-sm mb-2" type="password" 
			placeholder="Password" 
			required
			oninvalid="this.setCustomValidity('비밀번호를 입력해주세요.')"
			oninput = "setCustomValidity('')"
		/>
		<div class="mb-3">
			<input name="chkRemember" class="form-check-input" type="checkbox" />
<!-- 			<span class="fs-12px text-secondary">로그인 상태 유지</span> -->
			<span class="fs-12px text-secondary">메일 주소 기억하기</span>
		</div>
		<div class="d-grid gap-2">
			<button type="submit" class="btn btn-sm btn-outline-secondary">Login</button>
		</div>
		</form>
	</div>
	<div class="col-1 col-sm-3 col-lg-4"></div>
</div>

</div>
<!-- Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
</body>
<script>

	function onPageLoad() {
		if("${email}" != "") {
			$("input[name=email]").val("${email}");
			$("input[name=chkRemember]").prop("checked", true);
		}
	}
	
</script>
</html>