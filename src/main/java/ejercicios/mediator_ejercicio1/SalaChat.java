package ejercicios.mediator_ejercicio1;

import java.util.HashMap;

public class SalaChat implements IChat {

    private HashMap<String,Developer> lista = new HashMap<>();

    public void setDeveloperBackend(DeveloperBackEnd dev){
        lista.put(dev.getName(),dev);
    }

    public void setDeveloperFrontEnd(DeveloperFronEnd dev){
        lista.put(dev.getName(),dev);
    }

    @Override
    public void send(String msg, Developer from , Developer to) {
        lista.get(to.getName()).messageReceived(msg,from);
    }

    @Override
    public void sendAll(String msg, Developer from) {
        for (String name:lista.keySet() ) {
            if (!name.equals(from.getName())){
                this.send(msg,lista.get(from.getName()),lista.get(name));
            }
        }
    }

}
