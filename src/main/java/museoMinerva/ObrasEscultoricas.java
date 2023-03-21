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
public enum ObrasEscultoricas {
    DAVID("David"), VENUS("Venus de Milo"), PIEDAD("La Piedad");

    private String nombre;

    private ObrasEscultoricas(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public static ObrasEscultoricas nombreAleatorio() {
        Random random = new Random();
        ObrasEscultoricas[] listaGrupos = ObrasEscultoricas.values();
        return listaGrupos[random.nextInt(listaGrupos.length)];
    }

}
