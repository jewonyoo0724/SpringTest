<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>realtor info</title>
</head>
<body>
	<h1>Realtor Info</h1>
	<table border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>Office</th>
				<th>Phone Number</th>
				<th>Address</th>
				<th>Grade</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${result.id}</td>
				<td>${result.office}</td>
				<td>${result.phoneNumber}</td>
				<td>${result.address}</td>
				<td>${result.grade}</td>
			</tr>
		
		</tbody>
	</table>
	<h3>${row} rows affected.</h3>

</body>
</html>