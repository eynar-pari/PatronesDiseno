package proxy.basic;

public class Proxy implements ISubject {
    private String attribute;
    private RealSubject realSubject;

    public Proxy (String attribute1){
        this.attribute= attribute1;
        realSubject = new RealSubject(attribute);
    }

    @Override
    public void request() {

        //some conditions //filters
        if (attribute.contains("filter")) {
            this.realSubject.request();
        }else{
            System.out.println("blocked");
        }


    }
}
