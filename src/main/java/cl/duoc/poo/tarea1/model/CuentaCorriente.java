package cl.duoc.poo.tarea1.model;

public class CuentaCorriente {

    private Integer numeroCorriente;
    private Integer saldo;

    public CuentaCorriente(Integer numeroCorriente) {
        this.numeroCorriente = numeroCorriente;
        this.saldo = 0;
    }

    public Boolean deposito(Integer monto) {
        if (monto > 0) {
            this.saldo += monto;
        } else {
            System.out.println("Monto a depositar debe ser mayor a 0");
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public Boolean giro(Integer monto) {
        if (monto > saldo) {
            System.out.println("No se puede realizar el giro. Saldo insuficiente. Saldo actual " + this.saldo);
            return Boolean.FALSE;
        } else {
            this.saldo -= monto;
            return Boolean.TRUE;
        }


    }


    public Integer getNumeroCorriente() {
        return numeroCorriente;
    }

    public void setNumeroCorriente(Integer numeroCorriente) {
        this.numeroCorriente = numeroCorriente;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && this.numeroCorriente != null && (o instanceof CuentaCorriente)) {
            return this.numeroCorriente.equals(((CuentaCorriente) o).getNumeroCorriente());
        }
        return false;
    }

}
