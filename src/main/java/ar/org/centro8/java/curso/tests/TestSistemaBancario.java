package ar.org.centro8.java.curso.tests;

import ar.org.centro8.java.curso.entidades.relaciones.herencia.Cuenta;
import ar.org.centro8.java.curso.entidades.relaciones.herencia.CuentaConvertibilidad;
import ar.org.centro8.java.curso.entidades.relaciones.herencia.Cliente;
import ar.org.centro8.java.curso.entidades.relaciones.herencia.CajaDeAhorro;
import ar.org.centro8.java.curso.entidades.relaciones.herencia.Cheque;
import ar.org.centro8.java.curso.entidades.relaciones.herencia.ClienteEmpresa;
import ar.org.centro8.java.curso.entidades.relaciones.herencia.ClienteIndividual;
import ar.org.centro8.java.curso.entidades.relaciones.herencia.CuentaCorriente;

public class TestSistemaBancario {
    public static void main(String[] args) {      
        System.out.println("**** CREACION DE OBJETOS DE LAS CLASES: Cliente y Cuenta ****");
        System.out.println("** TEST DE LA CLASE CLIENTE **");
        //////////////////////////////////////////////////////////////////
        // TEST: Creación de objetos de clase ClienteIndividual
        //////////////////////////////////////////////////////////////////
        System.out.println("** Test Clase ClienteInvidual **");
        ClienteIndividual clienteIndividual1 = new ClienteIndividual("Perez", "32141900", "Roberto", 1);
        ClienteIndividual clienteIndividual2 = new ClienteIndividual("Rodriguez", "39111100", "Florencia", 2);
        ClienteIndividual clienteIndividual3 = new ClienteIndividual("Gerez", "27241870", "Julieta", 3);
        System.out.println(clienteIndividual1);
        System.out.println(clienteIndividual2);
        System.out.println(clienteIndividual3);
        System.out.println();
        //////////////////////////////////////////////////////////////////
        // TEST: Creación de objetos de clase ClienteEmpresa
        //////////////////////////////////////////////////////////////////
        System.out.println("** Test Clase ClienteEmpresa **");
        ClienteEmpresa clienteEmpresa4 = new ClienteEmpresa("20-18175390-9", "Automotores Garcia", 4);
        ClienteEmpresa clienteEmpresa5 = new ClienteEmpresa("30-90845390-1", "Supermercado A ver si ahorra", 5);
        ClienteEmpresa clienteEmpresa6 = new ClienteEmpresa("27-21141390-0", "El Calabozo del Androide", 6);
        System.out.println(clienteEmpresa4);
        System.out.println(clienteEmpresa5);
        System.out.println(clienteEmpresa6);
        System.out.println();
        //////////////////////////////////////////////////////////////////
        // TEST: Creación de objetos de clase CajaDeAhorro
        //////////////////////////////////////////////////////////////////
        System.out.println("** TEST DE LA CLASE CUENTA **");
        System.out.println("** Test Clase CajaDeAhorro **");
        CajaDeAhorro cajaDeAhorro1 = new CajaDeAhorro(13, 1, clienteIndividual1, 10000);
        CajaDeAhorro cajaDeAhorro2 = new CajaDeAhorro(6, 2, clienteIndividual2, 150000);
        CajaDeAhorro cajaDeAhorro3 = new CajaDeAhorro(9, 3, clienteIndividual3, 100);
        System.out.println(cajaDeAhorro1);
        System.out.println(cajaDeAhorro2);
        System.out.println(cajaDeAhorro3);
        System.out.println();
        //////////////////////////////////////////////////////////////////
        // TEST: Creación de objetos de clase CuentaCorriente
        //////////////////////////////////////////////////////////////////
        System.out.println("** Test Clase CuentaCorriente **");
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(50000, 4, clienteEmpresa4, 96000);
        CuentaCorriente cuentaCorriente2 = new CuentaCorriente(1000, 5, clienteEmpresa5, 120000);
        CuentaCorriente cuentaCorriente3 = new CuentaCorriente(23000, 6, clienteEmpresa6, 70000);
        System.out.println(cuentaCorriente1);
        System.out.println(cuentaCorriente2);
        System.out.println(cuentaCorriente3);
        System.out.println(); 
        //////////////////////////////////////////////////////////////////
        // TEST: Creación de objetos de clase CuentaConvertibilidad
        //////////////////////////////////////////////////////////////////
        System.out.println("** Test Clase CuentaConvertibilidad **");
        CuentaConvertibilidad cuentaConvertibilidad1 = new CuentaConvertibilidad(10000, 50000, 4, clienteEmpresa4, 96000);
        CuentaConvertibilidad cuentaConvertibilidad2 = new CuentaConvertibilidad(100, 1000, 5, clienteEmpresa5, 120000);
        CuentaConvertibilidad cuentaConvertibilidad3 = new CuentaConvertibilidad(1000, 23000, 6, clienteEmpresa6, 70000);
        System.out.println(cuentaConvertibilidad1);
        System.out.println(cuentaConvertibilidad2);
        System.out.println(cuentaConvertibilidad3);
        System.out.println();
        //////////////////////////////////////////////////////////////////
        // TEST: Creación de objetos de clase Cheque
        //////////////////////////////////////////////////////////////////
        System.out.println("** Test Clase Cheque **");
        Cheque cheque1 = new Cheque(150000, "Santander", "23/09/2025");
        System.out.println("cheque1: "+ cheque1);
        System.out.println();
        System.out.println();
        //////////////////////////////////////////////////////////////////
        // TEST: Depositar y extraer efectivo y cheques de cuentas
        //////////////////////////////////////////////////////////////////
        System.out.println("Test probar depositar y extraer de cuentas");
        System.out.println("** CajaDeAhorro1 **");
        cajaDeAhorro1.depositarEfectivo(1000);
        System.out.println(cajaDeAhorro1.getSaldo());
        cajaDeAhorro1.extraerEfectivo(5000);
        System.out.println(cajaDeAhorro1.getSaldo());
        System.out.println();
        System.out.println("** CuentaCorriente3 **");
        cuentaCorriente3.extraerEfectivo(300000);
        System.out.println(cuentaCorriente3.getSaldo());
        cuentaCorriente3.extraerEfectivo(50000);
        System.out.println(cuentaCorriente3.getSaldo());
        System.out.println();
        System.out.println("** cuentaConvertibilidad2 **");
        cuentaConvertibilidad2.convertirDolaresAPesos(100, 1500);
        System.out.println(cuentaConvertibilidad2.getSaldoEnDolares());
        System.out.println(cuentaConvertibilidad2.getSaldo());
        System.out.println();
        cuentaCorriente1.depositarCheque(45000);
        System.out.println(cuentaCorriente1.getSaldo());
    }
}