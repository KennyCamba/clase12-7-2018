/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LecturaEscrituraArchivosBinarios;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rociomera
 */
public class EscribirArchivoBinario {
    public static void main(String args[]){
        ObjectOutputStream objOutputStream = null;
        try {
            objOutputStream = new ObjectOutputStream(
                    new FileOutputStream("src/Fuentes/out.dat"));
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter three lines of text:");
            String line = null;
            int count;
            for (count = 1; count <= 3; count++)
            {
                line = keyboard.nextLine();
                //escrimos los estring en el archivo con el metodo writeUTF
                //para leer deberiamos usar su equivalente
                objOutputStream.writeUTF(line);
            }
            System.out.println("... written to out.dat.");
            
        } catch (FileNotFoundException e1) {
            System.err.println(e1.getMessage());
        } catch (IOException e2) {
            System.err.println(e2.getMessage());
        } finally {
            try {
                objOutputStream.close();
            } catch (IOException e3) {
                System.err.println(e3.getMessage());
            }
        }
    }
}
