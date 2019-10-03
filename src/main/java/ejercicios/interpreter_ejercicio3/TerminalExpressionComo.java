package ejercicios.interpreter_ejercicio3;

public class TerminalExpressionComo extends AbstractExpresion {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("como")) {
            context.output = context.output + "given " ;
            context.input= context.input.substring(5); // Elimina caracter interpretado + space
        }
    }
}
