package ejercicios.interpreter_ejercicio3;

public class TerminalExpressionQuiero extends AbstractExpresion {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("quiero")) {
            context.output = context.output + "when ";
            context.input= context.input.substring(7);
        }
    }
}
