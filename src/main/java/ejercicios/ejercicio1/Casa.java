/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio1;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eli
 */
public class Casa {

    private List<Ventana> ventanas;
    private List<Calefactor> calefactor;
    private Puerta puerta;

    public Casa(ArrayList<Ventana> ventanas, List<Calefactor> calefacator, Puerta puerta) {
        this.ventanas = ventanas;
        this.calefactor = calefacator;
        this.puerta = puerta;
    }

    public Casa() {
        this.ventanas = new ArrayList<Ventana>();
        this.puerta = new Puerta();
    }

    public List<Ventana> getVentanas() {
        return ventanas;
    }

 

    // añadir ventana,calefactor,puerta
    public boolean addVentana(Ventana ventana) {
        if (ventana != null) {
            return ventanas.add(ventana);
        }
        return false;
    }

    public boolean cambiarPuerta(Puerta puerta) {
        if (puerta != null) {
            this.puerta=puerta;
            return true;
        }
        return false;
    }

    public boolean addCalefactor(Calefactor calefactor) {
        if (calefactor != null) {
            this.calefactor.add(calefactor);
            return true;
        }
        return false;
    }

    public boolean abrirVentana(int posicion) {
        if (posicion > 0 && posicion < ventanas.size()) {
            if (this.ventanas.get(posicion) instanceof Abatible) {
                ((Abatible)ventanas.get(posicion)).abrir();
            } else {
                this.ventanas.get(posicion + 1).abrir();
                return true;
            }
        }
        return false;
    }

    public boolean cerrarVentana(int posicion) {
        if (posicion > 0 && posicion < ventanas.size()) {
            this.ventanas.get(posicion + 1).cerrar();
            return true;
        }
        return false;
    }


    public void encenderCalefactor(int temp, int posicion) {
        if (posicion>0 && posicion < this.calefactor.size()){
        this.calefactor.get(posicion).encenderCalefactor();
        this.calefactor.get(posicion).fijarTemperatura(temp);
        }
    }

    public void apagarCalefacator(int posicion) {
        if (posicion>0 && posicion < this.calefactor.size()){
        this.calefactor.get(posicion).apagarCalefactor();
        }
    }

    public void abrirPuerta() {
            this.puerta.abrirPuerta();
        }
    }

