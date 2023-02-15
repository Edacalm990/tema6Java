/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author eli
 */
public class SetMain {

    public static void main(String[] args) {
        Set<Integer> conjunto = new HashSet<>();

        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);

//        for (Integer integer : conjunto) {
//            System.out.println("Elemento "+integer);
//            if (integer==20){
//                //esto no se puede hacer en un set, no puedo borrar en un conjunto de datos si se está recorriendo
//                conjunto.remove(20);
//            }
//        }
        Iterator<Integer> it = conjunto.iterator();
        while (it.hasNext()) {
            Integer numerico = it.next();
            if (numerico == 2) {
                it.remove();
            }
        }
        System.out.println("");
        conjunto.forEach(x -> System.out.println(x));
    }
}
