/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author eli
 */
/*
Números binarios
Implementa una aplicación que genere matrices de NxN con números aleatorios entre 0 y 1. 
Se debe poder imprimir la matriz en consola y debe haber un método que busque dentro de la matriz 
las coordenadas de la primera casilla que encuentre cuyo valor sea cero y tenga un uno en sus esquinas (casillas vecinas de las esquinas).
 */
public class NumBinarios {

    public static Scanner teclado = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {

        // se pide el tamaño de la matriz
        int sizeMatriz=pedirNumero();
        // se llama al método rellanarMatriz para crear y rellenar la matriz
        int [][] matriz = rellenarMatriz(sizeMatriz);
        // se imprime la matriz
        imprimirMatriz(matriz);
        // se comprueba si tiene coordenada y se imprime el resultado
        System.out.println(imprimirCordenada(coordenadas(matriz)));
    }
    
    // se rellena la matriz
    public static int[][] rellenarMatriz(int size){
        int [][] matriz = new int [size][size];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // si es true se añade un 1, sino no hace nada porque la matriz se crea por defecto con 0
                if(random.nextBoolean()){
                matriz[i][j]=1;
                }               
            }
        }
        return matriz;
    }

    // se imprime las coordenadas
    public static String imprimirCordenada(int[] coordenada) {
        if (coordenada[0]==0) {
            // si la coordenada empieza por 0 es que no existe
            return "No existe coincidencia";
        } else {
            return """
                   Coordenada encontrada
                   Fila: %d
                   Columna: %d
                   """.formatted(coordenada[0], coordenada[1]);
        }

    }

    // se comprueba si existe una coordenada en la matriz
    public static int[] coordenadas(int[][] matriz) {

        int[] coordenadas = {0, 0};
        // se empieza por fila 1 columna 1 
        for (int i = 1; i < matriz.length - 1; i++) {
            for (int j = 1; j < matriz[i].length - 1; j++) {
                // si en las esquinas hay un 1 se añade a coordenada
                if (matriz[i - 1][j - 1] == 1
                        && matriz[i - 1][j + 1] == 1
                        && matriz[i + 1][j - 1] == 1
                        && matriz[i + 1][j + 1] == 1) {
                    coordenadas[0] = i;
                    coordenadas[1] = j;
                }
            }
        }
        // sino existe se devuelve 0,0
        return coordenadas;
    }

    // se imprime la matriz, por legibilidad he puesto el número de Fila, así es más fácil encontrar la coordenada en matrices grandes
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Fila "+ i + ": ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    // se pide un número y se controla que esté dentro de los parámetros requeridos en este caso el tamaño mínimo es 3
    public static int pedirNumero() {

        int numero = 0;
        do {
            System.out.println("De que tamaño quieres la matriz?");
            try {
                numero = teclado.nextInt();
                if (numero < 3) {
                    System.out.println("Debe ser un número mayor o igual que 3");
                }
            } catch (Exception e) {
                System.out.println("Debe ser un número a partir de 3");
                teclado.nextLine();
            }
        } while (numero < 3);
        return numero;
    }
}
