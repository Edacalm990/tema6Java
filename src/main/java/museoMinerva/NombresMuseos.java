/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package museoMinerva;

import hospital.*;
import java.util.Random;

/**
 *
 * @author venganzaalchocolate
 */
public enum NombresMuseos {
    MINERVA, PRADO, LOUVRE, METROPOLITANO, VATICANO, GUGGENHEIM;

    public static NombresMuseos nombreMuseosAleatorio() {
        Random random = new Random();
        NombresMuseos[] listaNombres = NombresMuseos.values();
        return listaNombres[random.nextInt(listaNombres.length)];
    }

}
