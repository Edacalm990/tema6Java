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
public enum ObrasPictoricas {
    GIOCONDA("La Gioconda"), GUERNICA("El Guernica"), NOCHE_ESTRELLADA("La noche Estrellada");

    private String nombre;

    private ObrasPictoricas(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public static ObrasPictoricas nombreAleatorio() {
        Random random = new Random();
        ObrasPictoricas[] listaGrupos = ObrasPictoricas.values();
        return listaGrupos[random.nextInt(listaGrupos.length)];
    }

}
