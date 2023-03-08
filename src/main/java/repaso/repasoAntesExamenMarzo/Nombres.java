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
public enum Nombres {
    ALBA, JOSE, PEDRO, MARIA, JUAN, ANTONIO, MIGUEL;
    
        // método para poner de forma aleatoria una ciudad
    public static Nombres getAleatorio () {
        var r=new Random();
        Nombres [] lista=Nombres.values();
        int posicion = r.nextInt(0, lista.length);
        return lista[posicion];
    }
}
