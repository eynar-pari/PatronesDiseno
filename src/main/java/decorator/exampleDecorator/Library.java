package decorator.exampleDecorator;

public class Library extends Decorator {
    private String attribute1;

    public Library(Ide componente){
        super(componente);
    }

    public void operation(){
        super.operation();
        this.attribute1 = "Library";
        System.out.println("Adding Library "+attribute1);
    }
}
