/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio1;

/**
 *
 * @author eli
 */
public class Persiana {
    private EstadoPersiana estado;

    public Persiana() {
        this.estado=EstadoPersiana.ARRIBA;
    }

    public EstadoPersiana getEstado() {
        return estado;
    }
    
    public void bajarPersiana () {
    this.estado=estado.ABAJO;
    }
    
    public void abrirPersiana() {
    this.estado = estado.ARRIBA;
    }
    
}
