/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoMinerva;

import java.util.Collections;
import java.util.Set;

/**
 *
 * @author venganzaalchocolate
 */
public class main {

    public static void main(String[] args) {
        // creo un museo
        Museo museo = new Museo();

        // añado una sala fija
        museo.addSala("fija");
        // creo un cuadro
        Obra cuadro = new Pictorica(0);
        // lo añado a la sala
        museo.addObra(0, cuadro);
        
        // añado otra sala fija
        museo.addSala("fija");
        // creo una escultura
        Obra escultura = new Escultorica(1);
        // añado la escultura a la segunda sala fija 
        museo.addObra(1, escultura);
        
        // creo un conjunto de obras únicas de todas las obras que tiene el museo
        Set<Obra> listaObrasMuseo= museo.listaObrasMuseo();
        // muestro las obras
        listaObrasMuseo.forEach(System.out::println);
        
        museo.contratar(new C_Pintura("30341889G"));
        museo.contratar(new C_Escultura("78965634Q"));
        
        // relizo la restauracion de la pintura 0 c con el conservador pictorico
        // solo restaurará una obra que esté en la lista de obras y el restaurador debe ser del mismo tipo que la obra que esta restaurando
        museo.restaurarObra("30341889G", 0);
        
        // mostramos el string del museo, con la lista de salas, empleados, y obras que están restaurando
        System.out.println(museo.toString());
        
        // activo el sesor de temperatura de la sala 0, con una temperatura de 100º
        museo.activarSensores(0, 0, 100);
        
        museo.buscarEmpleadoContain("78965634Q");
    }
}
