package ar.org.centro8.java.curso.entidades.relaciones.herencia;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString

public class CuentaCorriente extends Cuenta {
    // Atributo CuentaCorriente
    private float montoDescubierto;

    // Constructor
    public CuentaCorriente(float montoDescubierto, int nroCuenta, Cliente cliente, double saldo) {
        super(nroCuenta, cliente, saldo);
        this.montoDescubierto = montoDescubierto;
    }

    // Método CuentaCorriente
    public void depositarCheque(double cheque){
        setSaldo(getSaldo() + cheque);
    }

    // Método sobreescrito de extraerEfectivo para utilizar el montoDescubierto
    @Override
    public void extraerEfectivo(double monto) {
        if (getSaldo() + montoDescubierto < monto) System.out.println("** EXTRACCIÓN FALLIDA ** \nFondos insuficientes para realizar esta operación");
        else setSaldo(getSaldo() - monto);
    }
}
