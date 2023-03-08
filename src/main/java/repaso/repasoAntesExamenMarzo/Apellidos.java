/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package repaso.repasoAntesExamenMarzo;

import java.util.Random;

/**
 *
 * @author eli
 */
public enum Apellidos {
    MARTINEZ, FERNANDEZ, VEGA;
    
        public static Apellidos getAleatorio () {
        var r=new Random();
        Apellidos [] lista=Apellidos.values();
        int posicion = r.nextInt(0, lista.length);
        return lista[posicion];
    }
}
