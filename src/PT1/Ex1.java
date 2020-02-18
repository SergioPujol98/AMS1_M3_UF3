package PT1;

import java.io.File;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		String rutaTemp = "C:\\Users\\sergi\\eclipse-workspace\\AMS1-Pruebas\\Temp"; // Ruta que usaremos con el directorio temp.
		Scanner n1 = new Scanner(System.in);
		File ficheroTemp = new File(rutaTemp);
		String validacion; // Variable que usare para validar si quiere reemplazar o no el directorio en
							// caso de que exista.

		// Comprobamos si existe el directorio Temp en la ruta especificada.
		boolean falso = false;
		while (!falso) {
			if (ficheroTemp.exists()) {
				System.out.println("La carpeta Temp ya existe, quiere crearlo de nuevo? S/N"); //En caso  de que exista el directorio preguntamos si quiere reemplazarlo o no.
				validacion = n1.nextLine();
				if (validacion.equalsIgnoreCase("s")) {
					ficheroTemp.delete(); // Primero borramos el directorio Temp que ya estaba creado.
					System.out.println("Directorio antiguo borrado: " + ficheroTemp.getAbsolutePath());
					ficheroTemp.mkdir(); // Creamos un nuevo directorio temp
					System.out.println("Nuevo directorio creado: " + ficheroTemp.getAbsolutePath());
					falso = true;
				}
				if (validacion.equalsIgnoreCase("n")) { 
					System.out.println("No se ha remplazado el archivo");
					System.out.println("Quiere borrar el directorio? S/N"); //En caso de que no quiera reemplazar el directorio le doy la opcion de simplemente borrarlo.
					validacion = n1.nextLine();
					if(validacion.equalsIgnoreCase("s")) {
						ficheroTemp.delete();
						System.out.println("Directorio borrado: " + ficheroTemp.getAbsolutePath());
						falso = true;
					}
					if(validacion.equalsIgnoreCase("n")) {
						System.out.println("Directorio mantenido: " + ficheroTemp.getAbsolutePath());
						falso = true;
					}
					falso = true;
				}
				if (!validacion.equalsIgnoreCase("s") & !validacion.equalsIgnoreCase("n")) {
					System.out.println("Valor introducido incorrecto");
				}
			} else {
				ficheroTemp.mkdir();
				
				System.out.println("El directorio ha sido creado: " + ficheroTemp.getAbsolutePath()); //En caso  de que no exista el directorio, lo crea directamente.
				falso = true;
			}
		}
		System.out.println("\nEl programa ha finalizado");
		n1.close();
	}

}
