package proxy.example;

public class Proxy implements IServer {
    private Request request;
    private Server realSubject = null;

    public Proxy (Request request){
        this.request= request;

    }

    @Override
    public void request() {

        if (realSubject == null)
            realSubject = new Server(request);

        //some conditions //filters
        if (request.getPort()== 80) {
            this.realSubject.request();
        }else{
            System.out.println("please use the port : 80");
        }
    }
}
