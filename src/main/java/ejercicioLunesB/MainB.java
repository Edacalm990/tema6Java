/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioLunesB;

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
        String frase = JOptionPane.showInputDialog("Dame una frase");
        mostrarFrase(frase);
        
        char[] posicion=posicionChar(frase, 'a');
        
    }
    
    
    public static char [] posicionChar(String frase, char letra){
        char[] fraseSinEspacios= frase.replaceAll("\\s","").toCharArray();;
        String resultado="";
        for (int i = 0; i < fraseSinEspacios.length; i++) {
            if (fraseSinEspacios[i]==letra) {
            resultado+=String.valueOf(i);
            }
            
        }
        return resultado.toCharArray();
    }
    
    public static void mostrarFrase(String frase){
    System.out.println("""
                           %s 
                           Tiene %s letras
                           """.formatted(frase, frase.replaceAll("\\s","").length()));
    }
    
    public static void mostrarPosiciones (char [] posiciones, char letra, String frase){
    String tmp="""
               La letra %s en la frase %s se encuentra en las posiciones
               """.formatted(letra, frase);
        for (char posicion : posiciones) {
            tmp+="""
                 \t%s""".formatted(posicion);
        }
    }
}
