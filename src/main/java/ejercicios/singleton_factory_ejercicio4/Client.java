package ejercicios.singleton_factory_ejercicio4;

public class Client {

    public static void main (String [] args){

        Cajero juan = new Cajero("juan");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                FactoryPrestamo.make(FactoryPrestamo.PrestamoType.CREDITO).operation(juan,50);
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                FactoryPrestamo.make(FactoryPrestamo.PrestamoType.FINANCIAMIENTO).operation(juan,50);
            }
        });

        thread.start();
        thread1.start();

        FactoryPrestamo.make(FactoryPrestamo.PrestamoType.CREDITO).operation(juan,50);

        FactoryPrestamo.make(FactoryPrestamo.PrestamoType.CREDITO).operation(juan,15000);

    }
}
