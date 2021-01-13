package CommandExecutor;

import Models.*;
import Services.UserServiceImplementation;
import Util.*;
import Repositories.UserDataRepository.*;

public class addUserCommand implements ExecuteCommand{

    @Override
    public boolean validateCommand(String[] commandParts) {
        String name = commandParts[0];
        String phoneNumber = commandParts[1];
        return commandParts.length==3;
    }

    @Override
    public boolean executeCommand(String[] commandParts) {
        String name = commandParts[1];
        String phoneNumber = commandParts[2];
        if( UserDataValidator.validateUserData(name, phoneNumber)) {
            if (PhoneNumber.phoneNumberDuplicationCheck(phoneNumber)) {
                User newUser = UserServiceImplementation.createNewUser(name,phoneNumber);
                RunTimeUserDataRepository obj = new RunTimeUserDataRepository();
                obj.addUser(newUser);
                obj.addPhoneNumberToSet(phoneNumber);
                PrintOnConsole.printSuccessfulRegister(newUser.getId());
            }
            else PrintOnConsole.phoneNumberDuplicationError();
        }
        else PrintOnConsole.invalidUsernameOrPhonenumber();
        return true;
    }

    @Override
    public void showFailed() {
        PrintOnConsole.invalidDataFormat();
    }
}
