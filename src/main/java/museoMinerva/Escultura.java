/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoMinerva;

/**
 *
 * @author eli
 */
public class Escultura extends Conservadores {
    
    public Escultura(String nif) {
        super(nif);
    }
    
    @Override
    public String toString() {
        return """
               
               Conservador Escultorico
               %s
               """.formatted(super.toString());
    }

  
}
