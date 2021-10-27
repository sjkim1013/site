<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- 스타일 적용 -->
<style>
.menu-item:hover {
	color: rgb(190, 190, 190)!important;
}
</style>

<div class="px-3 border-bottom">
	<div class="pt-2" align="right">
		<c:if test="${empty member}">
			<a class="fs-11px text-decoration-none text-secondary px-1" href="member/login">Login</a>
		</c:if>
		<c:if test="${not empty member}">
			<span class="fs-11px text-secondary px-1">Welcome <span class="text-decoration-underline">${member.name}</span> !</span>
			<a class="fs-11px text-decoration-none text-secondary px-1" href="member/logout">Logout</a>
		</c:if>
<!-- 		<a class="fs-11px text-decoration-none text-secondary px-1" href="prev">Prev.Ver</a> -->
	</div>
	<div class="py-2">
		<span class="fs-5 fw-bolder">JayTR</span>
	</div>
</div>
<div id="collapseParent" class="mb-3">
	<div class="border-bottom fs-12px">
		<nav class="nav">
 			<a class="menu-item jtr-nav-link text-secondary" href="">Home</a>
 			<a class="menu-item jtr-nav-link text-secondary" href="isu/empList" data-bs-toggle="collapse" data-bs-target="#collapseMenu" aria-expanded="false" aria-controls="collapseMenu">Isu</a>
 			<a class="menu-item jtr-nav-link text-secondary" href="http://www.google.com" target="_blank">Google</a>
		</nav>
	</div>
	<div id="collapseMenu" class="collapse" data-bs-parent="#collapseParent">
<!-- 		<div class="bg-lightgray px-3 py-2 fs-10px"> -->
		<div class="px-3 py-2 fs-10px">
			<a class="menu-item text-secondary text-decoration-none" href="isu/empList">Search Employee</a>
		</div>
	</div>
</div>