package ejercicios.interpreter_ejercicio3;

public class Client {

    public static void main (String [] args){
       String toInterpretate="como usuario administrador quiero usar el login para ingresar";
       System.out.println("Evaluate : "+toInterpretate+"\nInterpretate : "
               + new Parser(toInterpretate).evaluate());

        String toInterpretate2="como abc quiero cde para fgh ";
        System.out.println("Evaluate : "+toInterpretate2+"\nInterpretate : "
                + new Parser(toInterpretate2).evaluate());
    }
}
