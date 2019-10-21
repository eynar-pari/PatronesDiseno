package visitor.example;

public class Director implements IPersona {
    private String nombre;
    private int descuento=10;
    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    @Override
    public double accept(IVisitor visitor) {
        return visitor.visit(this);
    }
}
