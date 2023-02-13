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
3.- Implementa una jerarquía de clases como la que se detalla a continuación:
A) Persona
Atributos: nombre, nif, edad
Métodos: 
- Getters y setters.
- Constructores (por defecto y parametrizado)
- Método toString(), que devolverá en un String los atributos de persona concatenados.
B) Empleado, especialización de Persona.

Atributos: salario
Métodos: 
- Getter y Setter.
- Constructores (por defecto y parametrizado)
- Método toString(), que sobrescribe el método toString() de la superclase, añadiendo además de los atributos de persona los propios de empleado.
- Un método que permita aumentar el salario en una cantidad que sería pasada como parámetro.
C) Programador, especialización de Empleado. 

Atributos: categoría (que puede ser “Analista”, “Senior” y “Junior”). Implementar usando Enum.
Métodos: 
- Getter y Setter.
- Constructores (por defecto y parametrizado)
- Método toString(), que sobrescribe el método toString() de la superclase, añadiendo además de los atributos de empleado los propios de programador.
Dibuja el diagrama de clases UML correspondiente a la jerarquía.
Realiza una clase Prueba, para probar las clases anteriores. 
Usa los constructores para crear un par de objetos de cada clase 
y comprueba como un objeto de una clase hija puede llamar a métodos de la clase padre, 
pero no al contrario. Ejecuta los métodos toString() de cada uno de los objetos y comprueba el resultado.

*/
public class mainEjercicio3 {
    public static void main(String[] args) {
        Persona personaUno= new Persona("pepe", "12345", 25);
        Empleado empleadoUno= new Empleado(1200, "Maria", "123456789", 35);
        Programador programadorUno= new Programador(CategoriaProgramador.ANALISTA, 1100, "Gabriel", "123FVG", 20);
        
        personaUno.toString();
        System.out.println("""
                           Persona:
                           %s
                           
                           Empleado:
                           %s
                           
                           Programador:
                           %s
                           """.formatted(personaUno.toString(),
                                                empleadoUno.toString(),
                                                programadorUno.toString()
                                   ));
        
        // cambio un parametro de una hija usando el método del padre
        empleadoUno.setEdad(45);
        
        // cambio un parametro del nieta usando un método del abuelo
        programadorUno.setNombre("Victor");
        
         System.out.println("""
                            Ahora Maria tiene que tener 45 años en vez de 35 años y
                            El programador se debe llamar Victor en vez de Gabriel
                            
                           Persona:
                           %s
                           
                           Empleado:
                           %s
                           
                           Programador:
                           %s
                           """.formatted(personaUno.toString(),
                                                empleadoUno.toString(),
                                                programadorUno.toString()
                                   ));
    }
}
