<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- Base URL -->
<base href="/JayTR/" />
<!-- MyCSS -->
<link href="resources/css/MyCSS.css" rel="stylesheet" >

<!-- 폰트(font) 적용 -->
<style>
@import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap');
body {
	font-family: 'Noto Sans KR', sans-serif;
}
</style>

<script>
/* 
 * Controller에거서 message가 있으면 출력 
 */
if("${message}" != "") {
	alert("${message}");
}
</script>