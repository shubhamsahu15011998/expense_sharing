package Parser;


import CommandExecutor.ExecuteCommand;
import CommandExecutor.addUserCommand;
import Util.PrintOnConsole;

public class InputParser {

    public static String[] splitCommand(String input)
    {
        String[] command = input.split("[(, )]" );
        return command;
    }

    public static boolean parser(String input)
    {
        String commandParts[] = splitCommand(input);
        String commandName = commandParts[0];
        ExecuteCommand executor;
        switch(commandName){
            case "ADD_USER":
                 executor = new addUserCommand();
                break;


            case "EXIT":
                return false;
            default:
                executor = null;
                PrintOnConsole.commandNotRecognised();
                break;
        }
        if(executor!=null) {
            if(executor.validateCommand(commandParts)){
                executor.executeCommand(commandParts);
            }
            else{
                executor.showFailed();
            }
        }return true;
    }
}
