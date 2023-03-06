/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio11;

/**
 *
 * @author eli
 */
public abstract class Figura {
    private double base;
    private double altura;

    public Figura(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public abstract double calcularArea();

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    
    
    
}
