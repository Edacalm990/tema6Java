/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio1;

/**
 *
 * @author eli
 */
public class Corredera extends Ventana {

    private Persiana persiana;

    public Corredera() {
    }

    public Corredera(Estado estado) {
        super(estado);
    }

    public Persiana getPersiana() {
        return persiana;
    }

    @Override
    public void abrir() {
        this.abrir();
    }

    @Override
    public void cerrar() {
        this.abrir();
    }



}
