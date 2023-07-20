<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert bookmark</title>
</head>
<body>

	<h1>Add Bookmark</h1>
	<label>Name</label><br>
	<input type="text" name="name" id="nameInput"><br>
	<label>Address</label><br>
	<input type="text" name="url" id="urlInput"><br><br>
	<button type="button" id="addBtn">Add</button>


<script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>

<script>
	$(document).ready(function(){
		
		$("#addBtn").on("click", function(){
			
			let name = $("#nameInput").val();
			let url = $("#urlInput").val();
			
			if (name == "" || url == "")
			{
				alert("Category emtpy");
				return;
			}
			else if ((url.substring(0, 7) != "http://") && (url.substring(0, 8) != "https://"))
			{
				alert("Invalid url");
				return;
			}
			
			$.ajax({
				type:"post",
				url:"/ajax/bookmark/add",
				data:{"name":name, "url":url}, //this "data" and "data" in line below are not the same
				success: function(data){ //data = statusMap from /ajax/bookmark/add
					if(data.status == "success")
					{
						location.href="/ajax/bookmark/list";
					}
					else
					{
						alert("Input fail");
					}
				},
				error:function(){
					alert("Input error");
				}
			});
			
		});
		
	});

</script>
	

</body>
</html>