package strategy.basic;

public class Context {


    private IStrategy strategy;
    private int Attribute1;

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public Context(){
    }

    public void execute(){
        strategy.execute();
    }
}
