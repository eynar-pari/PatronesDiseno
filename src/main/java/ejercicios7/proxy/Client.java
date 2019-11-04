package ejercicios7.proxy;

public class Client {

    public static void main (String [] args){
        // create proxy
        File fileZip=new File("youtube","zip");
        File fileRar=new File("youtube2","rar");
        File fileDoc=new File("youtube2","doc");

        IServer proxy = new Proxy();

        proxy.load(fileZip);
        proxy.download(fileZip);

        proxy.load(fileRar);
        proxy.download(fileRar);

        proxy.load(fileDoc);
        proxy.download(fileDoc);
    }
}

