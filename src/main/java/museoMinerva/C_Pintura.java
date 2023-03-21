/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoMinerva;

import java.time.LocalDate;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author eli
 */
public final class C_Pintura extends Conservadores {
    
    public C_Pintura(String nif) {
        super(nif);
        listaObras=new TreeMap<>();
    }
    
     @Override
    public String toString() {
        String obra="Lista de Obras que está resaurando";
         
        for (Map.Entry<Obra, LocalDate> entry : listaObras.entrySet()) {
            Obra key = entry.getKey();
            LocalDate val = entry.getValue();
            obra+="""
                 
                 Nombre de la obra: %s
                 Fecha de inicio de restauracion: %s
                 """.formatted(key.getNombre(), val.toString());
        }
        return """
               
               Conservador Pictorico
               %s
               %s
               """.formatted(super.toString(), (obra.length()>34)?obra:"");
    }

    // método abstracto de la interfaz restauradores que hereda c_pintura al heredar de conservadores
     @Override
    public void restaurarObra(Obra obra) {
        listaObras.put(obra, LocalDate.now());
    }

   
}
