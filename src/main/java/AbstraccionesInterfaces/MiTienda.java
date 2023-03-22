/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstraccionesInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author eli
 */
/*
 */
public class MiTienda {

    public static void main(String[] args) {
        // Crea una lista de productos y añade dos objetos de cada tipo de producto distinto (de los posibles) a la misma.
        List<Producto> listaProductos = new ArrayList<>();

        listaProductos.add(new Pantalon(40, "Levis", 0, 100, 21, "Levi's 501"));
        listaProductos.add(new Musica("ACDC", 1, 23.5, 21, "Grupo de música"));
        listaProductos.add(new LibroDigital(200, "abcd", 3, 5, 4, "La sombra de Leo"));
        listaProductos.add(new LibroPapel(500, "efghi", 4, 10, 4, "Legado de Huesos"));
        listaProductos.add(new Pantalon(42, "C&A", 5, 20, 21, "slim"));
        listaProductos.add(new Musica("Amaral", 6, 8, 21, "Pop"));
        listaProductos.add(new LibroDigital(300, "jklm", 7, 3, 4, "Los pilares de la tierra"));
        listaProductos.add(new LibroPapel(500, "hijks", 8, 10, 4, "La sombra del viento"));

        // Muestra los datos de los productos usando un foreach. 
        System.out.println("Muestra de productos usando foreach");
        listaProductos.forEach(System.out::println);

        // Ordena la lista de productos según el precio, haciendo uso de <<Comparator>> y una expresión lambda. Muestra la lista de productos ordenados por precio.
        //  lista.sort((pa,pb)->pa.getApellido1().compareTo(pb.getApellido1()));
        System.out.println("LISTA ORDENADA POR PRECIO");
        listaProductos.sort((p1, p2) ->  Double.compare(p1.getPrecio(), p2.getPrecio()));
        listaProductos.forEach(System.out::println);

        // Ordena la lista de productos según el código, haciendo uso de <<Comparator>> y una expresión lambda. Muestra la lista de productos ordenados por código.
        System.out.println("LISTA ORDENADA POR CODIGO");
        listaProductos.sort((p1, p2) -> p1.getCodigo()-p2.getCodigo());
        listaProductos.forEach(System.out::println);

        // Realiza la búsqueda binaria, según su código, de algún producto que exista dentro de la lista y otro que no exista, mostrando la posición que ocupa en la lista.
         int posicion = Collections.binarySearch(listaProductos, new Pantalon(0, "", 1, 0, 0, ""), (p1, p2) -> p1.getCodigo()-p2.getCodigo());
        System.out.println("BINARY SEARCH CON PRODUCTO QUE EXISTE");
        System.out.println(posicion);
         posicion = Collections.binarySearch(listaProductos, new Pantalon(0, "", 24, 0, 0, ""), (p1, p2) -> p1.getCodigo()-p2.getCodigo());
        System.out.println("BINARY SEARCH CON PRODUCTO QUE NO EXISTE");
        System.out.println(posicion);
        
         
        //Recorre la lista de productos y guarda todos los libros en una lista de libros.
        List<Libro> listaLibros = new ArrayList<>();
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto get = listaProductos.get(i);
            if (get instanceof Libro) {
                listaLibros.add((Libro) get);
            }
        }

        // Muestra los datos de la lista de libros usando un objeto Iterator. 
        for (Iterator<Libro> iterator = listaLibros.iterator(); iterator.hasNext();) {
            Libro next = iterator.next();
            System.out.println(next.toString());
        }

        // Ordena los libros según ISBN, haciendo uso de <<Comparable>>. Muestra la lista de libros ordenada.
        System.out.println("-----------------Lista de libros ordenada por haciendo uso del <<Comparable>>----------------------");
        Collections.sort(listaLibros);
        listaLibros.forEach(System.out::println);

        // Recorre de nuevo la lista de libros y en cada iteración, ejecuta enviar() o descargar() en función del tipo de libro.
        System.out.println("-----------------EJECUCIÓN DE LOS MÉTODOS ENVIAR() Y DESCARGAR()----------------------");
        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i) instanceof LibroDigital) {
                System.out.println("-------Descargar-------");
                ((LibroDigital) listaLibros.get(i)).descargar();
            } else {
                System.out.println("-------Enviar-------");
                ((LibroPapel) listaLibros.get(i)).enviar(RandomStringUtils.randomAlphabetic(10));
            }
        }

        // Utiliza el método contains(Object) sobre la lista de libros para comprobar si existe un libro o no existe.
        System.out.println("-----------------Utilizando el método contain sobre la lista de libros----------------------");
        System.out.println("Existe");
        System.out.println(listaLibros.contains(new LibroDigital(0, "efghi")));
        System.out.println("No Existe");
        System.out.println(listaLibros.contains(new LibroDigital(0, "efgkhkhkki")));

        // Usando la lista de productos inicial, crea una nueva lista con todos los objetos que Se Envian.
        List<Producto> listaProductosEnvian = new ArrayList<>();
        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i) instanceof SeEnvia) {
                listaProductosEnvian.add(listaProductos.get(i));
            }
        }

        // Recorre la lista de objetos que Se Envian y llama al método de la interfaz.
        System.out.println("-----------------LLamo al método enviar----------------------");
        for (int i = 0; i < listaProductosEnvian.size(); i++) {
                ((SeEnvia) listaProductosEnvian.get(i)).enviar("efgkhkhkki");
        }
        
        
        // Inventa un método abstracto en Libro que tenga comportamientos diferentes en las subclases. Implementa los métodos en las clases hijas.
        System.out.println("-----------------LLamo al método queSoy----------------------");        
        for (int i = 0; i < listaLibros.size(); i++) {
            Libro get = listaLibros.get(i);
            get.queSoy();
        }
    }
}
