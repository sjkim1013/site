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
<!-- Header -->
<%@ include file="/WEB-INF/views/include/header.jsp" %>
	
<div class="border p-4 rounded text-secondary bg-gray">
	<h2>Welcome to JayTR</h2>
	<span>This is a site of liberty, opportunity and integration.</span>
</div>

</div>
<!-- Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
</body>
<script>

	function onPageLoad() {
// 		$(".jtr-nav-link").hover(
// 			function() {
// 			   $('.collapse').collapse('show');
// 			 }, function() {
// 			   $('.collapse').collapse('hide');
// 			 }
// 		);
	}
	
</script>
</html>