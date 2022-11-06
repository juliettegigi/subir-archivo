package manejoFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lector {

	public static void main(String[] args) {
		File lector=new File("src/main/webapp/archivos/archivo1.txt");
		FileReader r=null;
		try {
			 r=new FileReader(lector);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String texto="";
        int unCaracter;
        try {
			while((unCaracter=r.read())!=-1)// read retorna caracter en ascci
				texto=texto+(char)unCaracter;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			r.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(texto);

}
}