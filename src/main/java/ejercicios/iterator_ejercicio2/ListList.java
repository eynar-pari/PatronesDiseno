package ejercicios.iterator_ejercicio2;

import java.util.ArrayList;
import java.util.List;
public class ListList implements IList {
    List<String> nombres;

    public ListList(){
         nombres= new ArrayList<>();
    }

    public void add(String value){
        nombres.add(value);
    }

    @Override
    public IteratorListList iterator() {
        return new IteratorListList(this.nombres);
    }
}
