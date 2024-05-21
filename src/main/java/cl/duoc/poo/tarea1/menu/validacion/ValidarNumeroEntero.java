package cl.duoc.poo.tarea1.menu.validacion;

public class ValidarNumeroEntero implements Validacion{
    @Override
    public Boolean validar(String dato) {
        try {
            Integer.valueOf(dato);
            return Boolean.TRUE;
        }
        catch (Exception e){
            return Boolean.FALSE;
        }
    }
}
