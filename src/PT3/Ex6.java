package PT3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Ex6 programa = new Ex6();
		File lineas = new File("lineas.txt");
		
		programa.archivoTXT(lineas);
		programa.buscarJava(lineas);
		
	}
	//Creamos  el  fichero en el que estaran las lineas que queremos ver del fichero java.
	public void archivoTXT(File f) {
		try {
			PrintStream escribir = new PrintStream(f); //Introducimos las lineas que queremos recorrer.
			escribir.println(3);
			escribir.println(7);
			escribir.println(10);
			escribir.println(14);
			
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: " + e);
		}
	}
	
	//Buscamos en el archivo java dependiendo de los numeros que haya en el fichero creado anteriormente
	public void buscarJava(File f) {
		try {
			File archivoJava = new File("C:\\Users\\sergi\\eclipse-workspace\\AMS1_UF3\\src\\PT2\\Ex2.java"); //Ruta de fichero java
			Scanner lector = new Scanner(f);
			Scanner lectorContador = new Scanner(f);
			Scanner lectorJava = new Scanner(archivoJava);
			
			
			int contador = 0;
			while (lectorContador.hasNextInt()) {
				contador++;
				lectorContador.nextLine();
			}
			int linea = 0;
			int numeroSiguiente = 0;
			for (int j = 0; j < contador; j++) { //Bucle  que sea tan largo como lineas con numeros haya en el fichero que contiene las lineas.
				numeroSiguiente = linea;
				linea = lector.nextInt();
				numeroSiguiente = linea - numeroSiguiente; //Aqui buscamos la diferencia que hay entre el numero nuevo y el anterior ya que no podemos usar el seek para volver al principo del fichero, tenemos que ir recorriendolo con nuevos numeros durante la marcha.
				for (int s = 1; s < numeroSiguiente; s ++) { //El contador empieza a contar a partir de 1.
					lectorJava.nextLine();
					if (s == numeroSiguiente - 1) {
						System.out.println(lectorJava.nextLine()); //Mostramos lo que hay en esa linea del fichero java.
					}
				}
			}
			
			
		} catch (Exception e) {
			System.out.println("ERROR: " + e);
		}
	}
}
