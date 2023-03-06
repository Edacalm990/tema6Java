/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio11;

/**
 *
 * @author eli
 */
public class Triangulo extends Figura{

    public Triangulo(int base, int altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        return super.getBase()*super.getAltura()/2;
    }
    
}
