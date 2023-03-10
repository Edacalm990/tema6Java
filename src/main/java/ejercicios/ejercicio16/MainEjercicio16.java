/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author eli
 */
/*
16.- Se desea manejar una lista de tamaño variable de Robots. Cada robot tiene un número de serie (int) y un porcentaje de vida (un valor aleatorio entre 1 y 100). Se pide construir una aplicación que permita cumplir con la siguiente funcionalidad:
Crear una lista con 20 robots, creados aleatoriamente.
Imprimir la lista de robots ordenada por porcentaje de vida de los robots. Al principio de la lista DEBEN estar los robots con menos porcentaje de vida. 
Imprimir la cantidad de robots que tienen más del 50% de vida. 
Imprimir el número de serie de los TRES robots que tienen mayor porcentaje de vida. 
Además, debe ser posible ordenar los robots por número de serie.
Una vez ordenada la lista por número de serie, realizar búsqueda binaria de algún robot dentro de la lista.

*/
public class MainEjercicio16 {
    public static void main(String[] args) {
        List<Robot> listaRobots= new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listaRobots.add(new Robot());
        }
        
        listaRobots.add(new Robot(1234, 20));
        
        
        Collections.sort(listaRobots);
        listaRobots.forEach(System.out::println);
        
        System.out.println("-----------");
        Comparator<Robot> criterio = (a,b)->Integer.compare(a.getPorcentajeVida(), b.getPorcentajeVida());
        Collections.sort(listaRobots, criterio.reversed());
        listaRobots.forEach(System.out::println);
        
        System.out.println("-----------");
        Collections.sort(listaRobots, (a,b)->Integer.compare(a.getPorcentajeVida(), b.getPorcentajeVida()));
        listaRobots.forEach(System.out::println);
        
        Collections.sort(listaRobots);
        System.out.println(Collections.binarySearch(listaRobots, new Robot(1234, 0)));
        
        Collections.sort(listaRobots, criterio.reversed());
        System.out.println("""
                           %s
                           %s
                           %s
                           """.formatted(listaRobots.get(0), listaRobots.get(1), listaRobots.get(2)));
        
    }
}
