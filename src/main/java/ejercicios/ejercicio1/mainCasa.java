/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio1;

/**
 *
 * @author eli
 */
public class mainCasa {
    public static void main(String[] args) {
        Ventana v1= new Abatible();
        Ventana v2 = new Corredera();
        
        Casa casa = new Casa();
        
        casa.addVentana(v1);
        casa.addVentana(v2);
        
        casa.abrirVentana(0);
    }
  
}
