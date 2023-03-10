/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package repaso.repasoAntesExamenMarzo.clase2Repaso;

/**
 *
 * @author eli
 */
public record Silla(int peso, String nombre) implements Comparable<Silla>{

    
    @Override
    public int compareTo(Silla o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }
    
}
