/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.repasoAntesExamenMarzo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author eli
 */
/*
codigo
origen
destino
duracion
lista de Pasajeros
*/
public class Vuelo implements Comparable<Vuelo>{
    private static Random random= new Random();
    
    private int codigo;
    private Ciudades origen;
    private Ciudades destino;
    private double duracion;
    private List<Pasajero> listaPasajeros;

    public Vuelo(int codigo, Ciudades origen, Ciudades destino, double duracion, List<Pasajero> listaPasajeros) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.listaPasajeros = listaPasajeros;
    }

    public Vuelo() {
        this.codigo = random.nextInt(99999);
        this.origen = Ciudades.getAleatorio();
        this.destino = Ciudades.getAleatorio();
        this.duracion = random.nextDouble(1, 16);
        this.listaPasajeros = listaPasajeros();
    }
   
    

    public int getCodigo() {
        return codigo;
    }

    public Ciudades getOrigen() {
        return origen;
    }

    public Ciudades getDestino() {
        return destino;
    }

    public double getDuracion() {
        return duracion;
    }

    public List<Pasajero> getListaPasajeros() {
        return listaPasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "codigo=" + codigo + ", origen=" + origen + ", destino=" + destino + ", duracion=" + duracion + ", listaPasajeros=" + listaPasajeros + '}';
    }
    
    private List listaPasajeros(){
        List <Pasajero> lista = new ArrayList<>();
        for (int i = 0; i < random.nextInt(5, 20); i++) {
            lista.add(new Pasajero());
        }
    return lista;
    }

    @Override
    public int compareTo(Vuelo o) {
        return this.destino.compareTo(o.destino);
    }
    
}
