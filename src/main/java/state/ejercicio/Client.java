package state.ejercicio;

public class Client {
    public static void main( String arg[] ) throws InterruptedException {
            IStateCelular stateDesbloqueado = new Desbloqueado();
            Celular context = new Celular();
            context.setState( stateDesbloqueado );
            context.request();

            Bloqueado bloqueado = new Bloqueado();
            bloqueado.enterPassword(123);  // incorrect pwd
            context.setState(bloqueado);
            context.request();
            context.setState(bloqueado);
            context.request();
            context.setState(bloqueado);
            context.request();   // bloqueado por 15 segundos
            context.setState(bloqueado);
            context.request();
            context.setState(bloqueado);
            context.request();
            context.setState(bloqueado);
            context.request();
            Thread.sleep(5000);
            context.setState(bloqueado);
            context.request();
            Thread.sleep(7000);
            context.setState(bloqueado);
            context.request();
            context.setState(bloqueado);
            context.request();
            bloqueado.enterPassword(bloqueado.getPassword());
            context.setState(bloqueado);
            context.request(); // enviando correcto pwd
            bloqueado.enterPassword(555);
            context.setState(bloqueado);
            context.request(); // enviando incorrecto pwd , el counter deberia ser 0 nuevamente
            context.setState(bloqueado);
            context.request();
            context.setState(bloqueado);
            context.request();

    }
}
