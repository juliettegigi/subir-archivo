package manejoFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copiador {

	public static void main(String[] args) throws IOException {
	
		// copiar el archivo1 en unnn arcchivo 2
		File archivo1=new File("src/main/webapp/archivos/archivo1.txt");
		File archivo2=new File("src/main/webapp/archivos/archivo2.txt");
		
		FileReader lector=new FileReader(archivo1);
		int caracterDelArchivo;
		String contenidoDelArchivo="";
		while((caracterDelArchivo=lector.read())!=-1)
			contenidoDelArchivo=contenidoDelArchivo+(char)caracterDelArchivo;
		lector.close();
		FileWriter escritor=new FileWriter(archivo2); 
		for(int i=0;i<contenidoDelArchivo.length();i++)
			escritor.write(contenidoDelArchivo.charAt(i));
		escritor.close();
		System.out.println("Fin");
	}

}
