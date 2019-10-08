package chainOfResponsability.basic;

public class HandlerConcreto3 implements IHandler {
    private IHandler next; // atributo next

    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void criteriaHandler(int amount) {
        if (amount >= 200 && amount < 300){
            System.out.println("Tarea atendida por el HandlerConcreto3");
        }
        else{
        next.criteriaHandler(amount);}
    }
}
