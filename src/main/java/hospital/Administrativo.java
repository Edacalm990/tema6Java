/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author venganzaalchocolate
 */
public class Administrativo extends Empleado {

    private Grupo grupo;

    // todos lo atributos son aleatorios por tanto el contructor está vacio e intancia de forma random según cada atributo
    public Administrativo() {
        grupo = Grupo.grupoAleatorio();
    }

    // método de clase que reistra un documento mostrandolo por consola
    public void registrarDocumento(String nombreDoc) {
        System.out.println("""
                           Admistrativo: %s  %s
                           Nombre de Documento: %s
                           Codigo: %s
                           """.formatted(
                super.getNombre(),
                super.getApellidos(),
                nombreDoc,
                nombreDoc.hashCode()
        ));
    }

    // método abstracto heredado para calcular el irpf
    @Override
    public double calcularIRPF() {
        return grupo.getIrpf() * super.getSalario();
    }

    
    @Override
    public String toString() {
        return """
               %s
               Grupo: %s
               
               """.formatted(super.toString(), grupo.toString());
    }

    
}
