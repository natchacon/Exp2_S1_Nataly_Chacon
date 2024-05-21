package cl.duoc.poo.tarea1.menu.validacion;

public class ValidarCuentaCorriente implements Validacion {
    @Override
    public Boolean validar(String dato) {
        try {
            Integer numeroCuente = Integer.valueOf(dato);
            if (numeroCuente >= 1000000000) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
