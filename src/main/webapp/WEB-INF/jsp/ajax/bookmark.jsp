<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bookmark list</title>
</head>
<body>
	
	<h1>Bookmark list</h1>
	<table border="1">
		<thead>
			<tr>
				<th>No.</th>
				<th>Name</th>
				<th>Address</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="bookmark" items="${bookmarkList}" varStatus="status">
				<tr>
					<td>${status.count }</td>
					<td>${bookmark.name }</td>
					<td>${bookmark.url }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
</body>
</html>