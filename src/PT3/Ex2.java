package PT3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) throws FileNotFoundException {
		File numeros = new File("1a100.txt");
		Scanner par = new Scanner(new File ("pares.txt"));
		Scanner impar = new Scanner(new File ("impares.txt"));
		PrintStream escribirFichero = new PrintStream(numeros);
		
			while (par.hasNextInt()) {
				escribirFichero.println(par.nextInt());
				if(impar.hasNextInt()) {
				escribirFichero.println(impar.nextInt());
				}
			}
			System.out.println("Programa finalizado");
		
		par.close();
		impar.close();
		escribirFichero.close();
		
	}

}
