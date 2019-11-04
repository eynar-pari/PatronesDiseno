package ejercicios7.decorator;

public class Client {
    public static void main(String[] args) {
        ICuenta cuentaBasica = new Basica("Eynar",1000.0);
        cuentaBasica = new BancaPorInternet(cuentaBasica,true);
        cuentaBasica = new Seguro(cuentaBasica);
        cuentaBasica = new Promocion(cuentaBasica);

        cuentaBasica.showData();
    }
}
