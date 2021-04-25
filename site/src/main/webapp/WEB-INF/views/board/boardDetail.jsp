<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
	
	<title>Bootstrap Site</title>
</head>
<body onload="onPageLoad()">
<div class="container mt-3 p-5 pt-4 bg-light rounded">
	<div class="row border-bottom border-secondary pb-1 mb-3">
		<div class="col">
			<div class="row">
				<div class="col-6">
					<h3 class="fw-bold">Board</h3>
				</div>
				<div class="col-6 text-end">
					<button type="button" class="btn-sm btn-danger">
						<a class="text-white text-decoration-none" href="/board/delete?bid=${view.bid}">삭제</a>
					</button>
					<button type="button" class="btn-sm btn-secondary">
						<a class="text-white text-decoration-none" href="/board/list">목록</a>
					</button>
				</div>
			</div>
		</div>
	</div>
	<div class="row bg-white p-4">
		<div class="border-bottom">
			<h5 class="fw-bold">${view.title}</h5>
		</div>
		<div class="border-bottom py-2" style="font-size:14px;">
			<div>
				<span>작성자 : </span>
				<span>${view.writer}</span>
			</div>
			<div>
				<span>작성일자 : </span>
				<span><fmt:formatDate value="${view.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
			</div>
		</div>
		<div class="py-3">
			<span>${view.content}</span>
		</div>
	</div>
</div>

	<!-- Bootstrap Bundle with Popper -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
</body>
<script>
	function onPageLoad() {
		if(parent) {
			parent.onClickNav($("#nav_board", window.parent.document));
			//서브 네비에 항목 출력
			$("#breadcrumb", window.parent.document).empty()
			$("#breadcrumb", window.parent.document).append("<li class='breadcrumb-item fw-bold' aria-current='main'>Board</li>")
			$("#breadcrumb", window.parent.document).append("<li class='breadcrumb-item fw-bold active' aria-current='main'>View</li>")
		}
	}
</script>
</html>
