<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<body>
	<div class="container">
		<div class="row">
			<div class="box">
				<div class="col-lg-12">
					<hr>
					<h2 class="intro-text text-center">
						<strong>지역별 식당</strong>
					</h2>
					<hr>
				</div>
				<c:forEach var="vo" items="${list}" begin="0" end="2">
				<div class="col-sm-4 text-center">
					<a href="/restaurant/restaurant_detail?id=${vo.id}"><img class="img-responsive" src="${vo.img_ori}" width="750px" alt=""></a>
					<h3>
						${vo.name } <br> <small>${vo.score }</small>
					</h3>
				</div>
				</c:forEach>
				<div class="clearfix"></div>
			</div>
		</div>

	</div>
	<!-- /.container -->
</body>
</html>