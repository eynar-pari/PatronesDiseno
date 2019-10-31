package facade.example;

public class Hoteles {
    private String disponobilidad;

    public Hoteles(String disponobilidad){
        this.disponobilidad=disponobilidad;
    }

    public void findHotel(){
        System.out.println("Buscando Hotel "+this.disponobilidad);
    }

}
