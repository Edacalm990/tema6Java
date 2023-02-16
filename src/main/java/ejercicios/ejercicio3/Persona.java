/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio3;

import java.util.Objects;

/**
 *
 * @author eli
 */
/*
A) Persona
Atributos: nombre, nif, edad
Métodos: 
- Getters y setters.
- Constructores (por defecto y parametrizado)
- Método toString(), que devolverá en un String los atributos de persona concatenados.
*/
public class Persona implements Comparable <Persona>{
    private String nombre;
    private String nif;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String nif, int edad) {
        this.nombre = nombre;
        this.nif = nif;
        this.edad = edad;
    }

    @Override
        public String toString() {
        return """
               Nombre: %s
               Nif: %s
               Edad: %s""".formatted(this.getNombre(), this.getNif(), this.getEdad());

    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.nif);
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
        return Objects.equals(this.nif, other.nif);
    }

    @Override
    public int compareTo(Persona o) {
        return this.nif.compareTo(o.getNif());
    }
    
}
