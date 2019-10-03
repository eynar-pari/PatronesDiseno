package ejercicios.iterator_ejercicio2;

import java.util.HashMap;

public class Client {

    public static void main (String []args){
        HashMap<String,String> finalList = new HashMap<>();

        ListArray listaType1 = new ListArray();
        listaType1.add("A1Nombre1");
        listaType1.add("A1Nombre2");
        listaType1.add("A1Nombre3");
        listaType1.add("A1Nombre4");

        ListVector listType2 = new ListVector();
        listType2.add("B2Nombre1");
        listType2.add("B2Nombre2");
        listType2.add("B2Nombre3");
        listType2.add("B2Nombre4");

        ListList listType3 = new ListList();
        listType3.add("C2Nombre1");
        listType3.add("C2Nombre2");
        listType3.add("C2Nombre3");
        listType3.add("C2Nombre4");

        ListStack listType4 = new ListStack();
        listType4.add("D2Nombre1");
        listType4.add("D2Nombre2");
        listType4.add("D2Nombre3");
        listType4.add("D2Nombre4");

        Iterator iterator;
        iterator = listaType1.iterator();
        while ( iterator.hasNext()){
            String nombre = (String)iterator.next();
            finalList.put(nombre,nombre);
        }

        iterator = listType2.iterator();
        while ( iterator.hasNext()){
            String nombre = (String)iterator.next();
            finalList.put(nombre,nombre);
        }
        iterator = listType3.iterator();
        while ( iterator.hasNext()){
            String nombre = (String)iterator.next();
            finalList.put(nombre,nombre);
        }
        iterator = listType4.iterator();
        while ( iterator.hasNext()){
            String nombre = (String)iterator.next();
            finalList.put(nombre,nombre);
        }

        for (String key:finalList.keySet()
             ) {
            System.out.println("Empleado "+finalList.get(key));
        }
    }
}
