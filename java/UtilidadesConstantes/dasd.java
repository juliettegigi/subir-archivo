package UtilidadesConstantes;

import java.io.IOException;

public class dasd {

	public static void main(String[] args) {
   try {
	Img.cargarId();
	Img.guardarId();
	Img.cargarId();
} catch (NumberFormatException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   System.out.println("fin");
	}

}
