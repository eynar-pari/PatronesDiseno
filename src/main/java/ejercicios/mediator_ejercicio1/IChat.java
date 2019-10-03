package ejercicios.mediator_ejercicio1;

public interface IChat {

    public void send(String msg, Developer from , Developer to);
    public void sendAll(String msg, Developer from);
}
