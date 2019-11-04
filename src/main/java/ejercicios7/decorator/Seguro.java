package ejercicios7.decorator;

public class Seguro extends Decorator {
    private double descontar=10;
    public Seguro(ICuenta componente){
        super(componente);
    }

    public void showData() {
        System.out.println("* Descontando Seguro");
        super.setMonto(super.getMonto()-descontar);
        super.showData();
    }
}
