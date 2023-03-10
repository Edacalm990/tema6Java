/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.repasoAntesExamenMarzo.clase2Repaso;

import java.util.Objects;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author eli
 */
public class Sofa implements Comparable<Sofa>{
    // comparable treeset o treemap
    private static Random random= new Random();
    
    private int peso;
    private String nombre;

    public Sofa(int peso, String nombre) {
        this.peso = peso;
        this.nombre = nombre;
    }

    public Sofa() {
        peso=random.nextInt(99);
        nombre=RandomStringUtils.randomAlphabetic(5);
             
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.nombre);
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
        final Sofa other = (Sofa) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public int compareTo(Sofa o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }

    @Override
    public String toString() {
        return "Sofa{" + "peso=" + peso + ", nombre=" + nombre + '}';
    }

    public int getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
