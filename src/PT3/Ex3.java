package PT3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) throws FileNotFoundException {
		File personas = new File("persones.txt");
		Scanner n1 = new Scanner(System.in);
		PrintStream introducirDatos = new PrintStream(personas);

		int eleccion;

		String nombre;
		String apellido1;
		String apellido2;
		String DNI;
		int edad;
		String altura;

		while (true) {
			System.out.println("1.Introducir persona"); //Creamos un menu.
			System.out.println("2.Salir del programa");
			eleccion = n1.nextInt();

			switch (eleccion) { //Dependiendo de la eleccion del usuario hacemos una cosa u otra.
			case 1: //En  este caso recogemos y luego introducimos en el fichero todos los datos que introduzca el usuario.
				System.out.println("\nIntroduce el nombre");
				nombre = n1.next();
				System.out.println("\nIntroduce el primer apellido");
				apellido1 = n1.next();
				System.out.println("\nIntroduce el segundo apellido");
				apellido2 = n1.next();
				System.out.println("\nIntroduce el DNI");
				DNI = n1.next();
				System.out.println("\nIntroduce la edad");
				edad = n1.nextInt();
				System.out.println("\nIntroduce la altura");
				altura = n1.next();
				introducirDatos.println(nombre + " - " + apellido1 + " - " + apellido2 + " - " + DNI + " - " + edad + " - " + altura); //Introducimos los datos del usuario en 1 linea y con salto de linea para que el proximo usuario este en la siguiente  linea.
				break;

			case 2:
				System.exit(0); //Salimos del programa en caso de que seleccion la segunda eleccion en el menu.
				break;

			default:
				throw new IllegalArgumentException("Valor incorrecto: " + eleccion);
			}
		}

	}

}
