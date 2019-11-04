package ejercicios7.proxy;

public class Server implements IServer {


    public Server(){

    }

    @Override
    public void load(File file) {
        System.out.println("Loading "+file.getNameFile()+"."+file.getExtention());
    }

    @Override
    public void download(File file) {
        System.out.println("Downloading "+file.getNameFile()+"."+file.getExtention());
    }
}
