/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eli
 */
public class mainAzar {

    public static void main(String[] args) {
        List<Azar> objetosAzar = new ArrayList<>();
        
        Azar moneda = new Moneda();
        Azar dado = new Dado(6);
        
        objetosAzar.add(dado);
        objetosAzar.add(moneda);

        for (int i = 0; i < 5; i++) {
            System.out.println("""
                           En la tirada %d
                           En la moneda a salido: %s
                           En el dado a salido: %d
                           """.formatted(
                    i + 1,
                    (moneda.lanzar() == 1)
                    ? "Cara"
                    : "Cruz",
                    dado.lanzar()
            )
            );
        }
        
        for (Azar azar : objetosAzar) {
            System.out.print(azar.lanzar()+" ");
            
            if (azar instanceof Dado){
            ((Dado)azar).soyDado();
            }
        }

    }
}
