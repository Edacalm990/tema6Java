/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoMinerva;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author venganzaalchocolate
 */
public abstract class Sala {
    private int codSala;
    private Set<Obra> listaObras;
    private Sensor [] sensores;

    public Sala(int codSala) {
        this.codSala = codSala;
        listaObras= new HashSet<>();
        crearSensor();
    }
    
    private void crearSensor(){
        sensores=new Sensor [2];
        sensores[0]= new Temperatura(35.5, 0, codSala*10+1);
        sensores[1]= new Humedad(70, 20, codSala*10+2);
    }

    public void addObra(Obra obra) {
        if (!listaObras.contains(obra)){
        listaObras.add(obra);
        } else {
            System.out.println("Esta obra no se puede añadir porque ya hay una obra con ese id");
        }  
    }

    public Set<Obra> getListaObras() {
        return listaObras;
    }

    public Sensor[] getSensores() {
        return sensores;
    }
    

    public int getCodSala() {
        return codSala;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.codSala;
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
        final Sala other = (Sala) obj;
        return this.codSala == other.codSala;
    }

    @Override
    public String toString() {
        return """
               Codigo de Sala: %s """.formatted(codSala);
    }

}
