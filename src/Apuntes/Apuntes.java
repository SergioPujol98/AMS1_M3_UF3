package Apuntes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Apuntes {
	public static void main(String[] args) {
	Apuntes obj = new Apuntes();
	obj.inici();

	}

	public void inici() {

	//Las rutas se pueden poner de la primera manera que sale o la segunda
	String nomRuta = "D:\\jorge\\Escritorio\\Programacion\\Pruebasuf3\\aaa.txt";
	String nomRuta2 = "D:\\jorge\\Escritorio\\Programacion\\Pruebasuf3\\Prueba";
	String nomRuta3 = "D:\\jorge\\Escritorio\\Programacion\\Pruebasuf3\\Hola";
	String nomRutaOpcional = File.separator+"D"+File.separator+"jorge"+File.separator+"Escritorio"+File.separator+"Programacion"+File.separator+"Pruebasuf3";

	File fitxer1 = new File(nomRuta);
	File fitxer = new File(nomRuta2);
	File fitxer2 = new File(nomRuta3);

	//Este metodo se usa para un objeto de tipo file y devuelve un booleano
	System.out.println(fitxer.exists());

	//Crear la carpeta especificada en la direccion nomRuta y
	//devuelve true si se ha creado o false si no
	System.out.println(fitxer.mkdir());

	//Borrar la carpeta especificada en la direccion nomRuta y
	//devuelve true si se ha creado o false si no
	System.out.println(fitxer.delete());

	//Prueba

	if(fitxer.exists() == false) {

	if(fitxer.mkdir() == true) {
	System.out.println("Carpeta creada");
	}else {

	System.out.println("No se ha podido crear la carpeta");
	}
	}else {

	fitxer.delete();
	System.out.println("Carpeta Borrada");

	}

	System.out.println(fitxer1.length());

	//Para mostrar la ultima modificacion en modo del sistema operativo
	System.out.println(fitxer1.lastModified());
	//Para mostrar la fecha "normal"
	Date fecha = new Date(fitxer1.lastModified());
	System.out.println(fecha);
	System.out.println(fecha.getDate()); //Podemos sacar solo la hora, dia, mes...etc

	//Mostrar nombre
	System.out.println(fitxer1.getName());
	//Ruta del padre
	System.out.println(fitxer1.getParent());
	//Ruta especificada
	System.out.println(fitxer1.getAbsolutePath());
	//Saber si es un archivo o un directorio devolviendo un booleano
	System.out.println(fitxer1.isFile());

	//Con el siguiente comando puedes cambiar el fichero o directorio que esta puesto primero
	//por el segundo, ya sea su ubicacion o tan solo para cambiar el nombre
	//1r -> ORIGEN     2 -> DESTINO
	fitxer.renameTo(fitxer2);

	//Leer lo que hay en un archivo
	Scanner n1 = null;

	if(fitxer1.exists()) {

	//Try y catch
	//Intenta hacer todo lo que esta en el try, si no se puede, saca lo que hay en el catch
	try {
	n1 = new Scanner(fitxer1);
	} catch (FileNotFoundException e) {

	e.printStackTrace();
	}

	}
	}

	

}
