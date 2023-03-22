/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstraccionesInterfaces;

/**
 *
 * @author eli
 */
public final class Pantalon extends Ropa {
    private int talla;

    public Pantalon() {
    }

    public Pantalon(int talla, String marca) {
        super(marca);
        this.talla = talla;
    }

    public Pantalon(int talla, String marca, int codigo, double precio, int iva, String descripcion) {
        super(marca, codigo, precio, iva, descripcion);
        this.talla = talla;
    }

    public Pantalon(int talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return """
               %s
               Talla: %s
               """.formatted(super.toString(), talla);
    }
    
    
}
