package ar.org.centro8.java.curso.entidades.relaciones.herencia;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class ClienteEmpresa extends Cliente {
        // Atributos ClienteEmpresa
    private String nombreFantasia;
    private String cuit;

    public ClienteEmpresa(String cuit, String nombreFantasia, int nroCliente) {
        super(nroCliente);
        this.cuit = cuit;
        this.nombreFantasia = nombreFantasia;
    }
}
