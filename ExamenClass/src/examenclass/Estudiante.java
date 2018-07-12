/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenclass;

import java.io.Serializable;

public class Estudiante implements Serializable, Comparable<Estudiante> {
    private String nombre;
    private String cedula;
    transient private int edad;

    public Estudiante(String nombre, String cedula, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Devuelve positivo si el criteri de comparacion del this es mayor que el otro objeto
     * Devuelve negativo si el el criteri de comparacion del this en menor que el otro objeto
     * Devuelve cero si el criteri de comparacion es igual para ambos.
     * @param o
     * @return 
     */
    @Override
    public int compareTo(Estudiante o) {
        //return nombre.compareTo(o.nombre);
        return this.edad - o.edad;
    }
    
    
}
