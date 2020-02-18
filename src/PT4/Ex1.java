package PT4;

import java.io.*;
import java.util.*;;

public class Ex1 {

	public static void main(String[] args) throws FileNotFoundException {
		File frases = new File("Frases.txt");
		Scanner lector = new Scanner(frases);
		Scanner contadorLineas = new Scanner(frases);

		int contador = 0;
		while (contadorLineas.hasNextLine()) {
			contador++;
			contadorLineas.nextLine();
		}

		for (int j = 1; j < contador; j++) {
			String frase = lector.nextLine();
			String[] fraseSplit = frase.split(" ");
			if (fraseSplit.length == 1) {
				System.exit(0);
			}
			System.out.println("La linea " + j + " tiene " + fraseSplit.length + " palabras.");
		}

	}

}
