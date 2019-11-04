package ejercicios7.adapter;

public class AdaptadorRefrigerador implements IArtefactosElectronicosA {
     private Refrigerador refrigerador = new Refrigerador();
     public AdaptadorRefrigerador(Refrigerador refrigerador){
         this.refrigerador =refrigerador;
    }

    @Override
    public int getPrecio() {
        return this.refrigerador.getCosto();
    }

    @Override
    public void setPrecio(int precio) {
        this.refrigerador.setCosto(precio);
    }

    @Override
    public int getTiempoDeVida() {
        return this.refrigerador.getTiempoDeGarantia();
    }

    @Override
    public void setTiempoDeVida(int tiempoDeVida) {
        this.refrigerador.setTiempoDeGarantia(tiempoDeVida);
    }
}
