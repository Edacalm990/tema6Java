/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoMinerva;

import java.util.SortedMap;
import java.util.TreeMap;
import java.time.LocalDate;
/**
 *
 * @author eli
 */
public class C_Escultura extends Conservadores {
    
    SortedMap<Obra, LocalDate> listaObras;
    
    public C_Escultura(String nif) {
        super(nif);
        listaObras=new TreeMap<>();
    }
    
    @Override
    public String toString() {
        return """
               
               Conservador Escultorico
               %s
               """.formatted(super.toString());
    }

    @Override
    public void restaurarObra(Obra obra) {
        listaObras.put(obra, LocalDate.now());
    }

  
}
