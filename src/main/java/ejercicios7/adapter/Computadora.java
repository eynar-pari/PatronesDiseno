package ejercicios7.adapter;

public class Computadora implements  IArtefactosElectronicosA {
    private int precio=0;
    private int vida=0;
    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(int precio) {
        this.precio=precio;
    }

    @Override
    public int getTiempoDeVida() {
        return vida;
    }

    @Override
    public void setTiempoDeVida(int tiempoDeVida) {
        vida=tiempoDeVida;
    }
}
