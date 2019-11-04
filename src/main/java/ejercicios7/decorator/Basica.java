package ejercicios7.decorator;

import ejercicios7.bridge.Dolares;

public class Basica implements ICuenta {

    private String nombre;
    private Double monto;

    public Basica(String nombre,Double monto){
        this.nombre=nombre;
        this.monto=monto;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public Double getMonto() {
        return monto;
    }

    @Override
    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public void showData(){
        System.out.println("-----------------\nnombre "+this.nombre);
        System.out.println("monto "+this.monto+"\n-----------------");
    }
}
