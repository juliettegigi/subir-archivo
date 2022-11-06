<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.File"%>  
<%@ page import="java.io.FileOutputStream"%>
<%@ page import="java.io.InputStream" %>
<%@ page import="java.nio.file.Files" %>
<%@ page MultipartConfig%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
 File imagenCarpeta=new File("C:\\Users\\julie\\eclipse-workspace\\subir-archivo\\src\\main\\webapp\\imagenesSubidas\\"); //dónde vammos a guardar al archivo, en cual carpeta
 System.out.println(imagenCarpeta.getAbsolutePath());//retorna el nombre de la ruta dónde se encuentra el archivo
 // todos los archivos jsp son servlet y tenemos por default un parámetro de tipo http 
//de tipo servlet, ie, tenemos un request y response
//el request tiene métodos para retornar lo q venga desde el formulario
System.out.println(request.getParameter("file"));// esto nos muestra el nombre del archivo , esto se puede ver en la url
//en la base de datos guardamos el nombre...le deberíamos poner unn id al nombre q nos suben
//guardammos en la DB sólo el nombre del archivo
try{  
	Part part = request.getPart("file");
	String nombreImagen=part.getSubmittedFileName();
	InputStream input=part.getInputStream();
	if(input!=null){
		File file=new File(imagenCarpeta, nombreImagen); //
		Files.copy(input,file.toPath());
		}
	}catch(Exception e){
		e.printStackTrace();
		}


%>

</body>
</html>