/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoMinerva;

import java.time.LocalDate;
import java.util.SortedMap;

/**
 *
 * @author eli
 */
public class C_Pintura extends Conservadores {
    
    SortedMap<Obra, LocalDate> listaObras;
    
    public C_Pintura(String nif) {
        super(nif);
    }
    
     @Override
    public String toString() {
        return """
               
               Conservador Pictorico
               %s
               """.formatted(super.toString());
    }

     @Override
    public void restaurarObra(Obra obra) {
        listaObras.put(obra, LocalDate.now());
    }

   
}
