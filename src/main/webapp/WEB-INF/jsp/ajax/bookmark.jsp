<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bookmark list</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="/css/bookmarkstyle.css" type="text/css">
</head>
<body>
	
	<div id="wrap">
		<h1>Bookmark list</h1>
		<table class="table">
			<thead>
				<tr>
					<th>No.</th>
					<th>Name</th>
					<th>Address</th>
					<th><th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="bookmark" items="${bookmarkList}" varStatus="status">
					<tr>
						<td>${status.count }</td>
						<td>${bookmark.name }</td>
						<td>${bookmark.url } </td>
						<td><button type="button" class="delete-btn">Delete</button></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	
	<script>
		$(document).ready(function(){
			
			$(".deleteBtn").on("click", function(){
				
				if($(this).))
				{
					
				}
				
				$.ajax({
					type:"get",
					url:"/ajax/bookmark/delete",
					data:{"name": name, "url": url},
					success: function(data){
						if (data.result == "success")
						{
							location.href="/ajax/bookmark/list";
						}
						else
						{
							alert("row delete error");
						}
					
					},
					error: function(){
						alert("delete error");
					}
					
				});
				
			});
		});
	</script>
</body>
</html>