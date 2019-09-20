package singleton.basic;

public class Singleton3 implements Cloneable {
    private static Singleton3 instance = null;

    private Singleton3() {
        System.out.println("Creating draft.Singleton");
    }

    // Multithreading and synchronization for concurrency
    private synchronized static void makeInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
    }

    public static Singleton3 getUniqueInstance() {
        if (instance == null) makeInstance();
        return instance;
    }

    public void myInstance() {
        System.out.println("Using draft.Singleton");
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}