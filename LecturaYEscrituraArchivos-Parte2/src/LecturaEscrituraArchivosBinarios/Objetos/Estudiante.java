/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LecturaEscrituraArchivosBinarios.Objetos;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author rociomera
 */
public class Estudiante implements Serializable{
    private String matricula;
    private String nombre;
    private String carrea;
    transient private double promedio;
    static String test="test";
    
    public Estudiante(String matricula, String nombre, 
            String carrera, double promedio){
        this.matricula = matricula;
        this.nombre = nombre;
        this.carrea = carrera;
        this.promedio = promedio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrea() {
        return carrea;
    }

    public void setCarrea(String carrea) {
        this.carrea = carrea;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }else if (getClass() != obj.getClass()) {
            return false;
        }else{
            Estudiante other = (Estudiante) obj;
            if (!Objects.equals(this.matricula, other.matricula)) {
                return false;
            }else{
                return true;
            }
        }
    }
    
    @Override
    public String toString() {
        return "matricula=" + matricula + "\n"
                + ", nombre=" + nombre + "\n"
                + ", carrea=" + carrea + "\n"
                + ", promedio=" + promedio +"\n"
                + ", test=" + test;
    }
    
}
