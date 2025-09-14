package ar.org.centro8.java.curso.entidades.relaciones.herencia;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
@AllArgsConstructor

public class CuentaConvertibilidad extends Cuenta{
    // Atributos CuentaConvertibilidad
    private float saldoEnDolares;

    // Métodos CuentaConvertibilidad
    public void depositarDolares(float monto){
        saldoEnDolares += monto;
    }

    public void extraerDolares(float monto){
        if(saldoEnDolares - monto < 0) System.out.println("** EXTRACCIÓN FALLIDA** \nFondos de dólares insuficientes para realiza esta operación");
        else saldoEnDolares -= monto;
    }
    
    public void convertirPesosADolares(float montoPesosAConvertir,float tipoCambio){
        if (montoPesosAConvertir<=saldo){
            float montoDolares = montoPesosAConvertir/ tipoCambio;
            saldo -= montoPesosAConvertir;
            saldoEnDolares+=montoDolares;
        }
    }

    public void convertirDolaresAPesos(float montoDolaresaConvertir,float tipoCambio){
        if (montoDolaresaConvertir<=saldoEnDolares){
            float montoPesos = montoDolaresaConvertir* tipoCambio;
            saldo -= montoDolaresaConvertir;
            saldo+=montoPesos;
        } 
    }
}