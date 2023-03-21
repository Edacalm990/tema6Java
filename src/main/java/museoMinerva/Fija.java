/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoMinerva;

/**
 *
 * @author venganzaalchocolate
 */
public final class Fija extends Sala {
    private boolean estado;
    
    public Fija(int codSala) {
        super(codSala);
    }

    public boolean isEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return """
               
               Tipo Fija
               %s 
               Estado: %s 
               """.formatted(super.toString(),estado);
    }
    
    
}
