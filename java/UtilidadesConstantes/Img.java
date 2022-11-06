package UtilidadesConstantes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Img {
    private static int idImg;
    private static File id=new File("C:\\Users\\julie\\eclipse-workspace\\subir-archivo\\java\\UtilidadesConstantes");
	static {
		try {
			cargarId();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
     
	public static int getId() {
		return idImg;
	}
	public static void guardarId() throws IOException{
	
	FileWriter fw=new FileWriter(id);
	BufferedWriter br=new BufferedWriter(fw);
	idImg++;
	br.write(idImg);	
	br.close();
	}
	
	public static void cargarId() throws NumberFormatException, IOException {
		
		FileReader fr=new FileReader(id);
		BufferedReader br=new BufferedReader(fr);
		idImg=br.read();
         br.close();
		
	}
	
}
