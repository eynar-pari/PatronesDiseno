package singleton.basic;

public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
        System.out.println("Creating draft.Singleton");
    }

    public static synchronized Singleton getUniqueInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    public void myInstance() {
        System.out.println("Using draft.Singleton");
    }

    public void destroyInstance() {
        instance = null;
    }
}
