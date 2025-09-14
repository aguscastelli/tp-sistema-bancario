package ar.org.centro8.java.curso.entidades.relaciones.herencia;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
@AllArgsConstructor

public class CajaDeAhorro extends Cuenta {
    // Atributo CajaDeAhorro
    private float tasaInteres;

    // Método CajaDeAhorro
    public void cobrarInteres(float monto){
        saldo += monto * tasaInteres;
    }
}
