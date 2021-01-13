package CommandExecutor;

import Models.User;
import Util.*;
import Repositories.UserDataRepository.*;

import java.util.ArrayList;


public class displayUser implements ExecuteCommand{
    @Override
    public boolean validateCommand(String[] commandParts) {
        return commandParts.length==3;
    }

    @Override
    public boolean executeCommand(String[] commandParts) {
        RunTimeUserDataRepository obj_ = new RunTimeUserDataRepository();
        ArrayList<User> allUser = obj_.getAllRegisteredUsers();
        return false;
    }

    @Override
    public void showFailed() {
        PrintOnConsole.noUserRegisteredMessage();
    }
}
