package ejercicios7.proxy;

public class Proxy implements IServer {

    private Server serverPrimary;
    private Server serverSecondary;
    public Proxy (){
        serverPrimary= new Server();
        serverSecondary= new Server();
    }

    @Override
    public void load(File file) {
        if (file.getExtention().equals("zip") || file.getExtention().equals("rar")){
            System.out.println("Saving Server1");
            serverPrimary.load(file);
            System.out.println("Saving Server2");
            serverSecondary.load(file);
        } else{
            System.out.println("Load : Archivo no permitido");
        }

   }

    @Override
    public void download(File file) {
        if (file.getExtention().equals("zip") || file.getExtention().equals("rar")){
            System.out.println("Saving Server1");
            serverPrimary.download(file);
            System.out.println("Saving Server2");
            serverSecondary.download(file);
        } else{
            System.out.println("Download : Archivo no permitido");
        }
    }
}
