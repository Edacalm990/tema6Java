/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.time.LocalDate;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author eli
 */
public class Paciente extends Persona {
    private String numHistoria;
    
    public Paciente(String nombre, String apellidos) {
        super(nombre, apellidos);
        numHistoria=RandomStringUtils.randomAlphanumeric(5);
    }

    
    @Override
    public void renovarNif(LocalDate fechaSolicitud) {
       super.getNif().renovarDni(fechaSolicitud);
    }
    
}
