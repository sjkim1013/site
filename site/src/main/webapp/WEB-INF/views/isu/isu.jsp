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
	
	<title>JayTR</title>
</head>
<body onload="onPageLoad()">
<div class="container">
<!-- Header -->
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<%@ include file="/WEB-INF/views/include/breadcrumb.jsp" %>

<form action="isu/empList" method="GET">
<div class="row px-3 pb-3 border-bottom">
	<div class="col-7 col-sm-6 col-lg-4 col-xl-3">
		<input name="sKeyword" class="form-control form-control-sm" type="text" placeholder="Keyword" />
	</div>
	<div class="col-auto px-0">
		<button type="submit" class="btn btn-sm btn-outline-secondary">Search</button>
	</div>
</div>
</form>

<c:forEach items="${empList}" var="emp">
<div class="px-3 py-2 border-bottom fs-12px text-secondary">
<div class="row mb-2">
	<div class="col-12 col-sm-auto fs-16px">
		${emp.ent_name}
	</div>
	<div class="col d-flex align-items-end">
		${emp.unit_name} | ${emp.jikchak_name} | ${emp.name} (${emp.person_code})
	</div>
</div>
<div class="row mb-2">
	<div class="col-auto">
		<span class="fw-bold">Office.</span> ${emp.office_tel}
	</div>
	<div class="col-auto">
		<span class="fw-bold">Mobile.</span> ${emp.mobile_tel}
	</div>
	<div class="col-auto">
		<span class="fw-bold">Email.</span> ${emp.email}
	</div>
</div>
<div class="row mb-2">
	<div class="col">
		<span>접속 :</span> <a class="text-secondary" href="${emp.gw_link}" target="_blank">링크</a>
	</div>
</div>
</div>
</c:forEach>

</div>
<!-- Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
</body>
<script>

	function onPageLoad() {
		$("#breadcrumb").append("<li class='breadcrumb-item text-secondary'>Isu</li>");
		$("#breadcrumb").append("<li class='breadcrumb-item text-secondary'>Search Employees</li>");
		
		console.log("sjswork", "${keyword}");
		$("input[name=sKeyword]").val("${keyword}");
	}
	
</script>
</html>