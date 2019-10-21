package visitor.example;

public class Estudiante implements IPersona {

    private int descuento=50;
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
