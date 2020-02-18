package PT1;

import java.io.File;
import java.nio.file.Files;
import java.util.*;

//CAMBIAR EXTENSION .jpg o .txt POR UNA O LA OTRA

public class Ex2 {

	public static void main(String[] args) {

		Scanner n1 = new Scanner(System.in);

		String uno = null;
		String dos = null;
		boolean compro = false;

// Guardo primero las dos extensiones que queramos cambiar usando el Scanner y
// guardandolas
// con .next y cerrando el Scanner despues

// Si las dos cadenas no se componen por dos caracteres las vuelve a pedir
		while (!compro) {

			System.out.println("Introduce dos cadenas de texto en la misma linea: ");

			uno = n1.next();
			dos = n1.next();

			if (uno.length() == 3 && dos.length() == 3) {

				compro = true;

			}
		}
		Ex2 obj = new Ex2();
		obj.cambioExtension(uno, dos);

	}

	public void cambioExtension(String uno, String dos) {

		String Ruta = "D:\\jorge\\Escritorio\\Programacion\\Pruebasuf3\\jpg";
		File archivo = new File(Ruta);

//Guarda direccion entera
		File[] archivosFile = archivo.listFiles();
//GUarda destino final direccion
		String[] archivosStrings = archivo.list();

//Para hacer el cambio de extension necesito extraer el que ya esta para substituirlo y para
//eso utilizo la funcion .split para coger todo lo que hay detras del punto, pero como solo
//funciona con los guiones antes he hecho el cambio de los puntos a guiones
		for (int j = 0; j < archivosFile.length; j++) {

			String fichero = archivosStrings[j].replace(".", "-");
			String[] archivosSplit = fichero.split("-");
			File nuevo = new File(Ruta + "\\" + archivosSplit[0] + "." + dos);

			archivosFile[j].renameTo(nuevo);

			System.out.println("Se ha cambiado un archivo " + uno + " a formato " + dos);

		}
	}

}
