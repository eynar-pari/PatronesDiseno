package chainOfResponsability.basic;

public class HandlerConcreto2 implements IHandler {
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
        if (amount >= 100 && amount < 200){
            System.out.println("Tarea atendida por el HandlerConcreto2");
        }
        else{
        next.criteriaHandler(amount);}
    }
}
