package facade.example;

public class Vuelos {
    private String disponobilidad;
    private String date;

    public Vuelos(String disponobilidad, String date){
        this.disponobilidad=disponobilidad;
        this.date= date;
    }

    public void findFly()    {
        System.out.println("Buscando Vuelos "+this.disponobilidad+ " date "+date);
    }

}
