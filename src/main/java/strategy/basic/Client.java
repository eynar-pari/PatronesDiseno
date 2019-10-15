package strategy.basic;

public class Client {

    public static void main(String[] args){
        Context context = new Context();
        context.setStrategy(new StrategyConcrete1());
        context.execute();

    }
}
