package PT1;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		
		Scanner n1 = new Scanner(System.in);
		String nombreFichero;
		String Ruta;
		System.out.println("Cual es el nombre del fichero que quiere buscar?");
		nombreFichero = n1.nextLine();
		System.out.println("Escribe el nombre de una ruta a una a carpeta.");
		Ruta = n1.nextLine();

		   File dir = new File(Ruta);
		   
		      FilenameFilter filter = new FilenameFilter() {
		         public boolean accept (File dir, String name) { 
		            return name.equalsIgnoreCase(nombreFichero);
		         } 
		      }; 
		      String[] children = dir.list(filter);
		      if (children == null) {
		         System.out.println("Either dir does not exist or is not a directory"); 
		      } else { 
		         for (int i = 0; i< children.length; i++) {
		            String filename = children[i];
		            System.out.println(filename);
		         } 
		      } 

	}
}
