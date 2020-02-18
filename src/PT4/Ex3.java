package PT4;

import java.io.*;
import java.util.*;;

public class Ex3 {

	public static void main(String[] args) throws FileNotFoundException {

		File histograma = new File("Histograma-NotesReals.txt");
		Scanner n1 = new Scanner(System.in);
		PrintStream escritor = new PrintStream(histograma);
		float numero = 0;

		int excelentes = 0;
		int notables = 0;
		int aprobados = 0;
		int suspendidos = 0;

		System.out.println("Nombre del archivo que contiene las notas");
		String nombreArchivo = n1.nextLine();
		File notas = new File(nombreArchivo);
		while (!notas.exists()) { // Comprobamos si el fichero introducido por el usuario existe.
			System.out.println("El archivo no existe. Introduce otro archivo");
			notas = new File(n1.nextLine());
		}
		Scanner lector = new Scanner(notas);

		while (lector.hasNextFloat()) { // Aqui cogemos la cantidad de numeros que tiene cada categoria.
			numero = lector.nextFloat();
			if (numero >= 9 && numero <= 10) { // Excelente
				excelentes++;
			}
			if (numero < 9 && numero >= 6.5) { // Notable
				notables++;
			}
			if (numero < 6.5 && numero >= 5) { // Aprobado
				aprobados++;
			}
			if (numero < 5) { // Suspendido
				if (numero < 0) {
					System.out.println("\nHa acabado de leer los numeros");
					break;
				}
				suspendidos++;
			}

		}

		// Aqui escribimos en el histograma los datos de la forma que nos pide el
		// ejercicio usando los contadores de numeros por categoria.
		escritor.println("Histograma del fitxer " + notas);
		escritor.println("------------ \r\n");
		escritor.print("Suspendidos: ");
		for (int j = 0; j < suspendidos; j++) {
			escritor.print("*");
		}
		escritor.println(); // Salto de linea para que no aparezcan todas las categorias de notas juntas.
		escritor.print("Aprobados: ");
		for (int j = 0; j < aprobados; j++) {
			escritor.print("*");
		}
		escritor.println();
		escritor.print("notables: ");
		for (int j = 0; j < notables; j++) {
			escritor.print("*");
		}
		escritor.println();
		escritor.print("excelentes: ");
		for (int j = 0; j < excelentes; j++) {
			escritor.print("*");
		}
		System.out.println("\nEl programa ha finalizado correctamente.");
	}

}
