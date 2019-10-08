package chainOfResponsability.ejemplo;

public class Banco implements IPrestamo {
    private IPrestamo next;
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

        AgenteCredito handler1 = new AgenteCredito();
        this.setNext(handler1);

        GerenteSucursal handler2 = new GerenteSucursal();
        handler1.setNext(handler2);

        GerenteRegion handler3 = new GerenteRegion();
        handler2.setNext(handler3);

        next.prestamoCredito(amount);
    }
}
