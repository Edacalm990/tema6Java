/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package hospital;

import java.util.Random;

/**
 *
 * @author venganzaalchocolate
 */
public enum Apellidos {

    GARCÍA, RODRIGUEZ, GONZÁLEZ, FERNANDEZ, LÓPEZ, MARTÍNEZ, SÁNCHEZ, PÉREZ;
    
     public static Apellidos apellidoAleatorio() {
        Random random = new Random();
        Apellidos[] apellidos= Apellidos.values();
        return apellidos[random.nextInt(apellidos.length)];
    }
}
