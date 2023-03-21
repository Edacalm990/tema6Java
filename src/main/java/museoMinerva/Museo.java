/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoMinerva;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author venganzaalchocolate
 */
public class Museo {

    private static Random random = new Random();
    String nombre;
    String direccion;
    List<Empleado> listaEmpleados;
    List<Sala> listaSalas;

    public Museo() {
        this.nombre = NombresMuseos.nombreMuseosAleatorio().toString();
        this.direccion = RandomStringUtils.randomAlphabetic(20);
        listaSalas = new ArrayList<>();
        listaEmpleados = new ArrayList<>();
    }

    public void addSala(String tipo) {
        boolean condicion = (!tipo.equalsIgnoreCase("fija")) && (!tipo.equalsIgnoreCase("temporal"));
        if (!condicion) {
            if (tipo.equalsIgnoreCase("fija")) {
                listaSalas.add(new Fija(listaSalas.size()));
            } else {
                listaSalas.add(new Temporal(listaSalas.size()));
            };
        } else {
            System.out.println("No se ha añadido sala, esta solo puede ser 'fija' o 'temporal'");

        }
    }
    
    public Set<Obra> listaObrasMuseo(){
        Set<Obra> aux= new TreeSet<>();
        for (int i = 0; i < listaSalas.size(); i++) {
            aux.addAll(listaSalas.get(i).getListaObras());
        }
        return aux;
    }

    public void addObra(int codigoSala, Obra obra) {
        Sala aux = buscarSala(codigoSala);
        if (aux != null) {
            aux.addObra(obra);
        }
    }

    private Sala buscarSala(int codigoSala) {
        for (int i = 0; i < listaSalas.size(); i++) {
            Sala get = listaSalas.get(i);
            if (get.getCodSala() == codigoSala) {
                return get;
            }
        }
        return null;
    }

    public void quitarSala(int codigoSala) {
        listaSalas.remove(buscarSala(codigoSala));
    }

    public void contratar(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

    public boolean despedir(String nif) {
        return listaEmpleados.remove(buscarEmpleado(nif));
    }

    private Empleado buscarEmpleado(String nif) {
        // el indexof no me funciona y no se porque, he probado a ordenar la lista primero
        //      El comparable lo tengo en empleado con el siguiente codigo:
        /*
    @Override
    public int compareTo(Empleado o) {
        return this.getNif().compareToIgnoreCase(((Empleado)o).getNif());
        También he probrado así
        return this.getNif().compareToIgnoreCase(o.getNif());
    }
         */
        //        Collections.sort(listaEmpleados);
        //        Empleado aux = new Monitor(nif);
        //        listaEmpleados.indexOf(aux)
        //         listaEmpleados.indexOf((Empleado)aux)

        for (int i = 0; i < listaEmpleados.size(); i++) {
            Empleado get = listaEmpleados.get(i);
            if (get.getNif().equalsIgnoreCase(nif)) {
                return get;
            }
        }
        return null;
    }

    public void addSalario(double salario, String nif) {
        Empleado aux = buscarEmpleado(nif);

        if (aux != null) {
            aux.setSalario(aux.getSalario() + salario);
        }
    }

    public void quitarSalario(double salario, String nif) {
        Empleado aux = buscarEmpleado(nif);
        if (aux != null) {
            aux.setSalario(aux.getSalario() - salario);
        }
    }
    
    public void restaurarObra(String nif, int codObra){
        boolean r=listaObrasMuseo().contains(new Pictorica(codObra));
        System.out.println(r);
    }

    @Override
    public String toString() {
        String salas = """
                     ------------------Lista de Salas------------------
                     """;
        String empleados = """
                         ------------------Lista de Empleados------------------
                         """;
        for (int i = 0; i < listaEmpleados.size(); i++) {
            empleados += listaEmpleados.get(i).toString();
        }

        for (int i = 0; i < listaSalas.size(); i++) {
            salas += listaSalas.get(i).toString();
        }

        String tmp = """
                   Museo %s
                   Direccion: %s
                   
                   %s
                   %s
                   """.formatted(nombre, direccion, salas, empleados);
        return tmp;
    }

}
