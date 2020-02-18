package PT4;

import java.io.*;
import java.util.*;;

public class Ex2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner n1 = new Scanner(System.in);
		String nombre;

		System.out.println("Escribe el nombre del fichero.");
		nombre = n1.nextLine();

		File archivo = new File(nombre);

		boolean falso = false;
		while (!falso) {
			if (archivo.exists()) {
				System.out.println("El fichero ya existe, escribe otro nombre.");
				nombre = n1.nextLine();
				archivo = new File(nombre);
			} else {
				PrintStream escribir = new PrintStream(archivo);
				System.out.println("Escribe: ");
				String texto = "";
				while (true) {
					texto = n1.nextLine();
					if (texto.contentEquals(".")) {
						System.exit(0);
					} else {
						escribir.println(texto);
					}
				}

			}
		}
	}

}
