/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author eli
 */
public class Nif {
    private static Random random =new Random();
    private long numero;
    private char letra;
    private LocalDate fechaCaducidad;

    public Nif() {
        this.numero = random.nextInt(99999999);
        this.letra = calcularLetra();
        this.fechaCaducidad = LocalDate.now();
    }

    public long getNumero() {
        return numero;
    }

    public char getLetra() {
        return letra;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + (int) (this.numero ^ (this.numero >>> 32));
        hash = 61 * hash + this.letra;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nif other = (Nif) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.letra == other.letra;
    }

    private char calcularLetra() {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        long resto;
        resto = this.numero % 23;
        return letras[(int)resto];
    }
    
    final public void renovarDni( LocalDate fechaSolicitudRenovacion){
        this.fechaCaducidad=fechaSolicitudRenovacion.plusYears(10);
    }

    @Override
    public String toString() {
        return """
               %s-%s""".formatted(numero, letra);
    }
    
    
}
