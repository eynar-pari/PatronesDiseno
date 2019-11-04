package ejercicios7.bridge;

public class Bolivianos implements IMoneda {

    @Override
    public double cambiarMoneda(double cantidad) {
        System.out.println("Moneda : Bolivianos");
        return cantidad;
    }
}
