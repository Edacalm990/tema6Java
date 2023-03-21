/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museoMinerva;

import java.time.LocalDate;

/**
 *
 * @author venganzaalchocolate
 */
public final class Temporal extends Sala {

    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Temporal(int codSala) {
        super(codSala);
        this.fechaInicio = LocalDate.now();
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return """
               
               Tipo Temporal
               %s
               Fechas: desde %s %s
               """.formatted(super.toString(), fechaInicio, (fechaFin != null) ? "hasta " + fechaFin : "");
    }

}
