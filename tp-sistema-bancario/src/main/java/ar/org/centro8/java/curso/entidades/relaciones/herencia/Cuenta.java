package ar.org.centro8.java.curso.entidades.relaciones.herencia;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor

public abstract class Cuenta {

    // Atributos:
    private int nroCuenta;
    private Cliente cliente;
    private double saldo;

    // Métodos:
    public void depositarEfectivo(double monto){
        setSaldo(getSaldo() + monto);
    }

    public void extraerEfectivo(double monto) {
    if (getSaldo() - monto < 0) System.out.println("** EXTRACCIÓN FALLIDA ** \nFondos insuficientes para realizar esta operación");
    else setSaldo(getSaldo() - monto);
    }
}
