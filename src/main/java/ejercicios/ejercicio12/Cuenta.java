/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio12;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author eli
 */
/*
▪     numeroCuenta : String
▪     saldo : double
▪     cliente : atributo de la clase Persona (que tiene nombre y apellidos, y NIF).
Constructor parametrizado que recibe un cliente. El saldo inicial será 0 y el número de cuenta se asignará automáticamente en función de algún algoritmo o criterio que tú desarrolles. Es evidente que no puede haber números de cuenta duplicados. Ten en cuenta que un número de cuenta tiene 20 dígitos.
▪     Getters y setters.
▪     void actualizarSaldo(). No se implementa, dependerá del tipo de cuenta.
▪	void  retirar(double). No  se implementa, dependerá del tipo de cuenta.

*/
public abstract class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private Persona cliente;

    public Cuenta(Persona cliente) {
        this.cliente = cliente;
        this.saldo=0;
        this.numeroCuenta= RandomStringUtils.randomAlphanumeric(20);
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }
    
    
    public abstract void actualizarSaldo();
    public abstract void retirar();
    
    
}
