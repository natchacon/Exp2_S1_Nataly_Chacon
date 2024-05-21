package cl.duoc.poo.tarea1.menu;

import cl.duoc.poo.tarea1.BankBoston;
import cl.duoc.poo.tarea1.menu.validacion.ValidaRut;
import cl.duoc.poo.tarea1.menu.validacion.Validacion;
import cl.duoc.poo.tarea1.menu.validacion.ValidarNumeroEntero;
import cl.duoc.poo.tarea1.model.Cliente;

import java.util.Optional;

public class Depositar extends OpcionMenu {

    private static Validacion VALIDACION_RUT = new ValidaRut();
    private static Validacion VALIDACION_ENTER0 = new ValidarNumeroEntero();

    public Depositar(Integer numeroMenu, String nombreMenu) {
        super(numeroMenu, nombreMenu);
    }

    @Override
    public void ejecutar() {
        String rut = solicitarDato("Ingrese el rut del cliente", "Rut incorrecto", VALIDACION_RUT);
        Optional<Cliente> clienteOptional = BankBoston.getInstance().getClientes().stream().filter(c->{
            return c.getRut().equals(rut);
        }).findFirst();
        if(clienteOptional.isPresent()){
            Cliente cliente = clienteOptional.get();
            String monto = solicitarDato("Ingrese monto a depositar en la cuenta " + cliente.getCuentaCorriente().getNumeroCorriente() + " del cliente " + cliente.getNombre() + " " + cliente.getApellidoPaterno(), "Monto debe ser entero", VALIDACION_ENTER0);
            if(cliente.getCuentaCorriente().deposito(Integer.valueOf(monto))){
                System.out.println("Deposito realizado con exito!!!");
            }

        } else {
            System.out.println("Cliente no existe");
        }
    }
}
