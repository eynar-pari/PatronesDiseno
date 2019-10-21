package visitor.example;

public class Client {

    public static void main (String []args){
        Estudiante jose = new Estudiante();
        Director juan = new Director();

        Matriculacion visitor= new Matriculacion();

        System.out.println("Result A : "+jose.accept(visitor));
        System.out.println("Result B : "+juan.accept(visitor));

        Graduacion graduacion= new Graduacion();

        System.out.println("Result A : "+jose.accept(graduacion));
        System.out.println("Result B : "+juan.accept(graduacion));
    }
}
