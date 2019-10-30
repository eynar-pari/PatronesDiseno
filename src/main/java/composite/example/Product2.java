package composite.example;

public class Product2 extends Component {

    public Product2(String name){
        super(name);
    }

    @Override
    public void print() {
        System.out.println("\t\t Leaf : "+this.getName());
    }

    @Override
    public void add(Component component) {
        System.out.println("not applicable on Product");
    }

    @Override
    public void remove(Component component) {
        System.out.println("not applicable on Product");
    }

    @Override
    public void getChild(int position) {
        System.out.println("\t\t Leaf :"+this.getName());
    }
}
