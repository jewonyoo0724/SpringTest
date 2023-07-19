<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>weatherinput</title>
</head>
<body>
	<h1>Insert Weather</h1>
	
	<form action="/jstl/test05/input" method="post">
		<label>Date</label><input type="text" name="date"><br>
		<label>Weather</label>
		<select name="weather">
			<option>맑음</option>
			<option>구름조금</option>
			<option>흐림</option>
			<option>비</option>
		</select><br>
		<label>Microdust</label>
		<select name="microDust">
			<option>보통</option>
			<option>좋음</option>
			<option>나쁨</option>
			<option>최악</option>
		</select><br>
		<label>Temperature</label><input type="text" name="temperature"><br>
		<label>Precipitation</label><input type="text" name="precipitation"><br>
		<label>Windspeed</label><input type="text" name="windspeed">
		<button type="submit">Add</button>
	</form>
</body>
</html>