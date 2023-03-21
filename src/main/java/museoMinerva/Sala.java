/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoMinerva;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author venganzaalchocolate
 */
public abstract class Sala {
    private static Random random = new Random();
    private int codSala;
    List<Obra> listaObras;

    public Sala(int codSala) {
        this.codSala = codSala;
        listaObras= new ArrayList<>();
        addObras(random.nextInt(1, 10));
    }

    private void addObras(int cantidad) {
        int contador = 0;
        
        for (int i = 0; i < cantidad; i++) {
            if (random.nextBoolean()) {
                listaObras.add(new Pictorica(contador++));
            } else {
                listaObras.add(new Escultorica(contador++));
            }
        }
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
