package PT1;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {

		Scanner n1 = new Scanner(System.in);
		Ex6 obj = new Ex6();

		String adress = null;

		File ruta = new File("D:\\jorge\\Escritorio\\Programacion\\Pruebasuf3\\act4");
		File[] archivosFile = ruta.listFiles();
		adress = "D:\\jorge\\Escritorio\\Programacion\\Pruebasuf3\\act4\\no.txt";

		obj.del_fitxer(ruta, adress);
		obj.prop_fitxer(ruta, adress);

		}
	public void del_fitxer(File actual, String fitxer) {

		String nomFitxer = actual.getAbsolutePath() + File.separator + fitxer;
		File rutaFitxer = new File(nomFitxer);

		if (rutaFitxer.isFile()) {

		rutaFitxer.delete();

		System.out.println("Se ha borrado");

		} else {

		System.out.println("ERROR: No existe");

		}
		}

		public void prop_fitxer(File actual, String fitxer) {

		String nomFitxer = actual.getAbsolutePath() + File.separator + fitxer;
		File fitxeroRuta = new File(nomFitxer);

		if (fitxeroRuta.isFile()) {

		System.out.println("Mida: " + fitxeroRuta.length());

		long modifi = fitxeroRuta.lastModified();

		//Metemos el modo data porque asi sacamos la fecha del sistema

		Date data = new Date(modifi);

		System.out.println("Modificacion: " + data);

		} else {

		System.out.println("ERROR: No existe");

		}
		}
}
