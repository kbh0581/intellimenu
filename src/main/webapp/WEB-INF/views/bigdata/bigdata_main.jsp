<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script>
$(function() {
	//이미지 크기 일정하게
	
	var maxWidth = -1;
	$('.col-sm-4.text-center.sublist').each(function() {
		maxWidth = $(this).width();
		$(this).height(maxWidth*0.6+70)
	});

	$('.img-responsive.sublist').each(function() {
		$(this).width(maxWidth);
		$(this).height(maxWidth*0.6);
	});

});

/* function showGraph(){
	 $.ajax({
		 type:'POST',
		 url:'/main/graph',
		 success:function(response){
			//alert(response);
			 $('#graph').html(response);	 
			 
		 }
	 });
	 
}
$(function(){
	showGraph();
	setInterval("showGraph()", 10000);
	
 });
  */
 
$(function(){
	 (function showGraph(){
		 $.ajax({
			 type:'POST',
			 url:'/main/graph',
			 success:function(response){
				//alert(response);
				 $('#graph').html(response);	 
				 
			 }
		 });
		 setTimeout(showGraph, 10000);
		 
	 })();
	
});

  
	 
	
	 
 
 
</script>

<div class="container">
	${hello }
	<div class="row">
		<div class="box">
			<div class="col-lg-12">
				<hr>
				<h1 class="intro-text text-center">
					<strong>SNS 인기음식<br>
					</strong>
				</h1>
				<hr>
			</div>
			<div id="graph"></div>
	
			<div class="clearfix"></div>
		</div>
	
	</div>
	<div class="row">
		<div class="box">
			<div class="col-lg-12">
				<hr>
				<h1 class="intro-text text-center">
					<strong>${weather}에 추천하는 레시피</strong>
				</h1>
				<hr>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	
	
	<div class="row">
	<!-- start 여기에 붙여넣으세요 -->
	
	
	
	
	
	<!-- end 여기에 붙여넣으세요 -->
	</div>


</div>
