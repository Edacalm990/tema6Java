/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author eli
 */
public abstract class Persona{
    private String nombre;
    private String apellidos;
    private Nif nif;

    // todos lo atributos son aleatorios por tanto el contructor está vacio e intancia de forma random según cada atributo
    public Persona() {
        this.nombre = Nombres.nombreAleatorio().toString();
        this.apellidos = Apellidos.apellidoAleatorio().toString();
        this.nif = new Nif();
    }

    public Nif getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    @Override
    public String toString() {
        return """
               Nombre: %s
               Apellido: %s
               Nif: %s""".formatted(nombre, apellidos, nif.toString());
    }

    // método para renovar el NIF
     public void renovarNif(LocalDate fechaSolicitud) {
       getNif().renovarDni(fechaSolicitud);
    }
}
