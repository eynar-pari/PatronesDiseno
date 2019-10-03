package ejercicios.iterator_ejercicio2;

import java.util.Stack;
import java.util.Vector;

public class IteratorListStack implements Iterator {
    private Stack<String> nombres;
    private int position;
    public IteratorListStack(Stack<String> nombres){
        this.nombres=nombres;
        this.position=0;
    }

    @Override
    public Object next() {
       return nombres.get(position++);
    }

    @Override
    public boolean hasNext() {
        return position < nombres.size() && nombres.size() != 0 ;
    }
}
