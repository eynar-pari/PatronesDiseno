package builder.basic;

public class Computadora {

    private String attribute1="";
    private String attribute2="";
    private String attribute3="";

    public Computadora(){
        attribute1="core2";
    }

    public Computadora(String type){
        attribute1=type;
    }

    public void i3Computadora(){
        attribute1="i3";
    }

    public void i5Computadora(){
        attribute1="i5";
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }
}
