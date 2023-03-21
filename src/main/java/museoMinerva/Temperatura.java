/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoMinerva;

/**
 *
 * @author eli
 */
public final class Temperatura extends Sensor {

    private double MAX_TEMP;
    private double MIN_TEMP;

    public Temperatura(double MAX, double MIN, int id) {
        super(id);
        this.MAX_TEMP = MAX;
        this.MIN_TEMP = MIN;
    }

    public double getMAX_TEMP() {
        return MAX_TEMP;
    }

    public double getMIN_TEMP() {
        return MIN_TEMP;
    }

    @Override
    public void alarma(double temperatura) {
        if (temperatura >= MAX_TEMP || temperatura <= MIN_TEMP) {
            System.out.println("La alarma de temperatura ha saltado");
        }
    }

}
