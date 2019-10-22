package adapter.basic;

public class Client {
    public static void main (String [] args){

            Adaptee adapteeObject= new Adaptee();
            ConcreteAdapter concreteAdapter = new ConcreteAdapter(adapteeObject);
            concreteAdapter.method1();

    }
}
