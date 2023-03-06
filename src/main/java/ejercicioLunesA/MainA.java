/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioLunesA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author eli
 */
/*
        La expresión correcta es \d para un único dígito.  Puede aplicarle el "+" para decir "uno o más dígitos" 
        o puede aplicar el "*" para decir "cero o más dígitos".  También puede agregar "^" al inicio y "$" al final 
        para garantizar que el 100% del texto digitado son dígitos únicamente.  En resumen:

        ^\d+$:  Campo obligatorio.  Admite uno o más dígitos.
        ^\d*$:  Campo opcional.  Admite cero o más dígitos.
 */
// a) Lee un número por teclado usando JOption. Si no es un número, se debe leer de nuevo. 
//Convierte el número leído a un array de char. Implementa un método recursivo para saber si el array de char contiene un número capicúa.
public class MainA {

    public static void main(String[] args) {

        char[] letras = pedirNumero().toCharArray();
        boolean resultado = esCapicua(letras, 0);
        System.out.println((resultado) ? "Es capicua" : "No es capicua");

    }

    // método que pido un número y lo compruebo con una expresión regular
    // se pide un numero con JOption, podía haber usado un try catch pero me apetecía probar las expresiones regulares
    public static String pedirNumero() {
        String texto = "";
        // creo un patrón que debe empezar y terminar con un digito
        //Pattern pattern = Pattern.compile("^\\d+$");
        Pattern pattern = Pattern.compile("[0-9]+");
        // con la clase match comprobaremos si se cumple el patrón
        Matcher mach = null;

        do {
            texto = JOptionPane.showInputDialog("Dame un número");
            // compruebo si se cumple el patrón sino se repite hasta que introduzca un dato correcto
            mach = pattern.matcher(texto);
        } while (!mach.matches());
        return texto;
    }

    // método que comprueba si un array de chars es capicua de forma recursiva
    public static boolean esCapicua(char[] array, int posicion) {
        // si llegamos a la mitad sin un false sabemos que es capicua
        if (posicion >=array.length/2) {
            return true;
        } else if (array[posicion] == array[array.length - posicion - 1]) {
            return esCapicua(array, ++posicion);
        } 
        return false;
    }

}
