package chainOfResponsability.ejemplo;

public class GerenteRegion implements IPrestamo {
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
        if (amount >= 10000 && amount < 50000){
            System.out.println("Tarea atendida por el Agente Regional");
        }
        else{
        next.prestamoCredito(amount);}
    }
}
