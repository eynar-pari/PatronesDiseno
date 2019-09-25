package factoryMethod.basic;

public class ConcreteCreator extends Creator {
    @Override
    public ProductContrete factoryMethodProduct() {

        ProductContrete productContrete= new ProductContrete();
        Base1 base1 = new Base1();
        Base2 base2 = new Base2();
        productContrete.setBase1(base1);
        productContrete.setBase2(base2);
        return productContrete;
    }
}
