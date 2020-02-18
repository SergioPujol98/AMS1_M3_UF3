package PT2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Ex1 programa = new Ex1();
		File ex1_notas = new File("Notas.txt");
		programa.insertar(ex1_notas);
		programa.leer(ex1_notas);
		
	}
	
	public void insertar(File f) {
		String primerAlumn = "Maria Almerich 3 4 3,5 6";
		String segundAlumn = "Joan Sebastià 5 4,5 8,5 5 6,5 7";
		String tercerAlumn = "Carme Gonzàlez 4 6,5 8,75 10 9,5";
		try {
			PrintStream escripturaFichero = new PrintStream(f); //Aqui abriimos el printstream para poder escribir en el archivo creado recientemente.
			
			//Vamos introduciendo los Strings con los valroes deseados en el archivo.
			escripturaFichero.println(primerAlumn); //Los introducimos con println para que haga un salto de linea y asi esten los valores separados.
			escripturaFichero.println(segundAlumn);
			escripturaFichero.println(tercerAlumn);
			escripturaFichero.println("fi");
			escripturaFichero.close(); //Cerramos el PrintStream.
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: " + e);
		}
	}
	public void leer (File f) {
		try {
			Scanner leerFichero = new Scanner (f); //Abrimos  Scanner para poder leer el fichero deseado.
			Scanner leerFicheroContador = new  Scanner(f);
			int contador = 0;
			while (leerFicheroContador.hasNextLine()) {
				leerFicheroContador.nextLine();
				contador++;
			}
			//Creamos los arrays que contendran los datos del fichero
			String nombres[] = new String[contador];
			String apellidos[] = new String[contador - 1];
			int cantidadNum[] = new int[contador - 1];
			float medias[] = new float [contador - 1];
			
			for (int j = 0; j < nombres.length; j ++) { //Rellenamos los arrays con los datos del fichero.
				nombres[j] = leerFichero.next();
				if (!leerFichero.hasNext()) {
					break;
				}
				apellidos[j] = leerFichero.next();
				
				cantidadNum[j] = leerFichero.nextInt();
				for(int i = 0; i < cantidadNum[j]; i ++) {
					medias[j] = medias[j] + leerFichero.nextFloat();
				}
			}
			
			contador = 0;
			while (!nombres[contador].equalsIgnoreCase("fi") ) { //Una vez que en el array de nombres pone fi, comenzamos a mostrar por pantalla la informacion que habia en el fichero leido.
				System.out.println(nombres[contador] + " " + apellidos[contador] + ": " + medias[contador]);
				contador++;
			}
			System.out.println("Ha acabado");
			leerFicheroContador.close();
			leerFichero.close(); //Cerramos el lector de fichero.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
