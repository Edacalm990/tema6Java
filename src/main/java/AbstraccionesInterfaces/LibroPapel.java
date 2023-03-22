/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstraccionesInterfaces;

/**
 *
 * @author eli
 */
public class LibroPapel extends Libro implements SeEnvia{

    private int numPaginas;

    public LibroPapel() {
    }

    public LibroPapel(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public LibroPapel(int numPaginas, String isbn) {
        super(isbn);
        this.numPaginas = numPaginas;
    }

    public LibroPapel(int numPaginas, String isbn, int codigo, double precio, int iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return """
               %s
               Número de Páginas: %s
               """.formatted(super.toString(), this.numPaginas);
    }


    @Override
    public void enviar(String direccion) {
        System.out.println("""
                           %s
                           Tipo: %s
                           Direccion: %s
                           """.formatted(super.toString(), "libro", direccion));
    }

    @Override
    public void queSoy() {
        System.out.println("Soy un libro de Papel");
    }

    
    
    
    
}
