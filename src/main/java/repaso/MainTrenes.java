/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author venganzaalchocolate
 */
/*
MainTrenes
En una matriz de NxM casillas, las filas representan los diferentes trenes que tiene una compañía de transportes 
y las columnas los distintos vagones de un tren. Cada casilla almacena un valor numérico, que es el número de 
pasajeros de cada vagón. La primera columna representa el ID del tren y si el valor de la casilla del vagón es cero, 
es porque no existen más vagones en ese tren. Implementa un programa para que dada una matriz, 
se genere una estructura Map con la información solicitada en clase. El map contiene como keys los valores ID de los trenes 
y como values los objetos tipo Tren, que incluyen como atributos (ID tren, nº vagones, nº pasajeros totales que puede llevar el tren).

 */
public class MainTrenes {

    public static Scanner teclado = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        // solicito la cantidad de trenes (para que no sea todo aleatorio)
        int size = pedirNumero();
        // creo la matriz y la relleno con numeros
        int[][] matriz = rellenarMatriz(size);
        // imprimo la matriz a modo de comprobación

        imprimirMatriz(matriz);
        Map mapTrenes = crearMapDeTrenes(matriz);
        System.out.println(imprimirMapTrenes(mapTrenes));
    }

    // creo un string con la key y el valor
    // el valor al ser un tren llamo al método toString() del tren
    public static String imprimirMapTrenes(Map<Integer, Tren> listaTrenes) {
        String tmp = "LISTA DE TRENES";
        for (Map.Entry<Integer, Tren> entrada : listaTrenes.entrySet()) {
            Integer key = entrada.getKey();
            Tren value = entrada.getValue();
            tmp += """
                 
                Tren con id: %d
                %s
                 """.formatted(key, value.toString());
        }
        return tmp;
    }

    // creo el map a partir de la matriz creada anteriormente
    public static Map crearMapDeTrenes(int[][] matriz) {
        // creo un map ordenado (aun que podía haber sido un HashMap)
        // e elejido un Treemap para tenerlo más ordenado
        SortedMap<Integer, Tren> listaTrenes = new TreeMap<Integer, Tren>();
        // recorro la matriz
        for (int i = 0; i < matriz.length; i++) {
            // en cada fila que representa un tren pongo el contadorVagones a 0 y el numPasajero a 0
            int contadorVagones = 0;
            int numPasajeros = 0;
            for (int j = 1; j < matriz[i].length; j++) {
                if (matriz[i][j] > 0) {
                    // cuanto el número de vagones donde hay personas
                    contadorVagones++;
                    // sumo las personas de todos los vagones
                    numPasajeros += matriz[i][j];
                }
            }

            // añado al map el id que corresponde con el primer número
            // y como valor creo un tren con el nº de vagones y 
            // el valor maxPasajeros este valor como mínimo debe tener los pasajeros que hay actualmente
            listaTrenes.put(matriz[i][0], new Tren(
                    matriz[i][0],
                    contadorVagones,
                    random.nextInt(numPasajeros, random.nextInt(numPasajeros+1, 999))));

        }
        return listaTrenes;
    }

    public static int[][] rellenarMatriz(int size) {
        // creo una matriz con la cantidad de trenes y las columnas con un valos aleatorio de 2 a 10
        // 2 porque mínimo tiene que haber un tres y un vagón
        int[][] matriz = new int[size][random.nextInt(2, 10)];
        ArrayList<Integer> listaId = new ArrayList<>();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < random.nextInt(2, matriz[i].length + 1); j++) {
                // introduzco un número aleatorio, como id y como nº de pasajeros
                int numRandom = random.nextInt(1,100);
                // compruebo que el id no existe, sino al crear el map sobreescribiria datos ya que no puede haber 2 keys iguales
                if (j == 0 && listaId.contains(numRandom)) {
                    j--;
                } else if (j == 0 && !listaId.contains(numRandom)) {
                    matriz[i][j] = numRandom;
                    listaId.add(numRandom);
                } else {
                    matriz[i][j] = numRandom;
                }
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz NxM");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    // el mínimo lo e establecido en 2 porque si, así podemos visualizar más trenes
    public static int pedirNumero() {

        int numero = 0;
        do {
            System.out.println("Cuantos trenes tiene la compañia?");
            try {
                numero = teclado.nextInt();
                if (numero < 2) {
                    System.out.println("Debe ser un número mayor o igual que 2");
                }
            } catch (Exception e) {
                System.out.println("Debe ser un número a partir de 2");
                teclado.nextLine();
            }
        } while (numero < 2);
        return numero;
    }

}
