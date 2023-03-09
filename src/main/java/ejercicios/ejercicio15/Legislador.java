/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio15;

import java.util.Random;


/**
 *
 * @author venganzaalchocolate
 */
public abstract class Legislador extends Persona{
    
    private String provincia;
    private String partidoPolitico;

    public Legislador(String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.provincia = provincia;
        this.partidoPolitico = partidoPolitico;
    }

    public Legislador(String provincia, String partidoPolitico) {
        this.provincia = provincia;
        this.partidoPolitico = partidoPolitico;
    }

    public Legislador() {
        provincia= provinciAleatoria();
        partidoPolitico= partidoAleatorio();
                
    }

    private String provinciAleatoria (){
        String [] provincias = {"Málaga", "Huelva", "Sevilla", "Granada"};
        return provincias[random.nextInt(0, provincias.length)];
    }
    
        private String partidoAleatorio (){
        String [] partidos = {"Podemos", "PSOE", "PP", "VOX"};
        return partidos[random.nextInt(0, partidos.length)];
    }
    
    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    @Override
    public String toString() {
        return """
               Nombre: %s
               Apellido: %s
               Provincia: %s
               Partido político: %s""".formatted(this.getNombre(), this.getApellidos(), this.getProvincia(), this.getPartidoPolitico());
    }
    
    public abstract String getCamara();
    
}
