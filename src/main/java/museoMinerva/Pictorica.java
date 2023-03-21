/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoMinerva;

/**
 *
 * @author venganzaalchocolate
 */
public class Pictorica extends Obra {

    public Pictorica(int id) {
        super(id, ObrasPictoricas.nombreAleatorio().getNombre());
    }

    @Override
    public String toString() {
        return """
               %s
               Soy una obra pictorica
               """.formatted(super.toString());
    }

    
    
    
}
