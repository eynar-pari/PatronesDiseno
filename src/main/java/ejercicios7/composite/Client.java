package ejercicios7.composite;

public class Client {
    public static void main(String []args){
        Composite laboratorio1 = new Composite("LAB1");

        laboratorio1.add(new Computadora("PC1"));
        laboratorio1.add(new Computadora("PC2"));
        laboratorio1.add(new Computadora("PC3"));

        laboratorio1.getPrecio();

        Composite laboratorio2 = new Composite("LAB2");
        laboratorio2.add(new Computadora("PC4"));
        laboratorio2.add(new Computadora("PC5"));
        laboratorio2.add(new Computadora("PC6"));
        laboratorio2.add(new Computadora("PC7"));
        laboratorio2.getPrecio();

        Composite container1=new Composite("CONT1");
        container1.add(laboratorio1);
        container1.add(laboratorio2);
         container1.getPrecio();
    }
}
