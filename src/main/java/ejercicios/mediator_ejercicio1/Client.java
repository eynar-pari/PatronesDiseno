package ejercicios.mediator_ejercicio1;

public class Client {

    public static void main (String [] args){
        SalaChat mediator = new SalaChat();

        DeveloperFronEnd colleague1 = new DeveloperFronEnd(mediator,"JOSE");
        DeveloperFronEnd colleague2 = new DeveloperFronEnd(mediator,"ANA");
        DeveloperBackEnd colleague3 = new DeveloperBackEnd(mediator,"MARIA");
        DeveloperBackEnd colleague4 = new DeveloperBackEnd(mediator,"JUAN");

        mediator.setDeveloperBackend(colleague3);
        mediator.setDeveloperBackend(colleague4);
        mediator.setDeveloperFrontEnd(colleague1);
        mediator.setDeveloperFrontEnd(colleague2);

        colleague1.send("mensaje 1 - pregunta",colleague2) ;
        colleague2.send("mensaje 2 - respuesta",colleague3);
        colleague1.send("mensaje 3 - pregunta",colleague4) ;

        colleague1.sendAll("Mensaje to ALL");

    }
}
