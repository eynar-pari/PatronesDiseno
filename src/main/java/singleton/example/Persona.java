package singleton.example;

public class Persona {

    private String acccionCaminar;
    private String acccionMano;
    private String acccionPies;
    private String acccionCabeza;

    public Persona(){
        Logger.getInstance().write("INFO","Construyendo Persona");
    }

    public String getAcccionCaminar() {
        return acccionCaminar;
    }

    public void setAcccionCaminar(String acccionCaminar) {
        this.acccionCaminar = acccionCaminar;
        Logger.getInstance().write("INFO","Camminar "+acccionCaminar);
    }

    public String getAcccionMano() {
        return acccionMano;
    }

    public void setAcccionMano(String acccionMano) {
        this.acccionMano = acccionMano;
        Logger.getInstance().write("INFO","Mano "+acccionMano);

    }

    public String getAcccionPies() {
        return acccionPies;
    }

    public void setAcccionPies(String acccionPies) {
        this.acccionPies = acccionPies;
        Logger.getInstance().write("INFO","Pies "+acccionPies);

    }

    public String getAcccionCabeza() {
        return acccionCabeza;
    }

    public void setAcccionCabeza(String acccionCabeza) {
        this.acccionCabeza = acccionCabeza;
        Logger.getInstance().write("INFO","Cabeza "+acccionCabeza);
    }


}
