/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioLunesB;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author eli
 */
/*
b) Usando JOption, solicita al usuario que introduzca una frase cualquiera, guardando la frase en un objeto String. 
Muestra la frase por consola, así como su tamaño. Crea un método que devuelva el índice, dentro del String, 
de la primera ocurrencia del char que se pase como parámetro. Crea otro método para devolver, en un array, 
las posiciones dentro del String donde se encuentre el char que se pasa como parámetro. 
Recorre los elementos del String, imprimiendo su valor unicode e indicando si es una letra mayúscula 
o minúscula o un dígito (usa la clase envolvente Character). Elimina todos los espacios en blanco que haya en la cadena. 
Imprime la nueva cadena y su tamaño.
 */
public class MainB {

    public static void main(String[] args) {
        // se solicita una frase
        String frase = JOptionPane.showInputDialog("Dame una frase");
        // char de ejemplo para mostrar los métodos de búsqueda, se podría sustituir por un JOption
        char charEjemplo = 'a';

        // muestro la frase por consola y su tamaño
        System.out.println("""
                           La frase con espacios: "%s"  contiene %d carcateres
                           """.formatted(frase, frase.length()));

        // Extra: metodo que muestra el resultado de llamar al método buscarPrimeraOcurrencia
        mostrarPrimeraOcurrencia(frase, charEjemplo);
         // Extra: metodo que muestra el resultado de llamar al método buscarTodasOcurrencias
        mostrarTodasOcurrencias(frase, charEjemplo);
        // metodo que Recorre los elementos del String, imprimiendo su valor unicode e indicando si es una letra mayúscula 
        // o minúscula, un dígito (uso la clase envolvente Character) u otro tipo (esto último es un extra pero así lo abarco todo)
        // Elimina todos los espacios en blanco que haya en la cadena. 
        //Imprime la nueva cadena y su tamaño.
        valoresUnicode(frase);

    }

    public static void mostrarPrimeraOcurrencia(String frase, char charEjemplo) {
        // llamo al método que me devuelve la primera ocurrencia del char de ejemplo
        int primeraOcurrencia = buscarPrimeraOcurrencia(frase, charEjemplo);
        // muestro el resultado
        System.out.println("""
                           La primera ocurrencia del char "%s" es: %s
                           """.formatted(
                charEjemplo, (primeraOcurrencia >= 0) ? primeraOcurrencia : "No hay coincidencia"
        ));
    }

    public static void mostrarTodasOcurrencias(String frase, char charEjemplo) {
        // llamo al método que me devuelve un array con todas las ocurrencias del char de ejemplo
        Object[] posiciones = buscarTodasOcurrencias(frase, charEjemplo);
        String posicionesString = """
                                La letra "%s" se encuentra en las siguientes posiciones
                                """.formatted(charEjemplo);
        if (posiciones.length == 0) {
            posicionesString += "No hay posiciones";
        } else {
            for (Object posicion : posiciones) {
                posicionesString += " Posicion: " + posicion;
            }
        }
        // muestro el resultado
        System.out.println(posicionesString);
    }

    // método que busca la posicion de la primera ocurrencia del char que se pasa por parámetro
    public static int buscarPrimeraOcurrencia(String frase, char letra) {
        return frase.indexOf(letra);
    }

     // método que busca todas las posiciones  del char que se pasa por parámetro
    // el ejercicio decia un array pero no de que tipo así que he hecho un array de object 
    public static Object[] buscarTodasOcurrencias(String frase, char letra) {
        char[] fraseArray = frase.toCharArray();
        ArrayList<Integer> resultado = new ArrayList<>();
        for (int i = 0; i < fraseArray.length; i++) {
            if (fraseArray[i] == letra) {
                resultado.add(i);
            }

        }
        return resultado.toArray();
    }

    /* Recorre los elementos del String, imprimiendo su valor unicode e indicando si es una letra mayúscula 
o minúscula o un dígito (usa la clase envolvente Character). Elimina todos los espacios en blanco que haya en la cadena. 
Imprime la nueva cadena y su tamaño. */
    public static void valoresUnicode(String frase) {
        String fraseSinEspacios = frase.replaceAll("\\s", "");
        char[] fraseChars = fraseSinEspacios.toCharArray();
        String tmp = """
                     La frase sin espacios: "%s"  contiene %d carcateres y tienen los siguientes valores                     
                     """.formatted(fraseSinEspacios, fraseSinEspacios.length());

        for (int i = 0; i < fraseChars.length; i++) {
            int c = fraseChars[i];
            tmp += """
                 Valor unicode: %s equivale a %s
                 """.formatted(c,
                         // con la clase envolvente Character compruebo que tipo de carcater es
                    (Character.isDigit(c)) ? "un digito"
                    : (Character.isLowerCase(c)) ? "una letra minúscula"
                    : (Character.isUpperCase(c)) ? "una letra mayúscula" : "otro tipo de símbolo"
            );

        }
        System.out.println(tmp);
    }

}
