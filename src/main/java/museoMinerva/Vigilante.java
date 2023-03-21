/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoMinerva;

/**
 *
 * @author venganzaalchocolate
 */
public class Vigilante extends Empleado{

    public Vigilante(String nif) {
        super(nif);
    }

//    @Override
//    public int compareTo(Empleado o) {
//        return this.getNif().compareToIgnoreCase(o.getNif());
//    }

    @Override
    public String toString() {
        return """
               
               Vigilante
               %s
               """.formatted(super.toString());
    }
    
    
}
