package ejercicios.iterator_ejercicio2;

public class ListArray implements IList {
    private int position;
    private String [] nombres ;
    public ListArray(){
        position=0;
        nombres= new String[4];
    }
    public void add(String value){
        nombres[position]=value;
        position++;
    }
    @Override
    public IteratorListArray iterator() {
        return  new IteratorListArray(nombres);
    }
}
