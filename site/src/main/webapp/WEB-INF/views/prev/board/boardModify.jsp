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
	
	<!-- MyCSS -->
	<link href="/resources/css/MyCSS.css" rel="stylesheet" >
	
	<title>Bootstrap Site</title>
</head>
<body onload="onPageLoad()">
<div class="container mt-3 p-5 pt-4 bg-light rounded">
	<form action="/boardPrev/modify" method="post">
	<input type="hidden" name="bid" value="${view.bid}" />
	<div class="row border-bottom border-secondary pb-1 mb-3">
		<div class="col">
			<div class="row">
				<div class="col-6">
					<h3 class="fw-bold">Board</h3>
				</div>
				<div class="col-6 text-end">
					<button type="submit" class="btn btn-sm btn-dark">저장</button>
					<button type="button" class="btn btn-sm btn-secondary">
						<a class="text-white text-decoration-none" href="/boardPrev/view?bid=${view.bid}">뒤로</a>
					</button>
				</div>
			</div>
		</div>
	</div>
	<div class="row bg-white p-4">
		<div class="border-bottom pb-2">
			<input type="text" class="form-control" name="title" placeholder="제목" area-label="게시글 제목" value="${view.title}">
		</div>
		<div class="row border-bottom py-2 align-items-center" style="font-size:14px;">
			<div class="col-auto">
				<span>작성자 : </span>
			</div>
			<div class="col">
				<input type="text" class="form-control" name="writer" placeholder="작성자" area-label="게시글 작성자" value="${view.writer}">
			</div>
		</div>
		<div class="py-3">
			<textarea class="form-control" name="content" placeholder="본문" rows="5">${view.content}</textarea>
		</div>
	</div>
	</form>
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
			$("#breadcrumb", window.parent.document).append("<li class='breadcrumb-item fw-bold' aria-current='main'>View</li>")
			$("#breadcrumb", window.parent.document).append("<li class='breadcrumb-item fw-bold active' aria-current='main'>Modify</li>")
		}
	}
</script>
</html>
