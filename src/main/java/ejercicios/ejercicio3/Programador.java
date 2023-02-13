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
C) Programador, especialización de Empleado. 

Atributos: categoría (que puede ser “Analista”, “Senior” y “Junior”). Implementar usando Enum.
Métodos: 
- Getter y Setter.
- Constructores (por defecto y parametrizado)
- Método toString(), que sobrescribe el método toString() de la superclase, añadiendo además 
de los atributos de empleado los propios de programador.
*/
public class Programador extends Empleado{
    private CategoriaProgramador categoria;

    public Programador() {
    }

    public Programador(CategoriaProgramador categoria) {
        this.categoria = categoria;
    }

    public Programador(CategoriaProgramador categoria, double salario, String nombre, String nif, int edad) {
        super(salario, nombre, nif, edad);
        this.categoria = categoria;
    }

    public CategoriaProgramador getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProgramador categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
                return """
                %s
                Categoria: %s
                       """.formatted(
                       super.toString(),
                       this.getCategoria());
    }
    
    
    
}
