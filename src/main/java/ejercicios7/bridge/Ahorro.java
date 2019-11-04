package ejercicios7.bridge;

public class Ahorro implements ICuentas {
    private double monto;
    private IMoneda moneda;

    public Ahorro(IMoneda moneda, double monto){
        this.moneda = moneda;
        this.monto=monto;
    }

    @Override
    public void showAmount() {
        System.out.println("Amount "+moneda.cambiarMoneda(monto+(monto*0.02)));
    }
}
