/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoMinerva;

/**
 *
 * @author venganzaalchocolate
 */
public class Monitor extends Empleado {

    
    public Monitor(String nif) {
        super(nif);
    }

//    @Override
//    public int compareTo(Empleado o) {
//        return this.getNif().compareToIgnoreCase(o.getNif());
//    }

    @Override
    public String toString() {
        return """
               
               Monitor
               %s
               """.formatted(super.toString());
    }
    
    
}
