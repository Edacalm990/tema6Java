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
public enum Grupo {
    C(0.175), D(0.18), E(0.185);

    private double irpf;

    private Grupo(double irpf) {
        this.irpf = irpf;
    }

    public double getIrpf() {
        return irpf;
    }

    public static Grupo grupoAleatorio() {
        Random random = new Random();
        Grupo[] listaGrupos = Grupo.values();
        return listaGrupos[random.nextInt(listaGrupos.length)];
    }

}
