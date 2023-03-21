/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoMinerva;

/**
 *
 * @author eli
 */
public final class Humedad extends Sensor {

    private double MAX_HUM;
    private double MIN_HUM;

    public Humedad(double MAX, double MIN, int id) {
        super(id);
        this.MAX_HUM = MAX;
        this.MIN_HUM = MIN;
    }

    public double getMAX_HUM() {
        return MAX_HUM;
    }

    public double getMIN_HUM() {
        return MIN_HUM;
    }

    @Override
    public void alarma(double temperatura) {
        if (temperatura >= MAX_HUM || temperatura <= MIN_HUM) {
            System.out.println("La alarma de humedad ha saltado");
        }
    }

}
