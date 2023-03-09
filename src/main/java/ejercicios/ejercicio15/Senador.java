/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio15;

/**
 *
 * @author venganzaalchocolate
 */
public class Senador extends Legislador{
    private double complemento;

    public Senador() {
        complemento=random.nextDouble(999);
    }

    public Senador(double complemento, String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(provincia, partidoPolitico, nombre, apellidos);
        this.complemento = complemento;
    }

    public Senador(double complemento, String provincia, String partidoPolitico) {
        super(provincia, partidoPolitico);
        this.complemento = complemento;
    }

    public Senador(double complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return """
               %s
               Complemento=%.2f €
               """.formatted(super.toString(), complemento);
    }
    
    
    @Override
    public String getCamara() {
        return "Cámara de Senadores, senador";
    }

    public double getComplemento() {
        return complemento;
    }

    public void setComplemento(double complemento) {
        this.complemento = complemento;
    }
    
}
