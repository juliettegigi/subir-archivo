package manejoFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LectorPorLinea {

	public static void main(String[] args) throws IOException {
		File archivo=new File("src/main/webapp/archivos/archivoBuffer.txt");
		FileReader fr=new FileReader(archivo); 
		BufferedReader br=new BufferedReader(fr);
	    boolean eof=false;
	    String texto="";
		while(!eof) {
			String aux=br.readLine();
			if(aux!=null) 
		    	texto=texto+aux;
		   
		    else 
		    	eof=true;
		    texto=texto+"\n";
		}
		br.close();
		System.out.println(texto);

	}

}
