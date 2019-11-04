package ejercicios7.adapter;

public class Refrigerador implements IArtefactosElectronicosB {
    private int costo=0;
    private int tiempo=0;
    @Override
    public int getCosto() {
        return costo;
    }

    @Override
    public void setCosto(int costo) {
        this.costo=costo;
    }

    @Override
    public int getTiempoDeGarantia() {
        return tiempo;
    }

    @Override
    public void setTiempoDeGarantia(int tiempoDeGarantia) {
        this.tiempo=tiempoDeGarantia;
    }
}
