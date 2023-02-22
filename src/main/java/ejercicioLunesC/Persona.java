/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioLunesC;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author venganzaalchocolate
 */
public abstract class Persona implements Comparable<Persona>{
    public static Random random = new Random();
    
    final String DNI;
    private String nombre;
    private String apellidos;
    private int telefono;
    private String direccion;
    private String email;
    private Estado estado;
    private int velocidad;


    public Persona(String DNI, String nombre) {
        this.DNI = DNI;
        this.nombre=nombre;
        this.estado=Estado.SENTADO;
    }

    public String getDNI() {
        return DNI;
    }
    

    public Persona(String DNI, String nombre, String apellidos, int telefono, String direccion, String email) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.estado=Estado.SENTADO;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.DNI);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return Objects.equals(this.DNI, other.DNI);
    }

    @Override
    public int compareTo(Persona o) {
         return this.nombre.compareToIgnoreCase(o.nombre);
    }
    
    public abstract void atuendo();

    @Override
    public String toString() {
        return """
               Nombre: %s
               Apellidos: %s
               Teléfono:%s
               Dirección: %s
               Correo electrónico: %s
               DNI: %s""".formatted(nombre, apellidos, telefono, direccion, email, DNI);
    }
    
    
    
}
