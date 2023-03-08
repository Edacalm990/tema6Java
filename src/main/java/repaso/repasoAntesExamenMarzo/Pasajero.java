/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.repasoAntesExamenMarzo;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author eli
 */
/*
nombre
nif
apellidos
tipo: Prioritario o noPrioritario
*/
public  class  Pasajero {
    
    private Nombres nombre;
    private String nif;
    private Apellidos apellido;
    private PasajeroTipo tipo;

    public Pasajero() {
        nombre= Nombres.getAleatorio();
        nif=RandomStringUtils.randomAlphanumeric(8);
        apellido=Apellidos.getAleatorio();
        tipo= PasajeroTipo.getAleatorio();
    }

    public Nombres getNombre() {
        return nombre;
    }

    public String getNif() {
        return nif;
    }

    public Apellidos getApellido() {
        return apellido;
    }

    public PasajeroTipo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "nombre=" + nombre + ", nif=" + nif + ", apellido=" + apellido + ", tipo=" + tipo + '}';
    }


    
}
