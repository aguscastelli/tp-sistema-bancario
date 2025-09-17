package ar.org.centro8.java.curso.entidades.relaciones.herencia;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class ClienteIndividual extends Cliente {
    // Atributos ClienteIndividual
    private String nombre;
    private String apellido;
    private String dni;

    // Constructor
    public ClienteIndividual(String apellido, String dni, String nombre, int nroCliente) {
        super(nroCliente);
        this.apellido = apellido;
        this.dni = dni;
        this.nombre = nombre;
    }
}
