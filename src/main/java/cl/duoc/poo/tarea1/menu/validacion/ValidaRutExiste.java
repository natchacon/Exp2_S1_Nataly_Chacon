package cl.duoc.poo.tarea1.menu.validacion;

import cl.duoc.poo.tarea1.BankBoston;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaRutExiste implements Validacion {

    public static Boolean validaRut(String rut) {
        Pattern pattern = Pattern.compile("^[0-9]+-[0-9kK]{1}$");
        Matcher matcher = pattern.matcher(rut);
        if (matcher.matches() == false) return false;
        String[] stringRut = rut.split("-");
        return stringRut[1].toLowerCase().equals(dv(stringRut[0]));
    }

    public static String dv(String rut) {
        Integer M = 0, S = 1, T = Integer.parseInt(rut);
        for (; T != 0; T = (int) Math.floor(T /= 10))
            S = (S + T % 10 * (9 - M++ % 6)) % 11;
        return (S > 0) ? String.valueOf(S - 1) : "k";
    }

    public Boolean rutExiste(String rut){
        return BankBoston.getInstance().getClientes().stream().filter(c->c.getRut().equals(rut)).findFirst().isPresent();
    }

    @Override
    public Boolean validar(String dato) {
        if (dato != null && !dato.equals("")) {
            Boolean rutCorrecto =  validaRut(dato);
            if(rutCorrecto){
                return !rutExiste(dato);
            }
            return Boolean.FALSE;
        }
        return Boolean.FALSE;
    }

}
