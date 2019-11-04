package ejercicios7.bridge;

public class Client {
    public static void main( String [] args){
            Bolivianos bolivianos = new Bolivianos();
            Dolares dolares = new Dolares();
            Euros euros = new Euros();

            Ahorro ahorro = new Ahorro(bolivianos,100);

            PlazoFijo plazoFijo = new PlazoFijo( dolares,100);

            Credito credito = new Credito( euros,100);

            ahorro.showAmount();
            plazoFijo.showAmount();
            credito.showAmount();

    }
}
