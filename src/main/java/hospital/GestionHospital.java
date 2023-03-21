/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/**
 *
 * @author venganzaalchocolate
 */
/*
- En el main(), debes crear un hospital, contratar cinco empleados (2 médicos y 3 administrativos) e ingresar a 5 pacientes. 
De entre los médicos y los pacientes del hospital, elige un médico y un paciente, aleatoriamente, 
para que ese medico trate a ese paciente con Pancetamol :). 
Ejecuta el método abstracto de todos los empleados. 
Renueva el NIF a un paciente cualquiera.
 */
public class GestionHospital {

    public static Random random = new Random();

    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        // llamo al método creaPersona para crear; Medicos, Administrativos y pacientes;
        creaPersona(2, hospital, Tipo.MEDICOS);
        creaPersona(3, hospital, Tipo.ADMINISTRATIVOS);
        creaPersona(5, hospital, Tipo.PACIENTES);

        // Muestro el toString del Hospital para comprar que se ha creado correctamente
        System.out.println(hospital.toString());
        // trato a un paciente aleatorio y un medico aleatorio
        tratarPaciente(hospital);
        // calculo del irpf de todos los trabajadores
        calcularIRPF(hospital);
        // renuevo el nif de un paciente aleatorio
        renovarNif(hospital.getListaPacientes().get(random.nextInt(hospital.getListaPacientes().size())));
        // EXTRA no has pedido que probemos el método de registrar documento pero yo lo voy ha hacer igualmente para mostrar que funciona
        ((Administrativo)buscarEmpleado(hospital, Tipo.ADMINISTRATIVOS)).registrarDocumento("Documento de prueba");
    }

    public static void renovarNif(Paciente paciente) {
        // llamo al método heredado renovarNif y le paso la fecha actual
        paciente.renovarNif(LocalDate.now());
        // muestro la fecha de caducidad del DNI del paciente para comprobar que se ha cambiado correctamente
        System.out.println("""
                           El paciente %s %s ha renovado su DNI
                           Ahora la fecha de caducidad es %s
                           """.formatted(
                paciente.getNombre(),
                paciente.getApellidos(),
                paciente.getNif().getFechaCaducidad().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
        ));
    }

    public static void calcularIRPF(Hospital hospital) {
        // llamo al método abstracto calcularIRPF de todos los empleados
        hospital.getListaEmpleados().forEach(e -> System.out.println("""
                                                                   El empleado %s %s tiene una retencion de IRPF de %s €
                                                                   """.formatted(
                e.getNombre(), e.getApellidos(), e.calcularIRPF()
        )));
    }

    // método para buscar un paciente de forma aleatoria
    public static Paciente buscarPaciente(Hospital hospital) {
        return hospital.getListaPacientes().get(random.nextInt(hospital.getListaPacientes().size()));
    }

    // método para buscar un empleado según el tipo
    public static Empleado buscarEmpleado(Hospital hospital, Tipo tipo) {
        boolean encontrado = false;
        do {
            Empleado empleadoAux = hospital.getListaEmpleados().get(random.nextInt(hospital.getListaEmpleados().size()));
            if (tipo.equals(tipo.MEDICOS)) {
                if (empleadoAux instanceof Medico) {
                    encontrado = true;
                    // llamo al método de clase tratarPaciente con el paciente y la medicina
                    return empleadoAux;
                }
            }  else if (tipo.equals(tipo.ADMINISTRATIVOS)){
                    if (empleadoAux instanceof Administrativo) {
                        encontrado = true;
                        // llamo al método de clase tratarPaciente con el paciente y la medicina
                        return empleadoAux;
                    }
                }
        } while (!encontrado);
        return null;

    }

    // método para tratar un paciente con un médico aleatorio y un paciente aleatorio
    public static void tratarPaciente(Hospital hospital) {
        String medicina = "Paracetamol";
        ((Medico)buscarEmpleado(hospital, Tipo.MEDICOS)).tratarPaciente(buscarPaciente(hospital), medicina);
    }

    // método para crear Personas dentro del hospital, dpenediendo del tipo los contratará o los ingresará
    public static void creaPersona(int cantidad, Hospital hospital, Tipo tipo) {
        for (int i = 0; i < cantidad; i++) {
            switch (tipo) {
                case PACIENTES:
                    hospital.ingresarPaciente(new Paciente());
                    break;
                case MEDICOS:
                    hospital.contratarEmpleado(new Medico());
                    break;
                case ADMINISTRATIVOS:
                    hospital.contratarEmpleado(new Administrativo());
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }

}
