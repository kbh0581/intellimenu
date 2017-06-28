<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="https://code.jquery.com/jquery.min.js"></script>
<script>
$(document).ready(function() {
   //이미지 크기 일정하게
   var maxWidth = -1;
   
   $('.col-sm-4.text-center.sublist').each(function() {
	   maxWidth =$(this).width();
   });

   $('.img-responsive.sublist').each(function() {
     $(this).width(maxWidth);
     $(this).height(maxWidth*0.6);
     console.log("maxHeight는"+maxWidth*0.6);
   });
   
   //div높이 일정하게   
   var maxHeight = -1;
   $('.col-sm-4.text-center.sublist').each(function() {
     maxHeight = maxHeight > $(this).height() ? maxHeight : $(this).height();
   });

   $('.col-sm-4.text-center.sublist').each(function() {
     $(this).height(maxHeight);
   });
 });
</script>
<body>
	<div class="row">
		<div class="box">
			<div class="col-lg-12">
				<hr>
				<h1 class="intro-text text-center">
					<strong>${name } </strong>
				</h1>
				<hr>
			</div>
			<c:forEach var="vo" items="${list }">
				<div class="col-sm-4 text-center sublist">
					<img class="img-responsive sublist" src="${vo.img}" alt="">
					<h3>
						${vo.title } <br> <small>by VEGE O'CLOKC</small>
					</h3>
				</div>
			</c:forEach>
			<div class="clearfix"></div>
		</div>
	</div>
</body>
</html>