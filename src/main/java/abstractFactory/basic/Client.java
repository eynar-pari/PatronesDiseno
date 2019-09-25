package abstractFactory.basic;

public class Client {

    public static void main (String [] args){

        FactoryProduct.make("product1").operation();

    }
}
