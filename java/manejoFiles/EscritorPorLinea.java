package manejoFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscritorPorLinea {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        File archivoBuffer=new File("src/main/webapp/archivos/archivoBuffer.txt");
        FileWriter fw=new FileWriter(archivoBuffer);
        BufferedWriter escritor=new BufferedWriter(fw);
        //ahora escribimos lineas
        String linea1="Hoola linea1";
        String linea2="Hola linea2";
        String linea3="Hoola linea3";
        
        escritor.write(linea1);
        escritor.newLine();
        escritor.write(linea2,0,linea2.length());//así te escribe desde la posición 0 de la linea2, hasta el final
	    escritor.newLine();
        escritor.write(linea3);
        
	    escritor.close();
	}

}
