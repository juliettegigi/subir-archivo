<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- enctype va siempre con los input type file -->
<form action="SubirImgServlet" method="post" enctype="multipart/form-data">
  <input type="file" name="file">
  <input type="submit">
</form>
</body>
</html>