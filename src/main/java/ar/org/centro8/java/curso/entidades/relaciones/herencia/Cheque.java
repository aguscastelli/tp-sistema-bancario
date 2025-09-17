package ar.org.centro8.java.curso.entidades.relaciones.herencia;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor

public class Cheque {
    // Atributos Cheque
    private double montoCheque;
    private String bancoEmisor;
    private String fechaDePago;
}