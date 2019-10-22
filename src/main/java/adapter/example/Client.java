package adapter.example;

public class Client {

    public static void main (String[]args){

        Docente docente=new Docente();
        docente.setNacimiento(1990);

        AdaptadorDocente adaptadorDocente= new AdaptadorDocente(docente);

        System.out.println("Edad : "+adaptadorDocente.getEdad());

    }


}
