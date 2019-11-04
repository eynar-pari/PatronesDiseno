package ejercicios7.decorator;

public class BancaPorInternet extends Decorator {
    private boolean isEnabled;

    public BancaPorInternet(ICuenta componente,boolean isEnabled){
        super(componente);
        this.isEnabled = isEnabled;
    }



    public void showData() {
        super.showData();
        System.out.println("* Banca Por Internet Esta Habilitado : "+isEnabled);
    }

    @Override
    public Double getMonto() {
        return super.getMonto();
    }

    @Override
    public void setMonto(Double monto) {
        super.setMonto(monto);
    }
}
