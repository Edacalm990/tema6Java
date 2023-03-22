/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoMinerva;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author venganzaalchocolate
 */
public class Museo {

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
    
    public void buscarEmpleadoContain(String nif){
        System.out.println(this.listaEmpleados.contains(new C_Pintura(nif)));
    
    }

    // método que añade una sala al museo
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
    
    // método que devuelve una coleccion única de obras
    public Set<Obra> listaObrasMuseo(){
        Set<Obra> aux= new TreeSet<>();
        for (int i = 0; i < listaSalas.size(); i++) {
            aux.addAll(listaSalas.get(i).getListaObras());
        }
        return aux;
    }

    // método que añade una obra a una sala
    public void addObra(int codigoSala, Obra obra) {
        Sala aux = buscarSala(codigoSala);
        if (aux != null) {
            aux.addObra(obra);
        }
    }

    // método privado que busca una sala
    private Sala buscarSala(int codigoSala) {
        for (int i = 0; i < listaSalas.size(); i++) {
            Sala get = listaSalas.get(i);
            if (get.getCodSala() == codigoSala) {
                return get;
            }
        }
        return null;
    }

    // método que elimina una sala
    public void quitarSala(int codigoSala) {
        listaSalas.remove(buscarSala(codigoSala));
    }

    // método que contrata un empleado
    public void contratar(Empleado empleado) {
        this.listaEmpleados.add(empleado);
    }

    // método que despide a un empleado por nif
    public boolean despedir(String nif) {
        return listaEmpleados.remove(buscarEmpleado(nif));
    }

    // método privado que busca un empleado
    private Empleado buscarEmpleado(String nif) {
        for (int i = 0; i < listaEmpleados.size(); i++) {
            Empleado get = listaEmpleados.get(i);
            if (get.getNif().equalsIgnoreCase(nif)) {
                return get;
            }
        }
        return null;
    }

    // añadir salario a un empleado
    public void addSalario(double salario, String nif) {
        Empleado aux = buscarEmpleado(nif);

        if (aux != null) {
            aux.setSalario(aux.getSalario() + salario);
        }
    }

    // quitar el salario
    public void quitarSalario(double salario, String nif) {
        Empleado aux = buscarEmpleado(nif);
        if (aux != null) {
            aux.setSalario(aux.getSalario() - salario);
        }
    }
    
    // método privado para buscar una obra
    private Obra buscarObra(int codObra){
        Iterator<Obra> iterador = listaObrasMuseo().iterator();
        while(iterador.hasNext()){ // No existe orden 
            Obra o = iterador.next();
            if(o.getId()==codObra){
            return o;
            }
        }
        return null;
    }
    
    // método publico que llama al método restaurarObra de los conservadores
    public void restaurarObra(String nif, int codObra){
        
        Obra obra = buscarObra(codObra);
        Empleado aux= buscarEmpleado(nif);
        
        if(obra instanceof Pictorica && aux instanceof C_Pintura){
            ((C_Pintura)aux).restaurarObra(obra);
        } else if(obra instanceof Escultorica && aux instanceof C_Escultura){
            ((C_Escultura)aux).restaurarObra(obra);
        }
        
    }
    
    public void activarSensores(int codSala, int sensor, int valor){
        buscarSala(codSala).saltarAlarma(sensor, valor);
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
