/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstraccionesInterfaces;

/**
 *
 * @author eli
 */
public final class LibroDigital extends Libro implements SeDescarga{
    private int numKBytes;

    public LibroDigital(int numKBytes) {
        this.numKBytes = numKBytes;
    }

    public LibroDigital(int numKBytes, String isbn) {
        super(isbn);
        this.numKBytes = numKBytes;
    }

    public LibroDigital(int numKBytes, String isbn, int codigo, double precio, int iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numKBytes = numKBytes;
    }

    public LibroDigital() {
    }

    public int getNumKBytes() {
        return numKBytes;
    }

    public void setNumKBytes(int numKBytes) {
        this.numKBytes = numKBytes;
    }

    @Override
    public String toString() {
        return """
               %s
               Tamaño: %s
               """.formatted(super.toString(), this.numKBytes);
    }

    @Override
    public void descargar() {
        System.out.println("""
                           http://tunombre.daw/%s
                           """.formatted(this.hashCode()));
    }

    @Override
    public void queSoy() {
        System.out.println("Soy un libro Digital");
    }

   
    
}
