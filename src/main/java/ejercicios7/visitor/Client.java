package ejercicios7.visitor;

public class Client {

    public static void main (String []args){
        Perro perrito = new Perro();
        perrito.setTipoEnfermedad(1);
        Gato gatito = new Gato();
        gatito.setTipoEnfermedad(2);
        Caballo caballito = new Caballo();
        caballito.setTipoEnfermedad(2);

        Veterinario veterinarioVisitor= new Veterinario();

        perrito.accept(veterinarioVisitor);
        gatito.accept(veterinarioVisitor);
        caballito.accept(veterinarioVisitor);


    }
}
