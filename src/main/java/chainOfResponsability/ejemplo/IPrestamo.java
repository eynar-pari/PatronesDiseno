package chainOfResponsability.ejemplo;

public interface IPrestamo {

    public void setNext(IPrestamo handler) ; // metodo para ir al siguiente encargado de la responsabilidad
    public IPrestamo next(); // get siguiente
    public void prestamoCredito(int amount); // criterio para moverse en la cadena de responsabilidad
}
