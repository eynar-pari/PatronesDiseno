package ejercicios.interpreter_ejercicio3;

public class TerminalExpressionPara extends AbstractExpresion {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("para")) {
            context.output = context.output + "then ";
            context.input= context.input.substring(5);
        }
    }
}
