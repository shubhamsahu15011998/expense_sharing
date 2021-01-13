import Parser.InputParser;
import Util.PrintOnConsole;

import CommandExecutor.*;
import Parser.InputParser.*;
import Input.AcceptFromConsole;

/************************************************************************************
Assumption :

    -> User once Created never get deleted although details of user may change

*************************************************************************************/

public class Run {
    public static void main(String[] args) {
        PrintOnConsole.printWelcomeMessage();
        boolean commandStatus = true;
        while(commandStatus) {
            String input = AcceptFromConsole.readCommand();
            commandStatus = InputParser.parser(input);
        }

        /*int i= scan.nextInt();
        if(i!=0){
            String input = scan.nextLine();
            String input_1 = scan.nextLine();
            String arr[] = input_1.split(", (?![^//[//]]*\\))");
            for(String curr : arr)
                System.out.println(curr);
        }

        else
        while(valid) {
            //Menu menu = new Menu();            // Little doubt of it's positional availability
            String command = Commands.acceptCommand();
            String commandName = Commands.getCommandName(command);
            switch (commandName) {
                case "EXIT":
                    valid = false;
                    break;

                case "ADD_USER":
                    if (CommandValidator.validateAddUserCommand(command)){
                        CommandExecuter.executeAddUserCommand(command);
                    }else {
                        Util.PrintOnConsole.printRetryMessage();
                    }
                    break;

                case "DISPLAY_USER":
                    if (CommandValidator.validateDisplayUserCommand(command)){
                        CommandExecuter.executeDisplayUserCommand();
                    }else {
                        Util.PrintOnConsole.printRetryMessage();
                    }
                    break;

                case "EDIT_USER":
                    if(!repositories.repositories.UserDataRepository.UserDataRepository.registeredUsersData.isEmpty()) {
                        Util.PrintOnConsole.editUserMessage();
                        Util.PrintOnConsole.printRegisteredUsers();
                        Util.PrintOnConsole.printRegisteredUsers();
                        Util.PrintOnConsole.enterId();
                        int id = Input.acceptId();
                        Util.PrintOnConsole.printEnterUpdatedDetail();
                        Input input_3 = new Input();
                        input_3.acceptNameAndPhoneNumber();
                        String name_3 = input_3.getName();
                        String phoneNumber_3 = input_3.getPhoneNumber();
                        System.out.println(repositories.repositories.UserDataRepository.UserDataRepository.registeredUsersData.get(id-1).getPhoneNumber());
                        if(Util.DataValidator.validateName(name_3) && Util.DataValidator.validatePhoneNumber(phoneNumber_3) &&
                           ( (phoneNumber_3.equals(repositories.repositories.UserDataRepository.UserDataRepository.registeredUsersData.get(id-1).getPhoneNumber())) || (!Util.DataValidator.phoneNumberDuplicationCheck(phoneNumber_3)) )
                        ) {
                            repositories.repositories.UserDataRepository.UserDataRepository.registeredUsersData.get(id-1).setName(name_3);
                            repositories.repositories.UserDataRepository.UserDataRepository.registeredUsersData.get(id-1).setPhoneNumber(phoneNumber_3);
                            Util.PrintOnConsole.printSuccessfulUpdated(id);
                        }else {
                            Util.PrintOnConsole.printRetryMessage();
                        }

                    }else{
                        Util.PrintOnConsole.noUserRegisteredMessage();
                    }
                    break;
                case "ADD_EXPENSE":
                    break;
                case "DISPLAY_EXPENSE":
                    break;
                case "EDIT_EXPENSE":
                    break;
                case "DIAPLAY_DEBTS":
                    break;
                case "DELETE_EXPENSE":
                    break;
                    // More to be added
                default: break;
            }*/
    }
}
