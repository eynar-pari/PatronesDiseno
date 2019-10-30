package composite.example;

public class Client {
    public static void main(String []args){
        Composite kidProduct1 = new Composite("kid Product1");
        kidProduct1.add(new Product("Product1"));
        kidProduct1.add(new Product("Product2"));
        kidProduct1.add(new Product("Product3"));

        Composite kidProduct2 = new Composite("kid Produc2t");
        kidProduct2.add(new Product2("Product1"));
        kidProduct2.add(new Product2("Product2"));
        kidProduct2.add(new Product2("Product3"));

        Composite boxProduct=new Composite("box Product");
        boxProduct.add(kidProduct1);
        boxProduct.add(kidProduct2);

        boxProduct.print();
    }
}
