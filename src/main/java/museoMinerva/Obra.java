/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoMinerva;

/**
 *
 * @author venganzaalchocolate
 */
public abstract class Obra implements Comparable<Obra>{
    private int id;
    private String autor;
    private String nombre;

    public Obra(int id, String nombre) {
        this.id = id;
        this.autor=Nombres.nombreAleatorio().toString();
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public int getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Obra other = (Obra) obj;
        return this.id == other.id;
    }

    public String toString() {
        return """
               Nombre: %s
               Autor: %s
               Codigo: %s""".formatted(nombre, autor, id);
    }
    
   @Override
    public int compareTo(Obra o) {
        return Integer.compare(((Obra)this).id, ((Obra)o).id);
    }
}
