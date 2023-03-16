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
public abstract class Empleado extends Persona {
    private String numSeguridadSocial;
    private double salario;
    
    
    public Empleado(String nombre, String apellidos) {
        super(nombre, apellidos);
        numSeguridadSocial=RandomStringUtils.randomAlphanumeric(10);
        salario=Double.parseDouble(RandomStringUtils.randomNumeric(3, 5));
    }
    
    
    public abstract double calcularIRPF();

    public String getNumSeguridadSocial() {
        return numSeguridadSocial;
    }

    public double getSalario() {
        return salario;
    }
}
