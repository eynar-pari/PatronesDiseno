package chainOfResponsability.ejemplo;

public class Client {
    public static void main (String [] args ){
        Banco banco = new Banco();
        banco.prestamoCredito(120);
    }

}
