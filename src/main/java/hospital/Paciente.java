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
public class Paciente extends Persona implements Nadadores{
    private String numHistoria;
    
    // todos lo atributos son aleatorios por tanto el contructor está vacio e intancia de forma random según cada atributo
    public Paciente() {
        numHistoria=RandomStringUtils.randomAlphanumeric(5);
    }

    public String getNumHistoria() {
        return numHistoria;
    }
    
    
    public void tomarMedicina(String medicina){
        System.out.println("""
                           %s %s toma la medicina %s""".formatted(super.getNombre(), super.getApellidos(), medicina));
    }

    @Override
    public String toString() {
        return """
               %s
               Nº Historia: %s
               
               """.formatted(super.toString(), numHistoria);
    }

    // como implementa la interfaz Nadadores hereda el método abstracto nadar
    @Override
    public String nadar() {
        return ("""
                           %s %s es paciente y nada
                          
                """.formatted(super.getNombre(), super.getApellidos()));
    }

    
    
}
