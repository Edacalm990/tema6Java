/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author eli
 */
/*
Matriz de aleatorios
Implementa un programa que genere matrices de NxN, rellenando la matriz en cada posición de forma aleatoria, 
con números que no se pueden repetir, entre 1 y N^2 .
 */
public class MatrizAleatorios {

    public static Scanner teclado = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        final int ELEVADO=2;
        int numero = pedirNumero();
        System.out.println("Matriz con números aleatorios método de extracción");
        int[][] matrizAleatorios = aleatorios(numero, ELEVADO);
        imprimirMatriz(matrizAleatorios);
        
        System.out.println("Matriz con números aleatorios método de comprobación");
        int[][]matrizAleatoriosDos = aleatoriosDos(numero, ELEVADO);
        imprimirMatriz(matrizAleatoriosDos);
    }

     // método para crear y rellenar una matriz de NxN con numeros aleatorios de N^2
    // comprobando que no se repita
    public static int [][] aleatoriosDos(int numero, int elevado) {
        int numeroElevado = (int) Math.pow(numero, elevado);
        // ArrayList que ocntendrá los números que contienen la matriz
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        // matriz
        int[][] listaAleatorios = new int[numero][numero];

        // recorro la matriz
        for (int i = 0; i < listaAleatorios.length; i++) {
            for (int j = 0; j < listaAleatorios[i].length; j++) {
                // creo un numero aleatorio de 1 hasta n^n
                int numAleatorio = random.nextInt(1, numeroElevado + 1);
                // si el número no está en listaNumeros me lo añades a listaAleatorios y lo pones en ListaNumeros
                if (!listaNumeros.contains(numAleatorio)) {
                    listaAleatorios[i][j] = numAleatorio;
                    listaNumeros.add(numAleatorio);
                } else {
                    // sino vuelves a la misma posicion y se vuelve a repetir la operación
                    j--;
                }
            }
        }
        return listaAleatorios;
    }

    // método para crear y rellenar una matriz de NxN con numeros aleatorios de N^2
    public static int[][] aleatorios(int numero, int elevado) {
        // creo un arrayList con numeros consecutivos hasta llegar a n^2
        int numeroElevado = (int) Math.pow(numero, elevado);
        ArrayList<Integer> listaNumeros = new ArrayList<>(numeroElevado);
        for (int i = 1; i <= numeroElevado; i++) {
            listaNumeros.add(i);
        }

        // creo una matriz de NxN vacia
        int[][] listaAleatorios = new int[numero][numero];

        for (int i = 0; i < listaAleatorios.length; i++) {
            for (int j = 0; j < listaAleatorios[i].length; j++) {
                // busco una posicion aleatoria dentro de listaNumeros
                // pongo el numero que se encuentra en esa posicion en listaAleatorios
                // elimino esa posicion, así me da igual que la posicion se repita, siempre tendrá un número diferente.
                int posicion = random.nextInt(0, listaNumeros.size());
                listaAleatorios[i][j] = listaNumeros.get(posicion);
                listaNumeros.remove(posicion);
            }

        }

        return listaAleatorios;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int pedirNumero() {

        int numero = 0;
        do {
            System.out.println("De que tamaño quieres la matriz?");
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
