/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio16;

import java.util.Random;

/**
 *
 * @author eli
 */
public class Robot implements Comparable<Robot>{
    private static Random random=new Random();
    private int numSerie;
    private int porcentajeVida;

    public Robot() {
        this.numSerie=random.nextInt(999999);
        this.porcentajeVida=random.nextInt(1, 101);
    }

    public Robot(int numSerie, int porcentajeVida) {
        this.numSerie = numSerie;
        this.porcentajeVida = porcentajeVida;
    }
    
    

    @Override
    public String toString() {
        return """
               Nº serie: %s
               Vida restante: %s %%
               """.formatted(this.numSerie,this.porcentajeVida);
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public int getPorcentajeVida() {
        return porcentajeVida;
    }

    public void setPorcentajeVida(int porcentajeVida) {
        this.porcentajeVida = porcentajeVida;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.numSerie;
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
        final Robot other = (Robot) obj;
        return this.numSerie == other.numSerie;
    }

    @Override
    public int compareTo(Robot o) {
        return Integer.compare(numSerie, o.numSerie);
    }
    
    
}
