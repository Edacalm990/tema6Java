/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author venganzaalchocolate
 */
public class Medico extends Empleado implements Nadadores {
    
    private String especialidad;
    
    public Medico() {
        especialidad = Especialidad.especialidadAleatoria().toString();
    }
    
    public String getEspecialidad() {
        return especialidad;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // - Para calcular el IRPF de un médico hay que saber que si su especialidad es cirugía, se aplica un 25% sobre el salario. 
    //En caso de ser otra especialidad el IRPF que se aplica es un 23.5%.
    // podría haber puesto un atributo al enum pero he preferido dejarlo así al solo tener dos posibilidades
    @Override
    public double calcularIRPF() {
        return (this.especialidad.equalsIgnoreCase(Especialidad.CIRUGÍA.toString()))
                ? super.getSalario() * 0.25
                : super.getSalario() * 0.235;
    }
    
    // método de clase que trata un paciente llamando al método de clase de paciente tomarMedicina
    public void tratarPaciente(Paciente paciente, String Medicina) {
        Random random = new Random();
        
        System.out.println("""
                           El médico %s %s trata al paciente %s %s """.formatted(
                super.getNombre(),
                super.getApellidos(),
                paciente.getNombre(),
                paciente.getApellidos()
        ));
        paciente.tomarMedicina(Medicina);
        System.out.println("""
                           Y %s
                           """.formatted(((random.nextBoolean()) ? "se ha curado" : "no se ha curado")
        ));
    }
    
    @Override
    public String toString() {
        return """
               %s
               Especialidad: %s
               
               """.formatted(super.toString(), especialidad);
    }
    
    // como implementa la interfaz Nadadores hereda el método abstracto nadar
    @Override
    public String nadar() {
        return ("""
                           %s %s es médico y nada
                
                           """.formatted(super.getNombre(), super.getApellidos()));
    }
    
}
