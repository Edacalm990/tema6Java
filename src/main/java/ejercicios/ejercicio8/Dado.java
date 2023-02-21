/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio8;

import java.util.Random;

/**
 *
 * @author eli
 */
/*Crea la clase Dado, especialización de la clase Azar. El método lanzar() de la clase Dado devolverá un número aleatorio entre 1 y 6.*/
public class Dado extends Azar{
    
    private static Random random= new Random();

    public Dado(int posibilidades) {
        this.posibilidades=posibilidades;
    }

    public Dado() {
        super(6);
    }
    
    public void soyDado(){
        System.out.println("Soy un dado");
    }
    
    @Override
    public int lanzar() {
        return random.nextInt(1, this.getPosibilidades()+1);
    }
    
}
