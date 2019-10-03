package ejercicios.iterator_ejercicio2;

import java.util.Vector;

public class ListVector implements IList {
    Vector <String> nombres;

    public ListVector(){
         nombres= new Vector<>();
    }

    public void add(String value){
        nombres.add(value);
    }

    @Override
    public IteratorListVector iterator() {
        return new IteratorListVector(this.nombres);
    }
}
