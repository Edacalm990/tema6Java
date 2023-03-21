/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author venganzaalchocolate
 */
public class Hospital {
    private String nombre;
    private String direccion;
    private int numeroCamas;
    private List<Paciente> listaPacientes;
    private List<Empleado>listaEmpleados;

    public Hospital() {
        nombre= NombresHospitales.nombreHospitalAleatorio().toString();
        direccion= RandomStringUtils.randomAlphabetic(20);
        numeroCamas=Integer.parseInt(RandomStringUtils.randomNumeric(3));
        listaPacientes=new ArrayList<>();
        listaEmpleados=new ArrayList<>();
    }

    public List<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
    
    
   public void contratarEmpleado(Empleado empleado){
   listaEmpleados.add(empleado);
   }
    
    public void ingresarPaciente(Paciente paciente){
    listaPacientes.add(paciente);
    }

    @Override
    public String toString() {
        String empleados="";
        String pacientes="";
        
         for (int i = 0; i < listaPacientes.size(); i++) {
            pacientes+=listaPacientes.get(i).toString(); 
            pacientes+=listaPacientes.get(i).nadar();
        }
        for (int i = 0; i < listaEmpleados.size(); i++) {
           empleados+=listaEmpleados.get(i).toString();
           if(listaEmpleados.get(i) instanceof Medico){
           empleados+=((Medico)listaEmpleados.get(i)).nadar();
           }
        }
        String tmp= """
               Nombre:%s
               Direccion: %s
               Nº Camas: %s
               Lista de Pacientes:
               %s
               Lista de Empleados:
               %s
                    """.formatted(nombre, direccion, numeroCamas, pacientes, empleados);
       
        return tmp;
    }
    
    
}
