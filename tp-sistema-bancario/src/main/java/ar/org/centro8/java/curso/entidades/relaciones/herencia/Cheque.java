package ar.org.centro8.java.curso.entidades.relaciones.herencia;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor

public class Cheque {
    // Atributos Cheque
    private float montoCheque;
    private String bancoEmisor;
    private String fechaDePago;
}
