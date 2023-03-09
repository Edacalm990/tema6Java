/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio15;

/**
 *
 * @author venganzaalchocolate
 */
public class Diputado extends Legislador{

    private int numeroAsiento;

    public Diputado(int numeroAsiento, String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(provincia, partidoPolitico, nombre, apellidos);
        this.numeroAsiento = numeroAsiento;
    }

    public Diputado(int numeroAsiento, String provincia, String partidoPolitico) {
        super(provincia, partidoPolitico);
        this.numeroAsiento = numeroAsiento;
    }

    public Diputado(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public Diputado() {
        numeroAsiento=random.nextInt(99);
    }

    @Override
    public String toString() {
        return """
               %s
               Nº Asiento: %s
               """.formatted(super.toString(), this.numeroAsiento);
                
    }
    
    
    @Override
    public String getCamara() {
        return "Cámara Baja de las Cortes Generales, diputado";
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }
    
}
