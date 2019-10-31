package facade.example;

public class RentaAutos {
    private String disponobilidad;

    public RentaAutos(String disponobilidad, String date){
        this.disponobilidad=disponobilidad;
    }

    public void rentasDisponibles()    {
        System.out.println("Rentas Disponibles "+this.disponobilidad);
    }

}
