package PT3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Ex1 {
	public static void main(String[] args) {
		File pares = new File("pares.txt");
		File impares = new File("impares.txt");
		try {
			PrintStream escripturaFicheroPar = new PrintStream(pares);
			PrintStream escripturaFicheroImpar = new PrintStream(impares);
			for (int j = 0; j <= 100; j ++) {
				if (j % 2 == 0) {
					escripturaFicheroPar.println(j);
				} else {
					escripturaFicheroImpar.println(j);
				}
			}
			escripturaFicheroImpar.close();
			escripturaFicheroPar.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
