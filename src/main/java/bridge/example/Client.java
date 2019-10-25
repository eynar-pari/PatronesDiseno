package bridge.example;

public class Client {
    public static void main( String [] args){
            Blanco blanco = new Blanco();
            Circulo circulo = new Circulo(blanco);
            circulo.dibujar();

    }
}
