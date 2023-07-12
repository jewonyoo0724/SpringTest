<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>seller input</title>
</head>
<body>
	<h1>Add Seller</h1>
	
	<form method="post" action="/jsp/test01/seller/add">
		<label>Nickname</label><br>
		<input type="text" name="nickname"><br>
		<label>Profile image url</label><br>
		<input type="text" name="image"><br>
		<label>Temperature</label><br>
		<input type="text" name="temp"><br>
		<button type="submit">Add</button>
	</form>

</body>
</html>