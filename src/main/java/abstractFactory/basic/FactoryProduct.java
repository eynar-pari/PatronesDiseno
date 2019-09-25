package abstractFactory.basic;

public class FactoryProduct {
    public static Product make(String type){
        Product product;
        switch (type){

            case "product1":
                product = new ProductConcrete1();
                break;

            case "product2":
                product = new ProductConcrete2();
                break;

            default:
                product = new ProductConcrete2();
                break;
        }
        return product;
    }
}

