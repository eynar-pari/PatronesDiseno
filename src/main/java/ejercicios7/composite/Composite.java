package ejercicios7.composite;

import java.util.ArrayList;

public class Composite extends Component {
    private int precio=0;
    private ArrayList<Component> list = new ArrayList<>();
    public Composite(String name){
        super(name);
    }

    @Override
    public void print() {
        // some actions when we do iteration with list
        for (Component comp: list
             )
            comp.print();

    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void getChild(int position) {
        System.out.println(list.get(position).getName());
    }

    @Override
    public int getPrecio() {
        precio=0;
        for (Component comp: list ) {
            precio = precio+comp.getPrecio();
        }
        System.out.println("Type : "+this.getName()+ " Precio"+this.precio);
        return precio;
    }
}
