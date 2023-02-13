/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio3;

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
public class Persona {
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
    
}
