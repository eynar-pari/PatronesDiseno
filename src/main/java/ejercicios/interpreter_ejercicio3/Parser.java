package ejercicios.interpreter_ejercicio3;

import java.util.ArrayList;

public class Parser {
    // no terminal expresion
    private ArrayList<AbstractExpresion> parseTree = new ArrayList<AbstractExpresion>();
    private Context context;
    public Parser(String s) {
        context= new Context(s+" ");
        for (String token : s.split(" ")) {
           switch (token.toLowerCase()){
               case "como":
                   parseTree.add(new TerminalExpressionComo());
                   break;
               case "quiero":
                   parseTree.add(new TerminalExpressionQuiero());
                   break;
               case "para":
                   parseTree.add(new TerminalExpressionPara());
                   break;
               default:
                   parseTree.add(new TerminalExpressionOther());
                   break;
           }
        }
    }

    public String evaluate() {
        for (AbstractExpresion e : parseTree)
            e.interpreter(context);
        return context.output;
    }
}
