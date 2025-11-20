public class Cuenta {

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria(9934, "Daniel Pinzon", 500.0);
        
        cuenta1.mostrarDatos();

        cuenta1.depositar(400.0);

       

        cuenta1.mostrarDatos();

        cuenta1.retirar(100.0);

        System.out.println("Después del retiro:");

        cuenta1.mostrarDatos();

        cuenta1.retirar(1000.0);
            
    }
}

    