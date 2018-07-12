/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readcsvfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author rociomera
 */
public class Person implements GuaradarLeerCSVInterface{
    private String nombre;
    private String identificador;
    //fecha de naciemiento de la persona
    private Date dob; 
    public static final String NOMBRE_ARCHIVO = "baseDatos/datos_cliente.txt";
    
    public Person(){
    }
    
    /**
     * Constructor que recibe todos los atributos de la clase persona
     * @param nombre
     * @param identificador
     * @param dob 
     */
    public Person(String nombre, String identificador, Date dob){
        this.nombre = nombre;
        this.identificador = identificador;
        this.dob = dob;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj != null){
            if(obj.getClass()==getClass()){
                //ahora hacemos el casting del objeto obj a Person
                //para comparar los atributos de Persona
                Person p = (Person)obj;
                //usar metodo equals de la clase String para compara objetos tipo String
                if(p.nombre.equals(nombre)
                        && p.identificador.equals(identificador)
                        && p.dob.equals(dob)){
                    return true;
                }
            }
            
        }
        return false;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+this.nombre+", DOB: "+this.dob+", Identificador: "+this.identificador;
    }
    
    public Person find(ArrayList<Person> lista, String id){
        Person p = null;
        for (Person pl : lista){
            if(pl.nombre.toLowerCase().equals(id.toLowerCase())){
                 p = pl;
            }
        }
        return p;
    }
    
    public ArrayList<Person> searchByName(ArrayList<Person> lista, String name){
        ArrayList<Person> persons = new ArrayList<Person>();
        for (Person p : lista){
            if(p.nombre.toLowerCase().contains(name.toLowerCase())){
                 persons.add(p);
            }
        }
        return persons;
    }
    
    /*public ArrayList<Person> sortLisPerson(ArrayList<Person> lista,String order){
        for (Person p : lista){
            
        }
    }*/
    
/**************** METODOS AUXILIARES PARA LEER Y ESCRIBIR A LOS ARCHIVOS *******

    /**
     * Esta funciOn lee los datos de un objeto Person desde un archivo csv y 
     * retorna un ArrayList de Person
     * @autho: Rocio Mera
     * @return ArrayList<Person>
     */
    /*public static ArrayList<Person> readPersonsFronFileToArray(){
        try {
            InputStream is = new FileInputStream(new File(NOMBRE_ARCHIVO));
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            
            String line;
            Person p = new Person();
            ArrayList<Person> persons = new ArrayList<>();
            while( (line = br.readLine()) != null){
                p = p.mapToCSV(line);
                persons.add(p);
            }
                        
            return persons;
        } catch (FileNotFoundException ex){
            System.out.println("el archivo "+NOMBRE_ARCHIVO+"no existe");
        } catch (IOException ex) {
            System.out.println("error al leer el archivo");
        }
        return null;
    }*/
    
    /**
     * Esta funciOn lee los datos de un objeto Person desde un archivo csv y 
     * retorna un HashMap de Person
     * @autho: Rocio Mera
     * @return ArrayList<Person>
     */
    /*public static HashMap<String, Person> readPersonsFronFileToMap(){
        try {
            InputStream is = new FileInputStream(new File(Person.NOMBRE_ARCHIVO));
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            
            String line;
            Person p = new Person();
            HashMap<String, Person> persons = new HashMap<>();
            while( (line = br.readLine()) != null){
                p = p.mapToCSV(line);
                persons.put(p.identificador,p);
            }
            return persons; 
        } catch (FileNotFoundException ex){
            System.out.println("el archivo "+Person.NOMBRE_ARCHIVO+"no existe");
        } catch (IOException ex) {
            System.out.println("error al leer el archivo");
        }
        return null;
    }

    public static void writeToCSV(ArrayList<Person> coleccionObjetos){
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(pathFile)));
            for(Person p : coleccionObjetos)
                pw.println(p.writeToCSV());
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CSVUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void writeToCSV(Person objeto){
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO, true)));
            pw.println(objeto.writeToCSV());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CSVUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
    
    public Person mapToCSV(String line){
        String[] p = line.split(", ");
        return new Person(p[0], p[1], new Date());
    }
    
    public String writeToCSV(){
        return this.nombre+", "+
                this.identificador+", "+
                this.dob;
    }

    @Override
    public String getNombreArchivo() {
        return NOMBRE_ARCHIVO;
    }
    
    
}
