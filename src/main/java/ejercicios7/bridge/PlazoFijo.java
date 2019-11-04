package ejercicios7.bridge;

public class PlazoFijo implements ICuentas {

    private double monto;
    private IMoneda moneda;

    public PlazoFijo(IMoneda moneda, int monto){
        this.moneda = moneda;
        this.monto=monto;
    }

    @Override
    public void showAmount() {
        System.out.println("Amount "+moneda.cambiarMoneda(monto+(monto*0.05)));
    }
}
