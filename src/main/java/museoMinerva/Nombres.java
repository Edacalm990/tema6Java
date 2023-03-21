/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package museoMinerva;


import java.util.Random;

/**
 *
 * @author venganzaalchocolate
 */
public enum Nombres {
    ANTONIO, JOSE, MANUEL, FRANCISCO, DAVID, JUAN, MARIA, CARMEN, JOSEFA, ISABEL, LAURA, CRISTINA, PAULA, ELENA;
    
     public static Nombres nombreAleatorio() {
        Random random = new Random();
        Nombres[] nombres = Nombres.values();
        return nombres[random.nextInt(nombres.length)];
    }
}
