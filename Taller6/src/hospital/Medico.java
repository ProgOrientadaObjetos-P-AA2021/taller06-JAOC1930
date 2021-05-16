/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author Usuario
 */
public class Medico {

    private String nombreD;
    private String especialidad;
    private double sueldoM;

    public Medico(String nD, String e, double sM) {
        nombreD = nD;
        especialidad = e;
        sueldoM = sM;
    }

    public void establecerNombre(String nD) {
        nombreD = nD;
    }

    public void establecerEspecialidad(String e) {
        especialidad = e;
    }

    public void establecerSueldo(double sM) {
        sueldoM = sM;
    }

    public String obtenerNombre() {
        return nombreD;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }

    public double obtenerSueldo() {
        return sueldoM;
    }
}
