package PT4;
import java.io.*;
import java.util.*;

public class Ex5 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner n1 = new Scanner(System.in);
		
		Ex5 obj = new Ex5();
		
		String rutaOrigen = null;
		String rutaFinal = null;
		
		//Has de introducir la ruta del archivo que quieras copiar
		System.out.println("Introduce la ruta de ORIGEN, ten en cuenta si es windows o ubuntu");
			rutaOrigen = n1.nextLine();
		
		File origen = new File(rutaOrigen);
		
		//Comprobar que ruta origen sea una direccion valida
		if(origen.isFile()) {
			
			//Has de introducir la ruta donde quieres que se mande la copia y acabado en como quieres que se llame
			System.out.println("Introduce la ruta FINAL, ten en cuenta si es windows o ubuntu");
				rutaFinal = n1.nextLine();
				
			File fin = new File(rutaFinal);
			
			//Comprobar  que ruta final no exista, porque sino se sobrepondria
			if(fin.isFile()) {
				
				System.out.println("La direccion especificada no existe");
				
			}else {
				
				obj.copia(origen, fin);
				
			}
			
		}else {
			
			System.out.println("Ruta de origen no existe");
			
		}
		
	}

	public void copia(File origen, File fin) throws IOException {
		
		//Utilizamos el RandomAcces porque como son archivos bytes, usaremos el primero para leerlo y
		//el otro para copiarlo en la ruta de destino
		RandomAccessFile leer = new RandomAccessFile(origen, "r");
		RandomAccessFile copiar = new RandomAccessFile(fin, "rw");
		
		//Creamos esta variable para posteriormente tener un tope en el for		
		long midaOrigen = leer.length();
		
		//For para leer el contenido del origen y copiarlo en el destino
		for(int i = 0; i < midaOrigen; i ++) {
			
			copiar.writeByte(leer.readByte());
			
		}
		
		//Ponerle el tamaño que tendra el archivo final, para que sean iguales
		copiar.setLength(midaOrigen);
		
		System.out.println("Se ha copiado el archivo especificado correctamente");
		
	}

}
