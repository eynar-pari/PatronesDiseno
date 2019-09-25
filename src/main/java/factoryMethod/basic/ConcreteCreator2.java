package factoryMethod.basic;

public class ConcreteCreator2 extends Creator {

    @Override
    public ProductContrete2 factoryMethodProduct() {

        return new ProductContrete2();
    }
}
