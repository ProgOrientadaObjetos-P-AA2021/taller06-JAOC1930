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
public class Ciudad {

    private String nombreCiudad;
    private String provincia;

    public Ciudad(String n, String p) {
        nombreCiudad = n;
        provincia = n;
    }

    public void establecerCiudad(String n) {
        nombreCiudad = n;
    }

    public void establecerProvincia(String p) {
        provincia = p;
    }

    public String obtenerCiudad() {
        return nombreCiudad;
    }

    public String obtenerProvincia() {
        return provincia;
    }
}
