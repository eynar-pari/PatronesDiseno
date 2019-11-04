package ejercicios7.bridge;

public class Credito implements ICuentas {
    private double monto;
    private IMoneda moneda;

    public Credito(IMoneda moneda, double monto){
        this.moneda = moneda;
        this.monto=monto;
    }

    @Override
    public void showAmount() {
        System.out.println("Amount "+moneda.cambiarMoneda(monto));
    }
}
