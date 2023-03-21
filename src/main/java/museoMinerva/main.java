/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoMinerva;

import java.util.Collections;

/**
 *
 * @author venganzaalchocolate
 */
public class main {

    public static void main(String[] args) {
        Museo museo = new Museo();

        museo.contratar(new Monitor("30341889G"));
        museo.contratar(new Monitor("78965634Q"));
        museo.contratar(new Vigilante("78945632J"));
        museo.contratar(new Vigilante("40432934G"));
        
        System.out.println(museo.toString());
        
        // mirar porque no funciona
        System.out.println("Comprobamos que funciona el método despedir despidiendo a 78945632J");

        System.out.println(museo.despedir("40432934G"));
        System.out.println(museo.toString());
    }
}
