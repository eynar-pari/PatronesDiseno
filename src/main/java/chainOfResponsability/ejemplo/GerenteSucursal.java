package chainOfResponsability.ejemplo;

public class GerenteSucursal implements IPrestamo {
    private IPrestamo next; // atributo next

    @Override
    public void setNext(IPrestamo handler) {
        next=handler;
    }

    @Override
    public IPrestamo next() {
        return next;
    }

    @Override
    public void prestamoCredito(int amount) {
        if (amount >= 1000 && amount < 10000){
            System.out.println("Tarea atendida por el Gerente sucursal");
        }
        else{
        next.prestamoCredito(amount);}
    }
}
