package ejercicios7.bridge;

public class Euros implements IMoneda {

    @Override
    public double cambiarMoneda(double cantidad) {
        System.out.println("Cambio de Bolvianos "+cantidad+" a Moneda : Euros "+cantidad/10);
        return cantidad/10;
    }
}
