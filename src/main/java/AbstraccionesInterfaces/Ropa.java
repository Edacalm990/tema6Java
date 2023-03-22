/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstraccionesInterfaces;

/**
 *
 * @author eli
 */
public abstract class Ropa extends Producto implements SeEnvia {
    private String marca;

    public Ropa(String marca) {
        this.marca = marca;
    }

    public Ropa(String marca, int codigo, double precio, int iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.marca = marca;
    }

    public Ropa() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return """
               %s
               Marca: %s""".formatted(super.toString(), marca);
    }
    
    @Override
    public void enviar(String direccion) {
        System.out.println("""
                           %s
                           Tipo: %s
                           Direccion: %s
                           """.formatted(super.toString(), "Ropa", direccion));
    }
    
}
