package cl.duoc.poo.tarea1.menu.validacion;

public class ValidarTextoNoVacio implements Validacion{
    @Override
    public Boolean validar(String dato) {
        return (dato!=null && !dato.equals(""));
    }
}
