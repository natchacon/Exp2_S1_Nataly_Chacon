package cl.duoc.poo.tarea1.menu;

import cl.duoc.poo.tarea1.BankBoston;
import cl.duoc.poo.tarea1.menu.validacion.ValidaRut;
import cl.duoc.poo.tarea1.menu.validacion.Validacion;
import cl.duoc.poo.tarea1.model.Cliente;

import java.util.Optional;

public class ConsultarSaldo extends OpcionMenu {

    private static Validacion VALIDACION_RUT = new ValidaRut();

    public ConsultarSaldo(Integer numeroMenu, String nombreMenu) {
        super(numeroMenu, nombreMenu);
    }

    @Override
    public void ejecutar() {
        String rut = solicitarDato("Ingrese el rut del cliente", "Rut incorrecto", VALIDACION_RUT);
        Optional<Cliente> clienteOptional = BankBoston.getInstance().getClientes().stream().filter(c -> {
            return c.getRut().equals(rut);
        }).findFirst();
        if (clienteOptional.isPresent()) {
            Cliente cliente = clienteOptional.get();
            System.out.println("Cliente:");
            System.out.println("Rut: " + cliente.getRut());
            System.out.println("Cuenta Corriente: " + cliente.getCuentaCorriente().getNumeroCorriente());
            System.out.println("Saldo: " + cliente.getCuentaCorriente().getSaldo());
        } else {
            System.out.println("Cliente no existe");
        }
    }
}
