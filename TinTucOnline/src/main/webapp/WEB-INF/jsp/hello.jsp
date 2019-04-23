<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <!-- Title -->
    <title>Mag - Video &amp; Magazine HTML Template</title>


</head>

<body>
<form method="post" action="save-trending" enctype="multipart/form-data">
   
    <div class="form-group">
      <label >title:</label>
      <input type="text" class="form-control" name="trendname" >		
    </div>
    <div class="form-group">
      <label >image:</label>
      <input type="text" class="form-control" name="hinhanh">	
    </div>
    <div class="form-group">
      <label >quote:</label>
      <input type="text" class="form-control" name="tomtat">	
    </div>
    <div class="form-group">
		<button type="submit" class="btn btn-primary" value="save"></button>
	</div>
    
  </form>
</body>

</html>