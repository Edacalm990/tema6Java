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
public enum PasajeroTipo {
    PRIORITARIO, NO_PRIORITARIO;
    
    // método para poner de forma aleatoria una ciudad
    public static PasajeroTipo getAleatorio () {
        var r=new Random();
        PasajeroTipo [] lista=PasajeroTipo.values();
        int posicion = r.nextInt(0, lista.length);
        return lista[posicion];
    }
}
