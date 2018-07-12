/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenclass;


public class RTExcept {
    protected String string = "hola";
    int valor = 7;
    @Override
    public String toString() {
        return string;
    }
    
    public int hashCode() {
        return valor%5 + string.hashCode();
    }
}


