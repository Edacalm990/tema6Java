/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio1;

/**
 *
 * @author eli
 */
public class Calefactor {

    private int temperatura;
    private EstadoCalefaccion estado;

    public Calefactor() {
    }

    public Calefactor(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }

    //encender,apagar,fijartemp
    public void encenderCalefactor() {
        this.estado = EstadoCalefaccion.ENCENDIDO;
    }

    public void apagarCalefactor() {
        this.estado = EstadoCalefaccion.APAGADO;
    }

    public void fijarTemperatura(int tmp) {
        if (tmp > 0) {
            this.temperatura = tmp;
        } else {
            this.temperatura = 0;
            this.estado = EstadoCalefaccion.APAGADO;
        }
    }
}
