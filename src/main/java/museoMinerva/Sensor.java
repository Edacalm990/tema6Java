/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoMinerva;

/**
 *
 * @author eli
 */
public abstract class Sensor {
    
    private int id;

    public Sensor(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public abstract void alarma(double valor);
    
}
