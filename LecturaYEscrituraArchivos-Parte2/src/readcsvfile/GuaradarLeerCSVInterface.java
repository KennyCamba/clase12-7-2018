/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readcsvfile;

import java.util.ArrayList;

/**
 *
 * @author rociomera
 */
public interface GuaradarLeerCSVInterface {
    //las variables en las interfaces son estaticas y finales
    //public static String NOMBRE_ARCHIVO = "sss";
    public String writeToCSV();
    public String getNombreArchivo();
    public GuaradarLeerCSVInterface mapToCSV(String line);
}
