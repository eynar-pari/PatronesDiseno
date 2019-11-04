package ejercicios7.composite;

public class Computadora extends Component {
    private  int precio=100;
    public Computadora(String name){
        super(name);
    }

    @Override
    public void print() {
        System.out.println("\t Leaf : "+this.getName());
    }

    @Override
    public void add(Component component) {
        System.out.println("not applicable on Computadora");
    }

    @Override
    public void remove(Component component) {
        System.out.println("not applicable on Computadora");
    }

    @Override
    public void getChild(int position) {
        System.out.println("Computadora :"+this.getName());
    }

    @Override
    public int getPrecio() {
        return precio;
    }

}
