package singleton.basic;

public class Singleton2 {

    private static final Singleton2 instance = new Singleton2();

    private Singleton2() {
        System.out.println("Creating draft.Singleton");
    }

    public static Singleton2 getUniqueInstance() {
        return instance;
    }

    public void myInstance() {
        System.out.println("Using draft.Singleton");
    }

}
