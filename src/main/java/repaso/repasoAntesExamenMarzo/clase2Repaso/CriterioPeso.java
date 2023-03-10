/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.repasoAntesExamenMarzo.clase2Repaso;

import java.util.Comparator;

/**
 *
 * @author eli
 */
public class CriterioPeso implements Comparator<Sofa>{

    @Override
    public int compare(Sofa o1, Sofa o2) {
        return Integer.compare(o1.getPeso(), o2.getPeso());
    }
    
}
