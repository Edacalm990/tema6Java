/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio15;

import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author venganzaalchocolate
 */
public class Persona {
    public  static Random random= new Random();
    
    private String nombre;
    private String apellidos;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Persona() {
        nombre=nombreAleatorio();
        apellidos=apellidosAleatorio();
    }
    
    private String nombreAleatorio(){
        String [] nombres = {"Pepe", "Juan", "Maria", "Claudia"};
        return nombres[random.nextInt(0, nombres.length)];
    }
    
        private String apellidosAleatorio(){
        String [] apellidos = {"Martinez", "Hernandez", "Navarro", "Moyano"};
        return apellidos[random.nextInt(0, apellidos.length)];
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
    
}
