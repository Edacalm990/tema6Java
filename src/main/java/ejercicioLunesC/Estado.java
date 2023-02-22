/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ejercicioLunesC;

/**
 *
 * @author venganzaalchocolate
 */
public enum Estado {
    PERSIGUIENDO("Esta persiguiendo"),
    PERSEGUIDO("Esta siendo perseguido"),
    CAMINANDO("Esta caminando tranquilamente"),
    SENTADO("Está sentado tranquilamente");
    
    private Estado(String textoEstado){
        this.textoEstado=textoEstado;
    }
    
    private String textoEstado;

    public String getTextoEstado() {
        return textoEstado;
    }
    
}
