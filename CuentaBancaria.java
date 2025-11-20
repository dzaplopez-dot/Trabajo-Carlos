public class CuentaBancaria {

    private int numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(int numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }


    public void mostrarDatos() {
        System.out.println("El numero de cuenta es: " + numeroCuenta);
        System.out.println("El titular de la cuenta es: " + titular);
        System.out.println("El saldo en la cuenta es de: " + saldo);
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto) {

        saldo = saldo + monto;
        System.out.println("Su nuevo saldo es de: " + saldo);

    }

    public void retirar(double monto) {
        if (monto <  saldo) {
            saldo = saldo - monto;
            System.out.println("Su nuevo saldo es de : " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
