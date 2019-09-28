package builder.basic;

public abstract class ProductBuilder {
     // Product
     protected  Producto producto;

     public Producto getProducto(){
         return producto;
     }

     public void createProduct(){
         producto= new Producto();
     }

    public abstract  void buildAttribute1();
    public abstract  void buildAttribute2();
    public abstract  void buildAttribute3();

}
