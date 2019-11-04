package ejercicios7.adapter;

public class AdaptadorTelevisores implements IArtefactosElectronicosA {
     private Televisores televisores= new Televisores();
     public AdaptadorTelevisores(Televisores televisores){
         this.televisores=televisores;
    }

    @Override
    public int getPrecio() {
        return this.televisores.getCosto();
    }

    @Override
    public void setPrecio(int precio) {
        this.televisores.setCosto(precio);
    }

    @Override
    public int getTiempoDeVida() {
        return this.televisores.getTiempoDeGarantia();
    }

    @Override
    public void setTiempoDeVida(int tiempoDeVida) {
        this.televisores.setTiempoDeGarantia(tiempoDeVida);
    }
}
