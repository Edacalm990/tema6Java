/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio1;

/**
 *
 * @author eli
 */
public class Ventana {
    
    private Estado estado;

    public Ventana() {
    }

    public Ventana( Estado estado) {
        this.estado = estado;
    }


    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    
    public void abrirVentana () {
    this.estado=estado.ABIERTA;
    }
    
    public void cerrarVentana () {
    this.estado=estado.CERRADA;
    }
}
