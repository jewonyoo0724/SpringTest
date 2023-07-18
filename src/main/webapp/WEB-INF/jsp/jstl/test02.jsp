<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test02</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
	
	<h3>Problem 1</h3>
	<table class="table">
		<thead>
			<tr>
				<th>Ranking</th>
				<th>Title</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="song" items="${musicRanking }" varStatus="status">
				<tr>
					<td>${status.count }</td>
					<td>${song }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	
	<!-- 2. -->
	<table class="table">
		<thead>
			<tr>
				<th>Name</th>
				<th>Phone Number</th>
				<th>Grade</th>
				<th>Point</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="member" items="${membership}">
				<tr>
					<td>${member.name }</td>
					<td>${member.phoneNumber }</td>
					<c:choose>
						<c:when test="${member.grade eq 'VIP' }">
							<td class="text-danger">${member.grade }</td>
						</c:when>
						<c:when test="${member.grade eq 'GOLD' }">
							<td class="text-warning">${member.grade }</td>
						</c:when>
						<c:otherwise>
							<td>${member.grade }</td>
						</c:otherwise>
					
					</c:choose>
					
					<c:choose>
						<c:when test="${member.point >= 5000 }">
							<td class="text-primary">${member.point }P</td>	
						</c:when>
						<c:otherwise>
							<td>${member.point }P</td>
						</c:otherwise>
					</c:choose>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>