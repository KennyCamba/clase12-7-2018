/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenclass;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;



public class ExamenClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String  s = "20.5\n40.2\n35.2\n45.1";
        System.out.println(s.replaceAll("\\.", ",")); 
    }
    
    public ArrayList<Estudiante> cargarUniverso() {
        ArrayList<Estudiante> lista = new ArrayList<>(); 
        try(ObjectInputStream is = new ObjectInputStream(new FileInputStream("torneo_de_la_fuerza.dat" ))){
            try{
                while(true){
                    lista.add((Estudiante)is.readObject());
                }
            }catch(EOFException eof){
                System.out.println("Fin del archivo");
            }catch(ClassNotFoundException ex) {
            
            }
        }catch(FileNotFoundException cex){
        
        }catch(IOException ex) {
        
        }
        
        return lista;
    }
        
}
