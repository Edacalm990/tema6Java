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
public enum Especialidad {
    CARDIOLOGÍA, CIRUGÍA, DERMATOLOGÍA, NEUROLOGÍA, PEDIATRIA, GINECOLOGÍA;

    public static Especialidad especialidadAleatoria() {
        Random random = new Random();
        Especialidad[] especialidades = Especialidad.values();
        return especialidades[random.nextInt(especialidades.length)];
    }

}
