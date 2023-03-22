/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoMinerva;

import java.util.Objects;

/**
 *
 * @author venganzaalchocolate
 */
public abstract class Empleado implements Comparable<Empleado> {
    private String nombre;
    private String nif;
    private double salario;

    public Empleado(String nif) {
        this.nombre=Nombres.nombreAleatorio().toString();
        this.nif = nif;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getNif() {
        return nif;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.nif);
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
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
        final Empleado other = (Empleado) obj;
        return Objects.equals(this.nif, other.nif);
    }

    @Override
    public String toString() {
        return """
               Nombre: %s
               Nif: %s
               """.formatted(nombre, nif);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public int compareTo(Empleado o) {
        return this.getNif().compareToIgnoreCase(o.getNif());
    }
    
}
