package ejercicios7.decorator;

public abstract class Decorator implements ICuenta {
    private ICuenta componente;

    public Decorator(ICuenta componente){
        this.componente = componente;
    }

    public void showData(){
        componente.showData();
    }

    private ICuenta getComponent(){
        return componente;
    }

    @Override
    public Double getMonto() {
        return componente.getMonto();
    }

    @Override
    public void setMonto(Double monto) {
        componente.setMonto(monto);
    }
}
