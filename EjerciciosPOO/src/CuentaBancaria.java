public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String nombreCliente;
    private String email;
    private String numeroTelefono;

    public CuentaBancaria(String numeroCuenta, double saldo, String nombreCliente, String email, String numeroTelefono) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.nombreCliente = nombreCliente;
        this.email = email;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso de $" + cantidad);
        } else {
            System.out.println("Error: La cantidad a depositar debe ser mayor que cero.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (saldo >= cantidad) {
                saldo -= cantidad;
                System.out.println("Retiro exitoso de $" + cantidad);
            } else {
                System.out.println("Error: Fondos insuficientes para realizar el retiro.");
            }
        } else {
            System.out.println("Error: La cantidad a retirar debe ser mayor que cero.");
        }
    }

}
