package ar.org.centro8.java.curso.entidades.relaciones.herencia;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
@AllArgsConstructor

public class CuentaCorriente extends Cuenta {
    // Atributo CuentaCorriente
    private float montoGiro;

    // Método CuentaCorriente
    public void depositarCheque(float monto){
        saldo += monto;
    }

    /*
     *  
    @Override
    public void extraerEfectivo(float monto, float montoGiro){
        if(saldo < monto && montoGiro) System.out.println("** EXTRACCIÓN FALLIDA** \nFondos insuficientes para realiza esta operación");
        else saldo -= monto;
    }*/



}
