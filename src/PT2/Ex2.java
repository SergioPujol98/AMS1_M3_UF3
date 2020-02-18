package PT2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) throws FileNotFoundException {
		File ex2_notas = new File("Notas.txt");
		File notaMedia = new File("NotaMitja.txt");
		Scanner leerFichero = new Scanner (ex2_notas);
		Scanner leerFicheroContador = new  Scanner(ex2_notas);
		PrintStream escripturaFichero = new PrintStream(notaMedia); //Iniciamos la variable para escribir en un fichero.
		int contador = 0;
		while (leerFicheroContador.hasNextLine()) { //Recorremos el fichero para saber su medida y asi poder crear los arrays con la medida correcta.
			leerFicheroContador.nextLine();
			contador++;
		}
		
		String nombres[] = new String[contador];
		String apellidos[] = new String[contador - 1]; //Ponemos -1 ya que la ultima linea solo pondra fi, el cual lo cogera el array nombres
		float medias[] = new float [contador - 1];
		
		for (int j = 0; j < nombres.length; j ++) {
			float calculoMedia = 0;
			nombres[j] = leerFichero.next();
			if (!leerFichero.hasNext()) {
				break;
			}
			apellidos[j] = leerFichero.next();
			
			while(leerFichero.hasNextFloat()) { //Mientras haya un numero, continua en el while
				float numero = leerFichero.nextFloat();
				
				if (numero == -1) { //Comrpobamos si ha llegado a -1, si lo ha hecho, salimos del while
					break;
				}
				calculoMedia =  calculoMedia + numero;
				
			}
				medias[j] = calculoMedia;
		}
		contador = 0; //Usamos  el contador para recorrer los arrays sin necesidad de saber la medida de estos.
		while (!nombres[contador].equalsIgnoreCase("fi") ) { //Una vez que en el array de nombres pone fi, comenzamos a escribir la informacion almacenada en los arrays en el fichero.
			escripturaFichero.println(nombres[contador] + " " + apellidos[contador] + ": " + medias[contador]);
			contador++;
		}
		
		leerFichero.close();
		leerFicheroContador.close();
		escripturaFichero.close();
	}
	
	

}
