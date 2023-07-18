<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test05</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="/css/test05style.css" type="text/css">
</head>
<body>
	
	<div id="wrap" class="d-flex">
		<nav class="left col-2">
			<div class="">
				<a class="text-white" href="/jstl/test05"> Weather</a><br>
			</div>
			<div class="pt-2">
				<a class="text-white" href="/jstl/weatherinput">Insert Weather</a><br>
			</div>
			<div class="pt-2">
				<a class="text-white" href="#">Theme</a><br>
			</div>
			<div class="pt-2">
				<a class="text-white" href="#">Observation</a>
			</div>
			
		</nav>
		<div class="height pl-4 col-9">
			<h3>Weather History</h3>
			<table class="table">
				<thead>
					<tr>
						<th>Date</th>
						<th>Weather</th>
						<th>Temperature</th>
						<th>Precipitation</th>
						<th>Micro-dust</th>
						<th>Wind speed</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="weather" items="${weatherList}">
						<tr>
							<td> <fmt:formatDate value="${weather.date }" pattern="yyyy년 M월 d일"/></td>
							<c:choose >
								<c:when test="${weather.weather eq '비' }">
									<td><img alt="rain" src="http://marondal.com/material/images/dulumary/web/jstl/rainy.jpg"></td>
								</c:when>
								<c:when test="${weather.weather eq '맑음' }">
									<td><img alt="clear" src="http://marondal.com/material/images/dulumary/web/jstl/sunny.jpg"></td>
								</c:when>
								<c:when test="${weather.weather eq '맑음' }">
									<td><img alt="little-cloudy" src="http://marondal.com/material/images/dulumary/web/jstl/partlyCloudy.jpg"></td>
								</c:when>
								<c:otherwise>
									<td><img alt="cloudy" src="http://marondal.com/material/images/dulumary/web/jstl/cloudy.jpg"></td>
								</c:otherwise>
							</c:choose>
							<td>${weather.temperatures }°C</td>
							<td>${weather.precipitation }mm</td>
							<td>${weather.microDust }</td>
							<td>${weather.windspeed }km/h</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>