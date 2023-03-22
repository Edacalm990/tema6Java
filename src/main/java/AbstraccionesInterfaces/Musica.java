/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstraccionesInterfaces;

/**
 *
 * @author eli
 */
public final class Musica extends Producto {
    private String grupo;

    public Musica() {
    }

    public Musica(String grupo) {
        this.grupo = grupo;
    }

    public Musica(String grupo, int codigo, double precio, int iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.grupo = grupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return """
               %s
               Grupo: %s
               """.formatted(super.toString(), grupo);
    }
    
    
}
