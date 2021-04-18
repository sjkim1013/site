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
	<div class="row border-bottom pb-1 mb-3">
		<div class="col">
			<div class="row">
				<div class="col-6">
					<h3>Notice</h3>
				</div>
				<div class="col-6 text-end">
					<button class="btn-sm btn-dark">글쓰기</button>
				</div>
			</div>
		</div>
	</div>
	<div class="row bg-white p-4">
		<table class="table">
		<thead>
			<tr>
				<th scope="col">No</th>
				<th scope="col">Title</th>
				<th scope="col">Time</th>
			</tr>
		</thead>
		<tbody>
		
			<c:forEach items="${list}" var="list">
			<tr>
				<th scope="row">${list.notice_id}</th>
				<td>${list.title}</td>
				<td>
					<fmt:formatDate value="${list.createdTime}" pattern="yyyy-MM-dd"/>
				</td>
			</tr>
			</c:forEach>
			
		</tbody>
		</table>
	</div>
</div>

	<!-- Bootstrap Bundle with Popper -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
</body>
<script>
	function onPageLoad() {
		if(parent) {
			parent.onClickNav($("#nav_notice", window.parent.document));
		}
	}
</script>
</html>
