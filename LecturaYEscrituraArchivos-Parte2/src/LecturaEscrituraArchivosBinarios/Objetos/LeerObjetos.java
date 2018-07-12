/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LecturaEscrituraArchivosBinarios.Objetos;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rociomera
 */
public class LeerObjetos {
    public static void main(String args[]){
        String filename = "src/Fuentes/estudiantes.dat";
        
        try(ObjectInputStream objInputStream = new ObjectInputStream(
                    new FileInputStream(filename))) {
            
            //cambiamos el valor de la variable estatica test de la clase Estudiante
            Estudiante.test = "test lectura";
            try{
                while(true){
                    Estudiante est = (Estudiante)objInputStream.readObject();
                    System.out.println(est);
                }
            }catch(EOFException eof){
                System.out.println("Fin del archivo");
            }catch (ClassNotFoundException ex) {
                System.out.println("Corrupted file");
            }
            
        } catch (FileNotFoundException e1) {
            System.err.println(e1.getMessage());
        } catch (IOException e2) {
            System.err.println(e2.getMessage());
        }
    }
}
