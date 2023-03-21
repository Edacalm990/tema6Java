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
    
    // todos lo atributos son aleatorios por tanto el contructor está vacio e intancia de forma random según cada atributo
    public Empleado() {
        numSeguridadSocial=RandomStringUtils.randomAlphanumeric(10);
        salario=Double.parseDouble(RandomStringUtils.randomNumeric(4));
    }
    
    // método abstracto para calcular el IRPF
    public abstract double calcularIRPF();

    public String getNumSeguridadSocial() {
        return numSeguridadSocial;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return """
               %s 
               Nº seguridad Social: %s
               Salario: %s € """.formatted(super.toString(), numSeguridadSocial,  salario);
    }
    
    
}
