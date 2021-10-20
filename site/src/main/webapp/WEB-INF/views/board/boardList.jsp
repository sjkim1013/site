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
<%@ include file="../include/breadcrumb.jsp" %>

<div class="container p-5 pt-4 bg-light rounded">
	<div class="row border-bottom border-secondary pb-1 mb-3">
		<div class="col">
			<div class="row">
				<div class="col-6">
					<h4 class="fw-bold">Board</h4>
				</div>
				<div class="col-6 text-end">
					<button class="btn-sm btn-dark" data-bs-toggle="modal" data-bs-target="#writeModal">글쓰기</button>
				</div>
			</div>
		</div>
	</div>
	<div class="row bg-white p-4">
		<table class="table table-hover">
		<thead>
			<tr>
				<th scope="col">No.</th>
				<th scope="col">제목</th>
				<th scope="col">작성일</th>
			</tr>
		</thead>
		<tbody>
		
			<c:forEach items="${list}" var="list">
			<tr>
				<th scope="row">${list.bid}</th>
				<td>
					<a class="text-dark text-decoration-none" href="board/view?bid=${list.bid}">${list.title}</a>
				</td>
				<td>
					<fmt:formatDate value="${list.createTime}" pattern="yyyy-MM-dd"/>
				</td>
			</tr>
			</c:forEach>
			
		</tbody>
		</table>
	</div>
	
	<!-- 글쓰기 Modal -->
	<div class="modal fade" id="writeModal" tabindex="-1" aria-labelledby="writeModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content p-2">
			<form action="/board/write" method="post">
				<div class="modal-header">
					<h5 class="modal-title" id="writeModalLabel">글쓰기</h5>
					<button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
				</div>
				<div class="modal-body">
					<div class="mb-1">
						<input type="text" class="form-control" name="title" placeholder="제목" area-label="게시글 제목">
					</div>
					<div class="mb-1">
						<input type="text" class="form-control" name="writer" placeholder="작성자" area-label="게시글 작성자">
					</div>
					<div class="mb-1">
						<textarea class="form-control" name="content" placeholder="본문" rows="5"></textarea>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary" data-bs-dismiss="modal">닫기</button>
					<button type="submit" class="btn btn-dark">등록</button>
				</div>
			</form>
			</div>
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
			$("#subNavbar", window.parent.document).empty()
		}
		//Breadcrum 추가
		$("#breadcrumb").append("<li class='breadcrumb-item'><a class='text-reset text-decoration-none' href='/main'>Home</a></li>");
		$("#breadcrumb").append("<li class='breadcrumb-item active' aria-current='page'>Board</li>");
	}
</script>
</html>
