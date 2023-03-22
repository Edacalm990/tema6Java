/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstraccionesInterfaces;

import java.util.Objects;

/**
 *
 * @author eli
 */
public abstract class Libro extends Producto implements Comparable<Libro>{
    private String isbn;

    public Libro() {
    }

    public Libro(String isbn) {
        this.isbn = isbn;
    }

    public Libro(String isbn, int codigo, double precio, int iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return """
               %s
               Isbn: %s
               """.formatted(super.toString(), isbn);
    }

    @Override
    public final int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.isbn);
        return hash;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
        final Libro other = (Libro) obj;
        return Objects.equals(this.isbn, other.isbn);
    }
    
    @Override
    public int compareTo(Libro o) {
        return this.getIsbn().compareToIgnoreCase(o.getIsbn());
    }
    
    public abstract void queSoy();
}
