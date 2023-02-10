/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio1;

/**
 *
 * @author eli
 */
public class Abatible  extends Ventana{

    public Abatible() {
    }

    public Abatible(Estado estado) {
        super(estado);
    }

    public void abrirVentana(){
        System.out.println("Se abre en forma de abanico");
        this.setEstado(Estado.ABIERTA);
    }
    
    public void cerrarVentana(){
        System.out.println("Se cierra en forma de abanico");
        this.setEstado(Estado.CERRADA);
    }
}
