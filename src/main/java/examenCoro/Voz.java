/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package examenCoro;

import java.util.Random;

/**
 *
 * @author eli
 */
public enum Voz {
    CONTRATENOR, TENOR, BARITONO, SOPRANO, MEZZOSOPRANO, CONTRALTO;
    
    public static Voz getAleatorio () {
        var r=new Random();
        Voz [] lista=Voz.values();
        int posicion = r.nextInt(0, lista.length);
        return lista[posicion];
        
    };
    
}
