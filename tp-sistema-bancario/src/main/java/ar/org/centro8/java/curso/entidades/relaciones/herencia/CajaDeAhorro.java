package ar.org.centro8.java.curso.entidades.relaciones.herencia;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class CajaDeAhorro extends Cuenta {
    // Atributo CajaDeAhorro
    private double tasaInteres;

    // Constructor
    public CajaDeAhorro(double tasaInteres, int nroCuenta, Cliente cliente, double saldo) {
        super(nroCuenta, cliente, saldo);
        this.tasaInteres = tasaInteres;
    }

    // Método CajaDeAhorro
    public void cobrarInteres(double monto){
        setSaldo(getSaldo() + Math.round(monto * (tasaInteres / 100.0) * 100.0) / 100.0);
    }
}