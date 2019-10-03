package ejercicios.mediator_ejercicio1;

public abstract class Developer {

    private String name;
    protected IChat mediator;

    public Developer(IChat mediator, String name){
        this.mediator = mediator; this.name= name;
    }

    public abstract void sendAll(String msg);
    public abstract void send(String msg,Developer to);
    public abstract void messageReceived (String msg, Developer from);

    public String getName() {
        return name;
    }

    public void setName(String name){this.name=name;}
}
