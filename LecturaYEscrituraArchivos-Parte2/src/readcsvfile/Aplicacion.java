/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readcsvfile;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author rociomera
 */
public class Aplicacion {
    
    public HashMap<String, Person> persons = new HashMap<>();
    public ArrayList<Person> personsArray = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aplicacion s = new Aplicacion();
        s.inicializarDataAplicacion();
        //recorrer la lista usando array
        for(Person x : s.personsArray){
            System.out.println(x);
        }
        
        s.personsArray.add(new Person("alvaro mera","0987654321",new Date()));
        s.personsArray.add(new Person("rocio suarez","0987654233",new Date()));
        
        CSVUtils.writeToCSV((ArrayList<GuaradarLeerCSVInterface>)(ArrayList<?>)s.personsArray,Person.NOMBRE_ARCHIVO);
        
        //imprimir toda la lista
        
        //encontrar una persona por su id
        
    }
    
    public void inicializarDataAplicacion(){
        this.personsArray = (ArrayList<Person>)(ArrayList<?>)CSVUtils.readCSVToArray(new Person());
        //this.persons = CSVUtils.readPersonsFronFileToMap();
    }
    
    
}
