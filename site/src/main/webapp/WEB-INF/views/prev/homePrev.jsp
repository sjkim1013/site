<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<base href="/JayTR/" />
    <!-- Required meta tags -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <!-- JQuery -->
    <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
    
    <!-- Bootstrap CSS -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
	
	<!-- MyCSS -->
	<link href="/resources/css/MyCSS.css" rel="stylesheet" >
	
	<title>Bootstrap Site</title>
</head>
<body onload="onPageLoad()" class="overflow-hidden">
<div id="header">
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top py-1">
		<div class="container">
			<a class="navbar-brand fw-bolder me-5" target="mainIframe" href="main">JayTR</a>
			<!-- 화면 축소 시 버튼 -->
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbars" aria-controls="navbars" aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="navbar-collapse collapse" id="navbars">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item pe-1">
						<a id="nav_main" class="nav-link active" target="mainIframe" href="main">Home</a>
					</li>
					<li class="nav-item pe-1">
						<a id="nav_board" class="nav-link" target="mainIframe" href="boardPrev/list">Board</a>
					</li>
					<li class="nav-item pe-1 dropdown dropdown-hover">
						<a id="nav_dropdown" class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">
							Dropdown1
						</a>
						<ul class="dropdown-menu dropdown-menu-dark dropdown-hover-content" aria-labelledby="nav_dropdown">
							<li><a class="dropdown-item" href="#">Dropdown Item</a></li>
						</ul>
					</li>
					<li class="nav-item pe-1 dropdown dropdown-hover">
						<a id="nav_dropdown" class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">
							Dropdown2
						</a>
						<ul class="dropdown-menu dropdown-menu-dark dropdown-hover-content" aria-labelledby="nav_dropdown">
							<li><a class="dropdown-item" href="#">Dropdown Item</a></li>
						</ul>
					</li>
					<li class="nav-item pe-1">
						<a class="nav-link" href="">New.Ver</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="d-flex border-bottom bg-light py-1" style="font-size: 13px; height: 28px;">
		<div id="subNavbar" class="container ps-3">
		</div>
	</div>
</div>

	<iframe id="mainIframe" name="mainIframe" frameborder="0" width="100%" height="100%" onload="resizeIframe(this)"></iframe>

	<!-- Bootstrap Bundle with Popper -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
</body>
<script>

	function onPageLoad() {
		resizeHeader($("#header"));
		
		// iframe 세션 유지
		if("${mainIframeSession}" != "") {
			$("#mainIframe").attr("src", "${mainIframeSession}");
		}
	}
	
	function resizeHeader(obj) {
		$(obj).attr("style", "padding-top:"+ $("#header").children("nav").innerHeight() +"px;");
	}
	
	function resizeIframe(obj) {
		var pbLength = $("#header").children("nav").innerHeight() + $("#header").height();
		var styleStr = "";
		styleStr += "padding-bottom:"+ pbLength +"px;";
		$(obj).attr("style", styleStr);
	}
	
	// 각 화면에서 호출
	function onClickNav(obj) {
		// 클릭한 메뉴 활성화
		$(".nav-link").removeClass("active");
		$(obj).attr("class", "nav-link active");
		// 모바일일 경우 클릭시 메뉴바 사라짐
		$("#navbars").attr("class", "navbar-collapse collapse");
	}
	
</script>
</html>
