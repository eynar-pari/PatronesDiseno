package observer.basic;

public interface ISubject {
    public void attach (IObserver observer); // agregar observadores
    public void deattah(IObserver observer); // eliminar observadores
    public  void notifyObserver(); // notificar a todos
}
