package composite.basic;

public class Leaf extends Component {

    public Leaf(String attribute){
        super(attribute);
    }

    @Override
    public void operation() {
        System.out.println("\t Leaf : "+this.getAttribute());
    }

    @Override
    public void add(Component component) {
        System.out.println("not applicable on Leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("not applicable on Leaf");
    }

    @Override
    public void getChild(int position) {
        System.out.println("\t Leaf :"+this.getAttribute());
    }
}
