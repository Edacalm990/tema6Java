/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio3;

/**
 *
 * @author eli
 */
/*
B) Empleado, especialización de Persona.

Atributos: salario
Métodos: 
- Getter y Setter.
- Constructores (por defecto y parametrizado)
- Método toString(), que sobrescribe el método toString() de la superclase, añadiendo además de los atributos de persona los propios de empleado.
- Un método que permita aumentar el salario en una cantidad que sería pasada como parámetro.
*/
public abstract class Empleado extends Persona{
    private double salario;

    public Empleado() {
    }

    public Empleado(double salario, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.salario = salario;
    }
    
    public abstract void aumentarSalario();

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return """
               %s
               Salario: %s""".formatted(super.toString(),this.salario);

    }
    
    
}
