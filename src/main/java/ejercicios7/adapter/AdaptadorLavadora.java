package ejercicios7.adapter;

public class AdaptadorLavadora implements IArtefactosElectronicosA {
     private Lavadora lavadora = new Lavadora();
     public AdaptadorLavadora(Lavadora lavadora){
         this.lavadora =lavadora;
    }

    @Override
    public int getPrecio() {
        return this.lavadora.getCosto();
    }

    @Override
    public void setPrecio(int precio) {
        this.lavadora.setCosto(precio);
    }

    @Override
    public int getTiempoDeVida() {
        return this.lavadora.getTiempoDeGarantia();
    }

    @Override
    public void setTiempoDeVida(int tiempoDeVida) {
        this.lavadora.setTiempoDeGarantia(tiempoDeVida);
    }
}
