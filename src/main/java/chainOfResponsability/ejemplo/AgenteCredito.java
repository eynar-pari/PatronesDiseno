package chainOfResponsability.ejemplo;

public class AgenteCredito implements IPrestamo {
    private IPrestamo next; // atributo next manejador de la responsabilidad

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
        if (amount < 1000){
            System.out.println("Tarea atendida por el Agente de Credito");
        }
        else{
        next.prestamoCredito(amount);}
    }
}
