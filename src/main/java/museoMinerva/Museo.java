/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoMinerva;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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
        listaSalas=new ArrayList<>();
        listaEmpleados= new ArrayList<>();
        addSala(10);
    }

    private void addSala(int cantidad) {
        int contador = 0;
        for (int i = 0; i < cantidad; i++) {
            if (random.nextBoolean()) {
                listaSalas.add(new Fija(contador++));
            } else {
                listaSalas.add(new Temporal(contador++));
            }
        }
    }

    public void contratar(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

    public boolean despedir(String nif) {
        return listaEmpleados.remove(nif);
    }

    private Empleado buscarEmpleado(String nif) {
        int posicion = listaEmpleados.lastIndexOf(nif);
        System.out.println(posicion);
        if (posicion != -1) {
            return listaEmpleados.get(posicion);
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

    @Override
    public String toString() {
        String salas = """
                     Lista de Salas
                     """;
        String empleados = """
                         Lista de Empleados
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
