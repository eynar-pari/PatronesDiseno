package ejercicios.iterator_ejercicio2;

public class IteratorListArray implements Iterator {

    private int position;
    private String [] nombres ;

    public IteratorListArray(String [] nombres){
        this.nombres= nombres;
    }
    @Override
    public Object next() {
        return nombres[position++];
    }
    @Override
    public boolean hasNext() {
        return nombres.length != 0 && position < nombres.length;
    }
}
