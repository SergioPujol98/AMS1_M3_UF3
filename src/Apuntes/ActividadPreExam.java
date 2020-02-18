package Apuntes;

import java.io.*;
import java.util.*;

public class ActividadPreExam {

	public static Scanner n1 = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		ActividadPreExam obj = new ActividadPreExam();
		String nomRuta = "D:\\AMS\\AMS1\\Programacion\\UF3\\Apuntes\\agendaTelefonos.txt";
		File ruta = new File(nomRuta);
		boolean compro = false;
		int eleccion = 0;

		while (!compro) {

			Scanner lector = new Scanner(ruta);
			int contador = 0;
			

			System.out.println("Agenda Telefonica");
			System.out.println("------------------");
			System.out.println("1.- Mostrar contactos");
			System.out.println("2.- Añadir contacto");
			System.out.println("3.- Buscar contacto");
			System.out.println("4.- Eliminar contacto");
			System.out.println("5.- Actualizar fichero");
			System.out.println("6.- Editar contacto");
			System.out.println("7.- SALIR");

			eleccion = n1.nextInt();

			if (eleccion == 1) {

				obj.mostrarContactos(ruta);

			}
			if (eleccion == 2) {

				obj.agregarUsuario(ruta);

			}
			if (eleccion == 3) {

				obj.busquedaUsuario(ruta);

			}
			if (eleccion == 4) {

				obj.eliminarContacto(ruta);

			}
			if (eleccion == 5) {

				obj.actualizar(ruta);

			}
			if (eleccion == 6) {

				obj.editarUsuario(ruta);

			}
			if (eleccion == 7) {

				compro = true;

			}
			if (eleccion > 7 || eleccion < 1) {

				System.out.println("ERROR. Valor no valido");

			}
		}
	}

	public void mostrarContactos(File ruta) throws IOException {

		String cadena;
		FileReader f = new FileReader(ruta);
		BufferedReader leer = new BufferedReader(f);

		while ((cadena = leer.readLine()) != null) {

			System.out.println(cadena);

		}

		leer.close();

	}

	public void agregarUsuario(File ruta) throws IOException {

		// FileWriter fw = new FileWriter(ruta);
		// BufferedWriter bw = new BufferedWriter(fw);
		// RandomAccessFile ra = new RandomAccessFile(ruta, "rw");
		// PrintWriter out = new PrintWriter(bw);
		PrintStream agregar = new PrintStream(ruta);
		String nombre;
		int numero;
		Scanner lector = new Scanner(ruta);
		Scanner lector1 = new Scanner(ruta);

		int linea = 0;
		Scanner n2 = new Scanner(System.in);

		// n1.nextLine();

		System.out.println("Introduce el nombre: ");
		nombre = n2.nextLine();
		System.out.println("Introduce el numero de telefono");
		numero = n2.nextInt();


		agregar.println(nombre + " - " + numero);
				

		
	}

	public void busquedaUsuario(File ruta) {

	}

	public void eliminarContacto(File ruta) {

	}

	public void actualizar(File ruta) {

	}

	public void editarUsuario(File ruta) {

	}
}
