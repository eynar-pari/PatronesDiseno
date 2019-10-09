package command.basic;

public class Receiver {
    // Objeto con donde se encuntra la logica y sacamos los comandos/operacion concretas
    private String attribute1= "default";
    private int attribute2=100;

    public void operation1()
    {
        System.out.println("[COMMAND ---> Operacion 1] "+attribute1+" "+attribute2);
    }

    public void operation2()
    {
        System.out.println("[COMMAND ---> Operacion 2] "+attribute1+" "+attribute2);
    }
}
