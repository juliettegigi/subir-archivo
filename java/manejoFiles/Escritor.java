package manejoFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escritor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1) creo al archivo , q se va a llamar archivo1.txt + ruta
		File outputFile=new File("src/main/webapp/archivos/archivo1.txt");
		//2) el objeto que escribe es unn FileWriter y  //escribe letra por letra
		//le pasamos el archivo en el q queremmos escribir
		FileWriter x=null;
		try {
			 x= new FileWriter(outputFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
String texto="Hola mundo";
for(int i=0;i<texto.length();i++)
	try {
		x.write(texto.charAt(i));  // escribe letra por letra
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
try {
	x.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
	

}
