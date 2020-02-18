package PT3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) throws FileNotFoundException {
		File personas = new File("persones.txt");
		Scanner leerDatos = new Scanner(personas);

		while (leerDatos.hasNextLine()) {
			String prueba = leerDatos.nextLine();
			String[] datosOrdenados = prueba.split(" - ");
			int edad = Integer.parseInt(datosOrdenados[4]);

			if (edad > 18) {
				System.out.println("Son mayores de edad las siguientes personas: \n");
				for (int j = 0; j < datosOrdenados.length; j++) {
					if (j <= datosOrdenados.length - 2) {
					System.out.print(datosOrdenados[j] + " - ");
					} else {
						System.out.print(datosOrdenados[j]);
					}
				}
			}
		}
		leerDatos.close();

	}

}
