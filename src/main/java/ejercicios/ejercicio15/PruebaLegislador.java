/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author venganzaalchocolate
 */
public class PruebaLegislador {

    public static Random random = new Random();

    public static void main(String[] args) {
        List<Legislador> listaPersonas = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            if (random.nextBoolean()) {
                listaPersonas.add(new Diputado());
            } else {
                listaPersonas.add(new Senador());
            }
        }
              
        for (Legislador persona : listaPersonas) {
            System.out.println(persona.getCamara());
            System.out.println(persona.toString());            
        }
    }
}
