/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LecturaEscrituraArchivosBinarios.Objetos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rociomera
 */
public class EscribirObjetos {
    public static void main(String args[]){
        String filename = "src/Fuentes/estudiantes.dat";
        
        
        //crea un objeto de tipo estudiante
        Estudiante e = new Estudiante("2017003","jose","telcomunicaciones",7.50);
        System.out.println(e);
        
        //try with resource
        //creamos un objeto de tipo objOutputStream, en el constructor recibe un 
        //objeto de tipo FileOutputStream
        try (ObjectOutputStream objOutputStream = new ObjectOutputStream(
                    new FileOutputStream(filename))){
            
            // write escribe el objeto en el archivo
            objOutputStream.writeObject(e);
            System.out.println("... written to estudiantes.dat.");
            
        } catch (FileNotFoundException e1) {
            System.err.println(e1.getMessage());
        } catch (IOException e2) {
            System.err.println(e2.getMessage());
        }
    }
    
    public static ArrayList<Estudiante> crearEstudiantes(){
        ArrayList<Estudiante> es = new ArrayList<>();
        es.add(new Estudiante("2017003","jose","telcomunicaciones",7.50));
        es.add(new Estudiante("2017001","carlos","computacion",9.09));
        es.add(new Estudiante("2017002","alvaro","electrica",8.80));
        return es;
    }
}
