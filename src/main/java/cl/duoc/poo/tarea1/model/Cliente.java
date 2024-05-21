package cl.duoc.poo.tarea1.model;

public class Cliente {

    private String rut;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String direccion;
    private String comuna;
    private String telefono;
    private CuentaCorriente cuentaCorriente;

    public Cliente(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String direccion, String comuna, String telefono, CuentaCorriente cuentaCorriente) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.direccion = direccion;
        this.comuna = comuna;
        this.telefono = telefono;
        this.cuentaCorriente = cuentaCorriente;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public CuentaCorriente getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }
}
