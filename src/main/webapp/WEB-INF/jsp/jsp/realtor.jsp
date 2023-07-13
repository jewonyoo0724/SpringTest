<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Realtor input</title>
</head>
<body>

	<h1>Add Realtor</h1>
	<form method="post" action="/jsp/realtor/add">
		<label>Office</label><br>
		<input type="text" name="office"><br>
		<label>Phone Number</label><br>
		<input type="text" name="phoneNum"><br>
		<label>Address</label><br>
		<input type="text" name="address"><br>
		<label>Grade</label><br>
		<input type="text" name="grade"><br>
		<button type="submit">Add</button>
	</form>

</body>
</html>