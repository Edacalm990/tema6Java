/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.repasoAntesExamenMarzo.clase2Repaso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author eli
 */
public class MainRepasoDia2 {
    public static void main(String[] args) {
        List<Sofa>sofas= new ArrayList<>();
        Map<Sofa, Integer> mapSofas=new TreeMap<>();
        //Map<Sofa, Integer> mapSillas=new HashMap<>();
        for (int i = 0; i < 10; i++) {
            sofas.add(new Sofa());
        }
        for (int i = 0; i < sofas.size(); i++) {
            mapSofas.put(sofas.get(i), i) ;
        }
        
        
        for (Map.Entry<Sofa, Integer> entry : mapSofas.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println("""
                               Clave %s
                               Valor %s
                               """.formatted(key.toString(),val));
        }
        CriterioPeso criterio = new CriterioPeso();
        // la variable criterio es de tipo CriterioPeso, Object, Comparator
        Collections.sort(sofas, criterio);
        sofas.forEach(x->System.out.println(x));
        System.out.println("");
        Collections.sort(sofas);
        sofas.forEach(x->System.out.println(x));
        System.out.println("");
        // Comparator<Sofa> criterio = (a,b)->Integer.compare(a.getPeso(), b.getPeso());
        Collections.sort(sofas, (a,b)->Integer.compare(a.getPeso(), b.getPeso()));
        sofas.forEach(x->System.out.println(x));
        
    }
}
