/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio3;

/**
 *
 * @author eli
 */
public class Jardinero extends Empleado implements Comparable<Persona> {

    private int antiguedad;

    public Jardinero() {
    }

    public Jardinero(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Jardinero(int antiguedad, double salario, String nombre, String nif, int edad) {
        super(salario, nombre, nif, edad);
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.antiguedad;
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
        final Jardinero other = (Jardinero) obj;
        return this.antiguedad == other.antiguedad;
    }

    @Override
    public int compareTo(Persona o) {
        if (o instanceof Jardinero) {
            return Integer.compare(this.antiguedad, ((Jardinero) o).antiguedad);
        } else {
            return -1;
        }

    }

}
