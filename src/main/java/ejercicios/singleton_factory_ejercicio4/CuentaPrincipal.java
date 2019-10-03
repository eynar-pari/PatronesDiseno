package ejercicios.singleton_factory_ejercicio4;

public class CuentaPrincipal {

    private static CuentaPrincipal instance = null;
    private int amount;
    private CuentaPrincipal(int amount) {
        this.amount=amount;
        System.out.println("Inicia saldo : "+this.amount);
    }

    public static synchronized CuentaPrincipal getUniqueInstance(int amount) {
        if (instance == null)
            instance = new CuentaPrincipal(amount);
        return instance;
    }

    public void getPrestamo(int cantidad) {
        if (this.amount > cantidad) {
            this.amount = this.amount - cantidad;
            System.out.println("sacando cantidad de prestamo : [" + cantidad + "] --> Saldo : " + amount);
        } else {
            System.out.println("Saldo insuficiente : "+amount);
        }
    }
}
