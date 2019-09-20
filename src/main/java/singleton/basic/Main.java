package singleton.basic;

public class Main {

    public static void main (String [] args){
        // Test Singleton 3
        Thread thread1= new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton a=Singleton.getUniqueInstance();
                System.out.println("Memoria Hilo1 : "+a.hashCode());
            }
        });

        Thread thread2= new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton b=Singleton.getUniqueInstance();
                System.out.println("Memoria Hilo2 : "+b.hashCode());
            }
        });
        thread1.start();
        thread2.start();
    }
}
