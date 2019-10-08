package chainOfResponsability.ejemplo;

public class GerenteGeneral implements IPrestamo {
    private IPrestamo next; // atributo next

    @Override
    public void setNext(IPrestamo handler) {
        next = handler;
    }

    @Override
    public IPrestamo next() {
        return next;
    }

    @Override
    public void prestamoCredito(int amount) {
        if (amount >= 50000 && amount < 100000) {
            System.out.println("Tarea atendida por el Agente General");
        } else {
            System.out.println("Sin Fondos");
        }
    }
}
