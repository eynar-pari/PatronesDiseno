package command.basic;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    // Orquestator de comandos
    private List <ICommand> commandList = new ArrayList<ICommand>();
     //hashmap


    public void setCommand(ICommand command){
        commandList.add(command);
    }

    public void runCommands(){
        for (ICommand command:commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
