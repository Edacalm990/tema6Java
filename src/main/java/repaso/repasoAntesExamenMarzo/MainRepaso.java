/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.repasoAntesExamenMarzo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author eli
 */
/*
Lista vuelos -> Map para cada ciudad de destino : num total de pasajeros
Lista vuelos -> Map codigo vuelo: set
*/
public class MainRepaso {
    
    public static void main(String[] args) {
        List <Vuelo> listaVuelos= new ArrayList<>();
        
        for (int i = 0; i < 20; i++) {
            listaVuelos.add(new Vuelo());
        }
        
        for (int i = 0; i < listaVuelos.size(); i++) {
            Vuelo get = listaVuelos.get(i);
            System.out.print(get.getDestino());
            System.out.println(get.getListaPasajeros().size());
        }
        
        Collections.sort(listaVuelos, (p1,p2)->p1.getDestino().compareTo(p2.getDestino()));
        
        Map listaDestinoNumPasajeros= listaNumPasajeros(listaVuelos);
        Map listaCodigoPasajero = listaPasajeros(listaVuelos);
        
         for (Object key : listaDestinoNumPasajeros.keySet()) {
            System.out.printf("Destino %s --  nº de pasajeros: %s %n", key, listaDestinoNumPasajeros.get(key));
        }
         
         for (Object key : listaCodigoPasajero.keySet()) {
            System.out.printf("Codigo %s --  lista de pasajeros: %s %n", key, listaCodigoPasajero.get(key));
        }
    }
    
    
    public static Map listaNumPasajeros(List<Vuelo>vuelos){
        SortedMap<Ciudades, Integer> listaNumPasajero = new TreeMap<>();
        
            for (Vuelo vuelo : vuelos) {
                if (listaNumPasajero.containsKey(vuelo.getDestino())){
                    listaNumPasajero.put(vuelo.getDestino(), (listaNumPasajero.get(vuelo.getDestino()))+vuelo.getListaPasajeros().size());
            } else {
                listaNumPasajero.put(vuelo.getDestino(), vuelo.getListaPasajeros().size());
                }
        }
            
        
        
        return listaNumPasajero;  
    }
    
    public static Map listaPasajeros (List<Vuelo>vuelos){
        SortedMap<Integer, Set<Pasajero>> listaPasajero = new TreeMap<>();
            for (Vuelo vuelo : vuelos) {
                Set<Pasajero> setPasajeros= new HashSet<>(vuelo.getListaPasajeros());
               
              listaPasajero.put(vuelo.getCodigo(), setPasajeros);
        }
           
        return listaPasajero; 
    }
}
