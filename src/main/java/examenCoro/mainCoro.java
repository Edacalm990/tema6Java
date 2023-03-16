/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenCoro;

import java.util.List;
import java.util.Set;

/**
 *
 * @author eli
 */
/*
EJ3 (5 puntos).- En un nuevo paquete llamado ej3, crea un Enum llamado Voz con seis elementos: 
CONTRATENOR, TENOR, BARITONO, SOPRANO, MEZZOSOPRANO y CONTRALTO. 
Consideraremos un coro de voces mixtas aquel en el que hay al menos un tipo de voz diferente, de las anteriores. 
1. Crea una clase, llamada Coro, sin atributos de instancia que incluya los siguientes métodos de clase públicos. 
Si existen atributos de clase serán privados. Si existen otros métodos, serán privados. Se pueden crear otras clases, si se estima necesario.
2. generarVoces, que recibe un número entero mayor o igual a 6, y debe devolver un objeto tipo List<Voz> con tantas voces (masculinas y femeninas) 
aleatorias como indique el parámetro. En caso de que el parámetro sea incorrecto, se lanzará una excepción de tipo IllegalArgument.
3. getNumeroCorosMixtos, que recibe la lista generada por el método anterior y devuelve el número de coros mixtos que se pueden agrupar según las voces contenidas en la lista.
4. buscarVozMasRepetida, que recibe la lista generada por el método implementado en A 
y devuelve un conjunto único de voces indicando las voces que más se repiten en la lista. Por ejemplo, 
si en una lista de 20 voces hay dos voces (A y B) con 5 repeticiones cada una y son las que más se repiten, 
debería devolver esas dos voces (A y B).
En una clase llamada PruebaCoro (0,25 puntos), dentro de ej3, implementa el código necesario para generar 
una lista de 20 voces aleatorias, mostrar por pantalla el resultado y probar los métodos B y C.
*/
public class mainCoro {
    public static void main(String[] args) {
        Coro coro= new Coro();
        List<Voz> listaVoces = coro.generarVoces(20);
        listaVoces.forEach(System.out::println);
        int numeroCorosMixtos = coro.getNumeroCorosMixtos(listaVoces);
        System.out.println(numeroCorosMixtos);
        
        Set <Voz> vocesMasRepetidas = coro.buscarVozMasRepetida(listaVoces);
        System.out.println("Voces Mas repetidas");
        
        vocesMasRepetidas.forEach(x->System.out.println(x.toString()));
    }
}
