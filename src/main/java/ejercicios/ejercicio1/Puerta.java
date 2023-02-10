/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio1;

/**
 *
 * @author eli
 */
public class Puerta {
    private Estado estado;

    public Puerta() {
        this.estado=Estado.CERRADA;
    }
        
    public void abrirPuerta () {
    this.estado=estado.ABIERTA;
    }
    
    public void cerrarPuerta () {
    this.estado=estado.CERRADA;
    }

    public Estado getEstado() {
        return estado;
    }
}
