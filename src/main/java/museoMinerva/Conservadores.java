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
// Los conservadores tienen una lista de obras que están restaurando e implementa la interfaz Restauradores 
//que tiene un método abstracto donde se incluyen las obras que está restaurando
public abstract class Conservadores extends Empleado implements Restauradores{
    SortedMap<Obra, LocalDate> listaObras;
    
    public Conservadores(String nif) {
        super(nif);
    }
      
}
