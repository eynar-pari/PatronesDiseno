package ejercicios.iterator_ejercicio2;

import java.util.Stack;
import java.util.Vector;

public class ListStack implements IList {
    Stack<String> nombres;

    public ListStack(){
         nombres= new Stack<>();
    }

    public void add(String value){
        nombres.add(value);
    }

    @Override
    public IteratorListStack iterator() {
        return new IteratorListStack(this.nombres);
    }
}
