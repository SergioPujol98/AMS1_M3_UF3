package PT1;

import java.util.*;
import java.io.*;

public class Ex4 {

	public static void main(String[] args) {

		Scanner n1 = new Scanner(System.in);
		Ex4 obj = new Ex4();

		String adress = null;

		System.out.println("Introduce la direccion de los ficheros");

		adress = n1.nextLine();

		obj.leerDireccion(adress);

	}

	public void leerDireccion(String adress) {

		int kylo = 512000;

		File ruta = new File(adress);
		File[] archivosFile = ruta.listFiles();

		if (ruta.exists()) {

			System.out.println("Archivos suberiores a 500 KB");

			for (int i = 0; i < archivosFile.length; i++) {

				if (archivosFile[i].isFile()) {

					if (archivosFile[i].length() > kylo) {

						System.out.println(archivosFile[i].getName());

					}
				}
			}

		} else {

			System.out.println("La direccion especificada no existe");

		}

	}

}
