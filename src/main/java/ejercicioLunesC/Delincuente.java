/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioLunesC;

/**
 *
 * @author venganzaalchocolate
 */
// clase Delincuente que hereda de Persona
public class Delincuente extends Persona{
    boolean libertadConCargos;
    int numDelitos;

    public Delincuente(boolean libertadConCargos, String DNI, String nombre) {
        super(DNI, nombre);
        this.libertadConCargos = libertadConCargos;
    }

    public Delincuente(boolean libertadConCargos, int numDelitos, String DNI, String nombre, String apellidos, int telefono, String direccion, String email) {
        super(DNI, nombre, apellidos, telefono, direccion, email);
        this.libertadConCargos = libertadConCargos;
        this.numDelitos = numDelitos;
    }
    
    // método de clase 
    // si comete un delito se suma 1 al numero de delito, pero si hace ruido el delito no se pertrecha
    public boolean cometerDelito(){
    boolean haceRuido=random.nextBoolean();
    if(!haceRuido){
        numDelitos++;
        return true;
    }
    return false;
    }

    // sobreescrito
    // toString que llama al metodo String del padre y lo completa con los atributos de clase
    @Override
    public String toString() {
        return """
               DELINCUENTE
               %s
               Libertad con cargos: %b
               Número de delitos cometidos: %d""".formatted(super.toString(), libertadConCargos, numDelitos);
    }
    
    
    // método sobreescrito de la clase abstracta Persona
    @Override
    public void atuendo() {
        System.out.println("Lleva pasamontañas");
    }
    
}
