/*
// Se abre el fichero para lectura y escritura.
RandomAccessFile fichero = new RandomAccessFile ("nombre_fichero", "rw");
/*
// Nos situamos en el byte 100 del fichero.
fichero.seek(100); 

// Escribimos un "Hola" a partir de la posici�n 100 del fichero,
// machacando lo que hubiera all�.
fichero.writeChars("Hola");

fichero.close();




import java.io.*;

public class RandomAccessFileDemo {
   public static void main(String[] args) {
   
      try {
         // create a new RandomAccessFile with filename test
         RandomAccessFile raf = new RandomAccessFile("c:/test.txt", "rw");

         // write something in the file
         raf.writeUTF("Hello World");

         // set the file pointer at 0 position
         raf.seek(0);

         // print the string
         System.out.println("" + raf.readUTF());

         // set the file pointer at 5 position
         raf.seek(5);

         // write something in the file
         raf.writeUTF("This is an example");

         // set the file pointer at 0 position
         raf.seek(0);

         // print the string
         System.out.println("" + raf.readUTF());
         
      } catch (IOException ex) {
         ex.printStackTrace();
      }
   }
}




 //La variable 'pos' indicar� la posici�n del puntero del fichero,
        //  se�alando el lugar donde se leer� o escribir�
        int pos = 11;
        String nombreFichero = "prueba.txt";
        RandomAccessFile raf = null;
        try
        {
            //Se abre el fichero para permitir lectura y escritura
            raf = new RandomAccessFile(nombreFichero,"rw");
            //Obtener el tama�o del fichero
            long tama�o = raf.length();
            //Posicionar el puntero del fichero en la posici�n indicada
            raf.seek(pos);
            //Comprobar si se intenta posicionar el puntero mas all�
            //  del tama�o del fichero
            if(raf.getFilePointer()<tama�o)
            {
                //Leer un car�cter y avanzar puntero al siguiente car�cter
                //Los caracteres le�dos se toman de tipo entero
                int caract = raf.read();
                //Retroceder una posici�n para volver a la posici�n anterior
                raf.seek(raf.getFilePointer()-1);
                //Escribir el car�cter le�do convertido a may�sculas
                raf.write(Character.toUpperCase(caract));
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Error de lectura/escritura en el fichero");
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if(raf != null)
                    raf.close();
            }
            catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
*/