/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LecturaEscrituraArchivosBinarios;

import LecturaEscrituraArchivosBinarios.Objetos.Estudiante;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rociomera
 */
public class LeerArchivoBinario {
    public static void main(String args[]){
        String filename = "src/Fuentes/out.dat";
        ObjectInputStream objInputStream = null;
     
        try{
            objInputStream = new ObjectInputStream(
                    new FileInputStream(filename));
            try{
                while(true){
                    //leemos los objetos, continuamos leyendo hasta que encontramos 
                    //el final de linea.
                    String line = (String)objInputStream.readUTF();
                    System.out.println(line);
                }
            }catch(EOFException eof){
                System.out.println("Fin del archivo");
            }
            //si hay algo mas que hecer continuamos aqui normalmente
            
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }finally{
            try {
                if (objInputStream!=null)
                    objInputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(LeerArchivoBinario.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        }
    }
}
