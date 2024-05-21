package cl.duoc.poo.tarea1.menu;

import cl.duoc.poo.tarea1.BankBoston;
import cl.duoc.poo.tarea1.menu.validacion.*;
import cl.duoc.poo.tarea1.model.Cliente;
import cl.duoc.poo.tarea1.model.CuentaCorriente;

public class RegistrarCliente extends OpcionMenu{

    private static Validacion VALIDACION_RUT_EXISTE = new ValidaRutExiste();
    private static Validacion VALIDA_TEXTO_NO_VACIO = new ValidarTextoNoVacio();

    private static Validacion VALIDA_CUENTA_CORRIENTE = new ValidarCuentaCorriente();

    public RegistrarCliente(Integer numeroMenu, String nombreMenu) {
        super(numeroMenu, nombreMenu);
    }

    @Override
    public void ejecutar() {
        String rut = solicitarDato("Ingrese Rut", "Rut incorrecto o ya existe, reingrese", VALIDACION_RUT_EXISTE);
        String nombre = solicitarDato("Ingrese Nombre", "Nombre no puede ser vacio", VALIDA_TEXTO_NO_VACIO);
        String apellidoPaterno = solicitarDato("Ingrese Apellido Paterno", "Apellido Paterno no puede ser vacio", VALIDA_TEXTO_NO_VACIO);
        String apellidoMaterno = solicitarDato("Ingrese Apellido Materno", "Apellido Materno no puede ser vacion", VALIDA_TEXTO_NO_VACIO);
        String direccion = solicitarDato("Ingrese Direccion", "Direccion no puede ser vacion", VALIDA_TEXTO_NO_VACIO);
        String comuna = solicitarDato("Ingrese Comuna", "Comuna no puede ser vacion", VALIDA_TEXTO_NO_VACIO);
        String telefono = solicitarDato("Ingrese Telefono", "Telefono no puede ser vacion", VALIDA_TEXTO_NO_VACIO);
        String numeroCuenta = solicitarDato("Ingrese numero de cuenta corriente", "Numero debe ser númerico de largo 9 y no puede repetirse", VALIDA_CUENTA_CORRIENTE);
        BankBoston.getInstance().getClientes().add(new Cliente(rut, nombre, apellidoPaterno, apellidoMaterno, direccion, comuna, telefono, new CuentaCorriente(Integer.valueOf(numeroCuenta))));
        System.out.println("Cliente registrado existsamente!!!");
    }
}
