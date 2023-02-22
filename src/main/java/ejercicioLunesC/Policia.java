/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioLunesC;

/**
 *
 * @author venganzaalchocolate
 */
// clase Policia que hereda de Persona
public class Policia extends Persona {

    int numPlaca;
    int numDelincuentesAtrapados;

    public Policia(int numPlaca, String DNI, String nombre) {
        super(DNI, nombre);
        this.numPlaca = numPlaca;
    }

    public Policia(int numPlaca, String DNI, String nombre, String apellidos, int telefono, String direccion, String email) {
        super(DNI, nombre, apellidos, telefono, direccion, email);
        this.numPlaca = numPlaca;
    }

    // método de clase 
    // es como un juego donde dependiendo de la velocidad se ve si el policia atrapa al ladrón
    // la velocidad de una persona puede variar por múltiples factores
    public String atraparDelincuente(Delincuente delincuente) {
        String tmp = "";
        delincuente.setVelocidad(random.nextInt(20));
        this.setVelocidad(random.nextInt(20));

        tmp += ("""
                           El policia %s esta persiguiendo al delincuente %s
                           El policia hoy corre %s km/hora y el delincuente %s km/hora
                           """.formatted(this.getNombre(), delincuente.getNombre(), this.getVelocidad(), delincuente.getVelocidad()));
        // si el polia atrapa al ladrón cambia el estado a caminando porque ya lo ha conseguido atrapar y se suma 1 al numero de delincuentes atrapados
        if (delincuente.getVelocidad() <= this.getVelocidad()) {
            tmp += "El policia ha atrapado al delincuente";
            this.setEstado(Estado.CAMINANDO);
            delincuente.setEstado(Estado.CAMINANDO);
            numDelincuentesAtrapados++;
            return tmp;
        }
        // si no lo atrapa el estado cambia a persiguiendo y perseguido 
        tmp += "El policia no ha atrapado al delincuente";
        tmp += "\b";
        this.setEstado(Estado.PERSIGUIENDO);
        delincuente.setEstado(Estado.PERSEGUIDO);
        return tmp;
    }

    // método de clase que comprueba si ha encontrado a un delincuente
    public boolean encuentraDelincuente() {
        return random.nextBoolean();
    }

    // sobreescrito
    // toString que llama al metodo String del padre y lo completa con los atributos de clase
    @Override
    public String toString() {
        return """
               POLICIA
               %s
               Número de Placa: %d
               Número de delincuentes atrapados: %d""".formatted(super.toString(), numPlaca, numDelincuentesAtrapados);
    }

    // método sobreescrito de la clase abstracta Persona
    @Override
    public void atuendo() {
        System.out.println("Lleva uniforme de policia");
    }

}
