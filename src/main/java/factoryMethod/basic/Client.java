package factoryMethod.basic;

public class Client {
    public static void main (String []args){
        ProductContrete abc=  new ConcreteCreator().factoryMethodProduct();
    }
}


