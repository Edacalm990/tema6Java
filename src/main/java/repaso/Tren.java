/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

import java.util.Random;

/**
 *
 * @author venganzaalchocolate
 */
//tipo Tren, que incluyen como atributos (ID tren, nº vagones, nº pasajeros totales que puede llevar el tren).
public class Tren {
    
    private int id;
    private int vagones;
    private int numPasajerosTotales;

    public Tren(int id, int vagones, int numPasajeros) {
        this.id=id;
        this.vagones=vagones;
        this.numPasajerosTotales=numPasajeros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVagones() {
        return vagones;
    }

    public void setVagones(int vagones) {
        this.vagones = vagones;
    }

    public int getNumPasajerosTotales() {
        return numPasajerosTotales;
    }

    public void setNumPasajerosTotales(int numPasajerosTotales) {
        this.numPasajerosTotales = numPasajerosTotales;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tren other = (Tren) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return 
                """
                \t Nº Vagones: %d
                \t Nº max. de Pasajeros: %d
                """.formatted(vagones, numPasajerosTotales);
    }
    
    
    
}
