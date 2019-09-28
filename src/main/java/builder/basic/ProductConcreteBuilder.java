package builder.basic;

public class ProductConcreteBuilder extends ProductBuilder{
    @Override
    public void buildAttribute1() {
        producto.setAttribute1("caracteristica concreta1");
    }

    @Override
    public void buildAttribute2() {
        producto.setAttribute2("caracteristica concreta2");
    }

    @Override
    public void buildAttribute3() {
        producto.setAttribute3("caracteristica concreta3");
    }
}
