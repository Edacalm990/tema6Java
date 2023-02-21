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
// Crea la clase Moneda, especialización de la clase Azar. El método lanzar() de la clase Moneda devolverá un número aleatorio entre 1 y 2.
public class Moneda extends Azar{

    private static Random random = new Random();


    public Moneda() {
        this.posibilidades=2;
    }

    
    @Override
    public int lanzar() {
        return random.nextInt(1, this.getPosibilidades()+1);
    }
    
}
