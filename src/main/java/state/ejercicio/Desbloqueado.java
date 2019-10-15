package state.ejercicio;

public class Desbloqueado implements IStateCelular
{


    public void handle()
    {
        llamar();
        jugar();
        foto();
    }

    private void llamar(){
        System.out.println("puede llamar");
    }

    private void jugar(){
        System.out.println("puede jugar");
    }

    private void foto(){
        System.out.println("puede sacar foto");
    }


}
