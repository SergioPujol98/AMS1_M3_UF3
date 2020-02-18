/*
// Se abre el fichero para lectura y escritura.
RandomAccessFile fichero = new RandomAccessFile ("nombre_fichero", "rw");
/*
// Nos situamos en el byte 100 del fichero.
fichero.seek(100); 

// Escribimos un "Hola" a partir de la posición 100 del fichero,
// machacando lo que hubiera allí.
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




 //La variable 'pos' indicará la posición del puntero del fichero,
        //  señalando el lugar donde se leerá o escribirá
        int pos = 11;
        String nombreFichero = "prueba.txt";
        RandomAccessFile raf = null;
        try
        {
            //Se abre el fichero para permitir lectura y escritura
            raf = new RandomAccessFile(nombreFichero,"rw");
            //Obtener el tamaño del fichero
            long tamaño = raf.length();
            //Posicionar el puntero del fichero en la posición indicada
            raf.seek(pos);
            //Comprobar si se intenta posicionar el puntero mas allá
            //  del tamaño del fichero
            if(raf.getFilePointer()<tamaño)
            {
                //Leer un carácter y avanzar puntero al siguiente carácter
                //Los caracteres leídos se toman de tipo entero
                int caract = raf.read();
                //Retroceder una posición para volver a la posición anterior
                raf.seek(raf.getFilePointer()-1);
                //Escribir el carácter leído convertido a mayúsculas
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