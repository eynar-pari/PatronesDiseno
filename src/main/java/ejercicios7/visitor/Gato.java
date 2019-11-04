package ejercicios7.visitor;

public class Gato implements IAnimales {
    private int tipoEnfermedad;
    public int getTipoEnfermedad() {
        return tipoEnfermedad;
    }

    public void setTipoEnfermedad(int tipoEnfermedad) {
        this.tipoEnfermedad = tipoEnfermedad;
    }
    @Override
    public void accept(IVisitor visitor) {
         visitor.visit(this);
    }
}
