/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioLunesC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author venganzaalchocolate
 */
public class mainC {

    public static Random random = new Random();

    public static void main(String[] args) {
        // conversion implicita
        Persona uno = new Policia(123456, "77454367F", "Rodolfo", "Martinez", 600000000, "Estepona", "soypolicia@gmail.com");
        Persona dos = new Policia(789234, "45464748F", "Julia", "Martinez", 600000006, "Estepona", "soyjulia@gmail.com");
        Persona tres = new Delincuente(true, 0, "89654567", "Juan", "Vega", 0, "Madrid", "");
        Persona cuatro = new Delincuente(false, 0, "78543423D", "Maria", "Mina", 657544532, "Sevilla", "soycaco@gmail.com");
        Persona cinco = new Policia(45671, "56438989j", "Alfonso");
        Persona seis = new Delincuente(true, "12345678A", "Clara");

        List<Persona> listaPersonas = new ArrayList<>();

        listaPersonas.add(uno);
        listaPersonas.add(dos);
        listaPersonas.add(tres);
        listaPersonas.add(cuatro);
        listaPersonas.add(cinco);
        listaPersonas.add(seis);

        // recorro la lista de personas que pueden ser Delincuentes o Policias
        for (Persona persona : listaPersonas) {

            // con instance of determinamos si es una Persona de tipo Delincuente o una Persona de tipo Policia
            if (persona instanceof Delincuente) {
                // llamo al método de clase cometerDelito()
                // para conseguir llamar al método tengo que determinar que Persona es un Delincuente y luego parsearlo
                if (!((Delincuente) persona).cometerDelito()) {
                    System.out.println("El delincuente ha hecho demasiado ruido y ahora le persigue un policia");
                    // aquí no estoy llamando a un método de delincuente sino que busco un policia random llamando al método static buscarPolicia y le paso como parametro el delincuente en cuestión
                    System.out.println((buscarPolicia(listaPersonas)).atraparDelincuente((Delincuente) persona));
                } else {
                    System.out.println("El delincuente ha perpretado el crimen en silencio");
                }
            } else if (persona instanceof Policia) {
                // llamo al método de clase encuentraDelincuente()
                // para conseguir llamar al método tengo que determinar que Persona es un Policia y luego parsearlo
                // si es true llamará al método de clase atraparDelincuente con un Delincuente aleatorio llamando al método static buscarDelincuente 
                if (((Policia) persona).encuentraDelincuente()) {
                    System.out.println(((Policia) persona).atraparDelincuente(buscarDelincuente(listaPersonas)));
                }
            } 
            // llamo al método polimórfico atuendo(), el policia llevará uniforme y el delincuente pasamontañas
            // no hace falta determinar si es policia o delincuente con el poliformismo ya lo interpreta solo. 
            // pero para llamar a métodos de la clase si que debo saber si es un Policia o un Delincuente, 
            // en este caso atuendo es un método abstracto
            System.out.println(persona.toString());
            persona.atuendo();
            System.out.println(persona.getEstado().getTextoEstado());
            System.out.println("---------------------------------------------------------------------------------------------------");
        }
        
////        Estas lineas doblemente comentadas son para mi, para entender el orden natural y el comparator        
////        Collections.sort(listaPersonas);        
////        int buscarPersona = Collections.binarySearch(listaPersonas, new Delincuente(true, "", "Clara"));
////        System.out.println(buscarPersona);
        
        // el orden natural de persona es el nombre así que para hacer la busqueda binaria lo ordeno por dni porque voy a buscar un dni
        Collections.sort(listaPersonas, (p1,p2)->p1.getDNI().compareToIgnoreCase(p2.getDNI()));
        // muestro la lista de persona solo con nombre y dni para que no sea demasiado larga
        listaPersonas.forEach(x->System.out.println(x.getNombre()+" DNI: "+x.getDNI()));
        // creamos un criterio de busqueda comparator, comparando el dni
        Comparator<Persona> criterioDni =(p1,p2) ->p1.getDNI().compareToIgnoreCase(p2.getDNI());
        // realizamos una busqueda binaria de una persona pasando el criterio de busqueda
        //// ATENCION : (PARA MI) DA IGUAL LA SUBCLASE QUE LE PASES, BUSCA IGUAL
        int buscarDNI = Collections.binarySearch(listaPersonas, new Policia(0, "89654567", ""), criterioDni);
        // mostramos el resultado
        System.out.println("""
                           En que posicion esta la persona con Dni "89654567": %d
                           """.formatted(buscarDNI));
    }

    // para poder llamar al método de clase atraparDelincuente tengo que buscar un policia o delincuente Random, 
    // así que he creado estos dos métodos
    public static Delincuente buscarDelincuente(List lista) {
        boolean encontrado = false;
        do {
            int num = random.nextInt(lista.size());
            if (lista.get(num) instanceof Delincuente) {
                encontrado = true;
                return ((Delincuente) lista.get(num));
            }
        } while (!encontrado);
        return null;
    }

    public static Policia buscarPolicia(List lista) {
        boolean encontrado = false;
        do {
            int num = random.nextInt(lista.size());
            if (lista.get(num) instanceof Policia) {
                encontrado = true;
                return ((Policia) lista.get(num));
            }
        } while (!encontrado);
        return null;
    }
    
    
}
