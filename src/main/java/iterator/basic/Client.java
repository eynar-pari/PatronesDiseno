package iterator.basic;
public class Client {

    public static void main (String []args){
        List1 listaType1 = new List1();
        listaType1.add("B1Nombre1");
        listaType1.add("B1Nombre2");
        listaType1.add("B1Nombre3");
        listaType1.add("B1Nombre4");

        List2 listType2 = new List2();
        listType2.add("B2Nombre1");
        listType2.add("B2Nombre2");
        listType2.add("B2Nombre3");
        listType2.add("B2Nombre4");

        Iterator iterator;
        iterator = listaType1.iterator();
        while ( iterator.hasNext()){
            String nombre = (String)iterator.next();
            System.out.println("nombre : "+nombre);
        }

        iterator = listType2.iterator();
        while ( iterator.hasNext()){
            String nombre = (String)iterator.next();
            System.out.println("nombre : "+nombre);
        }
    }
}
