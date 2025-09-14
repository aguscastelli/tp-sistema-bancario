package ar.org.centro8.java.curso.entidades.relaciones.herencia;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor

public abstract class Cuenta {

    // Atributos:
    private int nroCuenta;
    private Cliente cliente;
    protected  float saldo;


    // Métodos:
    public void depositarEfectivo(float monto){
        saldo += monto;
    }

    public void extraerEfectivo(float monto){
        if(saldo - monto < 0) System.out.println("** EXTRACCIÓN FALLIDA** \nFondos insuficientes para realiza esta operación");
        else saldo -= monto;
    }
}
