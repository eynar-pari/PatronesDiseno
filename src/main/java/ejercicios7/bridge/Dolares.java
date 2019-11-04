package ejercicios7.bridge;

public class Dolares implements IMoneda {

    @Override
    public double cambiarMoneda(double cantidad) {
        System.out.println("Cambio de Bolvianos "+cantidad+" a Moneda : Dolares "+cantidad/7);
        return cantidad/7;
    }
}
