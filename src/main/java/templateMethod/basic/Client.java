package templateMethod.basic;



public class Client {
    public static void  main (String [] args){

        ConcreteClass1 concreteClass1 = new ConcreteClass1();

        concreteClass1.templateMethod();
        concreteClass1.templateMethod2();

    }
}
