package PT4;
import java.io.*;
import java.util.*;

public class Ex4 {

	public static void main(String[] args) throws IOException {

		String frase = null;

		Ex4 obj = new Ex4();

		File todos = new File("prueba.txt");

		Scanner n1 = new Scanner(System.in);

		System.out.println("Introduce una frase");
		frase = n1.nextLine();

		obj.archivoByts(frase, todos);
		obj.leerBytes(todos);

	}

	public void archivoByts(String frase, File todos) throws IOException {

		String[] separadas = frase.split(" ");

		RandomAccessFile copiar = new RandomAccessFile(todos, "rw");

		for (int i = 0; i < separadas.length; i++) {

			byte[] bytes = separadas[i].getBytes();
			System.out.println(bytes[i]);
			copiar.writeInt(separadas[i].length());
			copiar.writeBytes(separadas[i]);

		}

		copiar.close();
		System.out.println("Frase convertida a bytes correctamente");
		System.out.println();

	}

	public void leerBytes(File todos) throws IOException {

		// RandomAcces se pone ruta y despues rw si se va a escribir o r si se va a leer
		RandomAccessFile copiar = new RandomAccessFile(todos, "r");

		System.out.println("Palabras con mas de 3 byts: ");

		while (copiar.getFilePointer() < copiar.length()) {
			
			//Guardar cada palabra en esta variable para comprobar si es mas de 3 bytes o no
			int numBytes = copiar.readInt();
			
			// Comprobar si la palabra ocupa mas de 3 bytes
			if (numBytes > 3) {
				
				//Leer cada palabra
				byte[] bytes = new byte[numBytes];
				
				for (int i = 0; i < numBytes; i++) {
					
					bytes[i] = copiar.readByte();
					
				}
				
				//Mostrar por pantalla las frases con mas de 3 bytes
				String paraula = new String(bytes);
				System.out.println(paraula);
				
			} else {
				
				//Si la palabra ocupa menos salta a la siguiente
				copiar.skipBytes(numBytes);
				
			}
		}

	}

}
