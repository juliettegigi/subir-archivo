package servlets;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import UtilidadesConstantes.Img;



@MultipartConfig
@WebServlet
public class SubirImgServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public SubirImgServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
			Img.getId();
			Img.guardarId();
			InputStream input=part.getInputStream();
			if(input!=null){
				
				File file=new File(imagenCarpeta, nombreImagen); //
				Files.copy(input,file.toPath());
				}
			}catch(Exception e){
				e.printStackTrace();
				}

}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
