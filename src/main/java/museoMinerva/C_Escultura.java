/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoMinerva;

import java.util.SortedMap;
import java.util.TreeMap;
import java.time.LocalDate;
import java.util.Map;
/**
 *
 * @author eli
 */
public final class C_Escultura extends Conservadores {
    // lo único diferente entre el pictorico y el escultorico será el string. 
    public C_Escultura(String nif) {
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
               
               Conservador Escultorico
               %s
               %s
               """.formatted(super.toString(), (obra.length()>34)?obra:"");
    }
    
     // método abstracto de la interfaz restauradores que hereda c_escultura al heredar de conservadores

    @Override
    public void restaurarObra(Obra obra) {
        listaObras.put(obra, LocalDate.now());
    }

  
}
