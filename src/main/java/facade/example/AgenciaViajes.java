package facade.example;

public class AgenciaViajes {
    //Facade
    private Hoteles encontrarHotel;
    private RentaAutos econtrarAuto;
    private Seguro encontrarSeguro;
    private Vuelos encontrarVuelo;

    public AgenciaViajes(String disponibilidad, String date){
        encontrarHotel = new Hoteles(disponibilidad);
        econtrarAuto = new RentaAutos(disponibilidad,date);
        encontrarSeguro= new Seguro(disponibilidad,date);
        encontrarVuelo = new Vuelos(disponibilidad,date);
    }

    public void find(){

        encontrarHotel.findHotel();
        econtrarAuto.rentasDisponibles();
        encontrarSeguro.amount();
        encontrarVuelo.findFly();

    }

}
