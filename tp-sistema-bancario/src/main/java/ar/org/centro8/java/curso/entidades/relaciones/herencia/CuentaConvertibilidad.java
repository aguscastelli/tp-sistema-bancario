package ar.org.centro8.java.curso.entidades.relaciones.herencia;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class CuentaConvertibilidad extends CuentaCorriente{
    // Atributos CuentaConvertibilidad
    private double saldoEnDolares;

    // Constructor
    public CuentaConvertibilidad(double saldoEnDolares, float montoDescubierto, int nroCuenta, Cliente cliente, double saldo) {
        super(montoDescubierto, nroCuenta, cliente, saldo);
        this.saldoEnDolares = saldoEnDolares;
    }
    
    // Métodos CuentaConvertibilidad
    public void depositarDolares(double monto){
        setSaldoEnDolares(getSaldoEnDolares() + monto);
    }

    public void extraerDolares(double monto){
        if(getSaldoEnDolares() - monto < 0) System.out.println("** EXTRACCIÓN FALLIDA** \nFondos de dólares insuficientes para realiza esta operación");
        else setSaldoEnDolares(getSaldoEnDolares() - monto);
    }

    // Convertir dólares a pesos 
    public void convertirPesosADolares(double operacionPesos, double tipoDeCambio){
        if (getSaldo() >= operacionPesos){
            double operacionDolares = operacionPesos / tipoDeCambio;
            setSaldo(getSaldo() - operacionPesos);
            setSaldoEnDolares(getSaldoEnDolares() + operacionDolares);
        } else System.out.println("** OPERACION FALLIDA** \\n" + //
                        "Fondos insuficientes para realiza esta operación");
    }

    // Convertir pesos a dólares
    public void convertirDolaresAPesos(double operacionDolares, double tipoDeCambio){
        if (getSaldoEnDolares() >= operacionDolares){
            double operacionPesos = operacionDolares * tipoDeCambio;
            setSaldo(getSaldo() + operacionPesos);
            setSaldoEnDolares(getSaldoEnDolares() - operacionDolares);
        } else System.out.println("** OPERACION FALLIDA** \\n" + //
                        "Fondos insuficientes para realiza esta operación");
    }
}