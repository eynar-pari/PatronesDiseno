package chainOfResponsability.basic;

public interface IHandler {

    public void setNext(IHandler handler) ; // metodo para ir al siguiente encargado de la responsabilidad
    public IHandler next(); // get siguiente
    public void criteriaHandler(int amount); // criterio para moverse en la cadena de responsabilidad
}
