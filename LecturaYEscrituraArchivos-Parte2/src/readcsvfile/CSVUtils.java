/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readcsvfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rociomera
 * @param <T>
 */
public class CSVUtils<T extends GuaradarLeerCSVInterface> {
    
    public static boolean writeToCSV(ArrayList<GuaradarLeerCSVInterface> coleccionObjetos, String pathFile){
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(pathFile)));
            for(GuaradarLeerCSVInterface p : coleccionObjetos)
                pw.println(p.writeToCSV());
            pw.close();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CSVUtils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CSVUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static boolean writeToCSV(GuaradarLeerCSVInterface objeto, String pathFile){
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(pathFile, true)));
            pw.println(objeto.writeToCSV());
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CSVUtils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CSVUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static ArrayList<GuaradarLeerCSVInterface> readCSVToArray(GuaradarLeerCSVInterface aux){
        try {
            InputStream is = new FileInputStream(new File(aux.getNombreArchivo()));
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            
            String line;
            GuaradarLeerCSVInterface p;
            ArrayList<GuaradarLeerCSVInterface> col = new ArrayList<>();
            while( (line = br.readLine()) != null){
                p = aux.mapToCSV(line);
                col.add(p);
            }
            return col;
        } catch (FileNotFoundException ex){
            System.out.println("el archivo "+aux.getNombreArchivo()+" no existe");
        } catch (IOException ex) {
            System.out.println("error al leer el archivo");
        }
        return null;
    }
    
}
