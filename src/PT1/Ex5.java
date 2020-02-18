package PT1;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner n1 = new Scanner(System.in);
		

		File inicio = new File("C:\\Program Files (x86)\\GtkSharp");
		
		try {

			boolean falso = false;
			while (!falso) {
				String introducido;
				System.out.print(inicio + ": ");
				introducido = n1.nextLine();
				if (introducido.equalsIgnoreCase("cd ..") ) { //Retroceder
					if (inicio.getParentFile() != null) { // Lo hacemos cogiendo el padre y cambiando el File
						inicio = inicio.getParentFile();
					} else {
						introducido = "";
					}
				}
				String[] datosIntroducidosSplit = introducido.split(" ");
				if (introducido.startsWith("cd") && !datosIntroducidosSplit[1].equalsIgnoreCase("..")) { //Comprueba si aquello escrito lleva cd
					File[] directorios = inicio.listFiles();
					for (int j = 0; j < directorios.length; j++) {
						if (datosIntroducidosSplit[1].equalsIgnoreCase(directorios[j].getName())) { //En caso de que lo lleve, comprueba si el nombre_fichero escrito existe, en caso de que exista entra en el if.
							String nuevaRuta = inicio.getAbsoluteFile().toString() + "\\" + datosIntroducidosSplit[1]; //Cambiamos la ruta del fichero.
							inicio = new File(nuevaRuta); //Cambiamos  el File con el nuevo archivo para acceder a el.
							break;
						}
						if (j == directorios.length - 1) {
							System.out.println("El archivo no existe");
						}
					}
				}
				if (introducido.equalsIgnoreCase("dir")) { //Mostramos todos los ficheros dentro de ese directorio recorriendo el stringFicheros en el cual hemos hecho un list.
					String[] stringFicheros = inicio.list();
					System.out.println(stringFicheros.length);
					for (int j = 0; j < stringFicheros.length; j++) {
						System.out.println(stringFicheros[j]);
					}
				}
				
				if(introducido.startsWith("del")) { //Si el comando introducido empieza por del, entra en el bucle.
					datosIntroducidosSplit = introducido.split(" ");
					File[] directorios = inicio.listFiles();
					for (int j = 0; j < directorios.length; j++) {
						if (datosIntroducidosSplit[1].equalsIgnoreCase(directorios[j].getName())) { //En caso de que lo lleve, comprueba si el nombre_fichero escrito existe, en caso de que exista entra en el if.
							System.out.println("Se ha borrado el archivo: " + directorios[j]);
							directorios[j].delete(); //Borramos el archivo que coincida con el nombre introducido.
							break;
						}
						if (j == directorios.length - 1) {
							System.out.println("El archivo no existe");
						}
					}
				}
				
				if(introducido.startsWith("prop")) {
					datosIntroducidosSplit = introducido.split(" ");
					File[] directorios = inicio.listFiles();
					for (int j = 0; j < directorios.length; j++) {
						if (datosIntroducidosSplit[1].equalsIgnoreCase(directorios[j].getName())) { //En caso de que lo lleve, comprueba si el nombre_fichero escrito existe, en caso de que exista entra en el if.
							System.out.println("Medida del fichero: " + directorios[j].length());
							long lastModif = directorios[j].lastModified();
							Date data = new Date(lastModif); //Para que muestre la fecha de la ultima modificacion con la fecha del sistema.
							System.out.println("Fecha de la ultima modificacion del fichero: " + data);
							break;
						}
						if (j == directorios.length - 1) {
							System.out.println("El archivo no existe");
						}
					}
				}
				
				
				
				if (introducido.equalsIgnoreCase("fi")) { //En caso de que pongan fi, el programa se cierra directamente
					System.exit(0);
				}
			}
		} catch (Exception e) {
			System.out.println("ERROR: "+e);
		}
		n1.close();
	}

}
