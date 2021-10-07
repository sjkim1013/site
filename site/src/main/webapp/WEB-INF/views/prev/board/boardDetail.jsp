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

<!-- Breadcrum -->
<%@ include file="/WEB-INF/views/include/breadcrumb_prev.jsp" %>

<div class="container p-5 pt-4 bg-light rounded">
	<div class="row border-bottom border-secondary pb-1 mb-2">
		<div class="col">
			<div class="row">
				<div class="col-6">
					<h4 class="fw-bold me-2">${view.title}</h4>
				</div>
				<div class="col-6 text-end">
					<button type="button" class="btn btn-secondary btn-sm">
						<a class="text-reset text-decoration-none" href="/boardPrev/list">목록</a>
					</button>
				</div>
			</div>
		</div>
	</div>
	<div class="row ps-1 me-3 mb-3" style="font-size:13px;">
		<div class="col-auto">
			<span>No. : </span>
			<span>${view.bid}</span>
		</div>
		<div class="col-auto">
			<span>작성자 : </span>
			<span>${view.writer}</span>
		</div>
		<div class="col-auto">
			<span>작성일자 : </span>
			<span><fmt:formatDate value="${view.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
		</div>
	</div>
	<div class="row bg-white p-3">
		<div class="col" style="font-size:15px;">
			<span>${view.content}</span>
		</div>
	</div>
	<div class="row border-bottom py-1 mt-2" style="font-size:12px;">
		<div class="col text-end">
			<a class="text-secondary" href="/boardPrev/delete?bid=${view.bid}">삭제</a>
			<a class="text-secondary" href="/boardPrev/modify?bid=${view.bid}">수정</a>
		</div>
	</div>
	
	<c:forEach items="${reply}" var="reply">
	<div class="row border-bottom ps-1 py-2" style="font-size:12px;">
		<div class="col-12 mb-1">
			<span>${reply.writer} / <fmt:formatDate value="${reply.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/></span>&nbsp;
			<span><a class="text-secondary" href="/reply/delete?bid=${reply.bid}&rid=${reply.rid}">삭제</a></span>
		</div>
		<div class="col-12">${reply.content}</div>
	</div>
	</c:forEach>
	
	<form action="/reply/write" method="post">
	<input type="hidden" name="bid" value="${view.bid}" />
	<input type="hidden" name="writer" value="익명" />
	<div class="row ps-1 py-3 gy-2">
		<div class="col-12">
			<textarea class="form-control" name="content" rows="2" style="font-size: 12px;"></textarea>
		</div>
		<div class="col-12 d-grid d-md-flex justify-content-md-end">
			<button type="submit" class="jtr-btn-xs btn-dark text-white text-decoration-none">등록</button>
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
			$("#subNavbar", window.parent.document).empty();
		}
		//Breadcrum 추가
		$("#breadcrumb").append("<li class='breadcrumb-item'><a class='text-reset text-decoration-none' href='/main'>Home</a></li>");
		$("#breadcrumb").append("<li class='breadcrumb-item active' aria-current='page'><a class='text-reset text-decoration-none' href='/boardPrev/list'>Board</a></li>");
	}
</script>
</html>
