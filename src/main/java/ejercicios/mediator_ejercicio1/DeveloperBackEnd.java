package ejercicios.mediator_ejercicio1;

public class DeveloperBackEnd extends Developer {
    public DeveloperBackEnd(IChat mediator, String name){
        super(mediator,name);
    }

    @Override
    public void send(String msg, Developer to) {
        mediator.send(msg,this,to);
    }

    public void sendAll(String msg) {
        mediator.sendAll(msg,this);
    }
    @Override
    public void messageReceived(String msg , Developer from) {
        System.out.println("BackEnd "+getName()+" recibe message : "+msg+ " >>> from : "+from.getName());
    }
}
