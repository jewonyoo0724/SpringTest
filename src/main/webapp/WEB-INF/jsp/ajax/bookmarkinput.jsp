<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert bookmark</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="/css/bookmarkstyle.css" type="text/css">
</head>
<body>

	<div id="wrap">
		<h1>Add Bookmark</h1>
		<label>Name</label><br>
		<input type="text" name="name" id="nameInput"><br>
		<label>Address</label><br>
		<input type="text" name="url" id="urlInput">
		<button type="button" id="duplicateBtn">Duplicate Check</button><br>
		<div id="duplicateMsg" class="text-danger text-small">Already existing URL</div>
		<div id="uniqueMsg" class="text-success text-small">Available URL</div>
		<button type="button" id="addBtn">Add</button>
	</div>


<script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>

<script>

	$(document).ready(function(){
		
		var checkedDuplicate = false;
		var isDuplicateUrl = true;
		
		$("#urlInput").on("input", function(){
			//reset everything about duplicate check
			checkedDuplicate = false;
			isDuplicateUrl = true;
			$("#uniqueMsg").attr("style", "display: none");
			$("#uniqueMsg").attr("style", "display: none");
		});
		
		$("#duplicateBtn").on("click", function(){
			let url = $("#urlInput").val();
			
			if (url == "")
			{
				alert("Enter url");
				return;
			}
			
			$.ajax({
				type:"post",
				url:"/ajax/bookmark/url-confirm",
				data:{"url": url},
				success: function(data){
					if(data.isDuplicate == true)
					{
						$("#duplicateMsg").attr("style", "display: block");
						$("#uniqueMsg").attr("style", "display: none");
						isDuplicateUrl = true;
					}
					else
					{
						$("#uniqueMsg").attr("style", "display: block");
						$("#duplicateMsg").attr("style", "display: none");
						isDuplicateUrl = false;
						
					}
					checkedDuplicate = true;
				},
				error: function(){
					alert("duplicate check error");
				}
				
			});
		});
		
		$("#addBtn").on("click", function(){
			
			if (checkedDuplicate == false || isDuplicateUrl == true)
			{
				alert("url already existent");
				return;
			}
			
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
	
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>