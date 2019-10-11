package observer.basic;

public class Client {
    public static void  main(String[]args){
        ConcreteSubject objeto= new ConcreteSubject();

        objeto.attach(new ObservadorConcreto1());
        objeto.attach(new ObservadorConcreto2());

        objeto.setAttribute1("message");
        objeto.notifyObserver();

    }
}
