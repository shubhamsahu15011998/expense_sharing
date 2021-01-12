import java.util.Scanner;


public class Run {
    public static void main(String[] args) {
        PrintOnConsole.printWelcomeMessage();
        boolean valid = true;
        while(valid) {
            Menu menu = new Menu();            // Little doubt of it's positional availability
            PrintOnConsole.printMenu(menu);
            String option = menu.acceptChoice();
//            Scanner sc= new Scanner(System.in);
//            String name_= sc.nextLine();
//            System.out.println(name_);
            switch (option)
            {
                case "0":
                    valid=false;
                    break;

                case "1":
                    PrintOnConsole.printEnterNewUserDetail();
                    Input input = new Input();
                    input.takeNamePhonenumber();
                    String name = input.getName();
                    String phoneNumber = input.getPhoneNumber();
                    if(DataValidator.validateUserData(name,phoneNumber)) {
                        int id = UserAdder.addUser(name, phoneNumber);
                        PrintOnConsole.printSuccessfulRegister(id);
                    }else {
                        PrintOnConsole.printRetryMessage();
                    }
                    break;

                case "2":
                    PrintOnConsole.printRegisteredUsers();
                    break;

                case "3":
                    if(!UserAdder.registeredUsers.isEmpty()) {
                        PrintOnConsole.editUserMessage();
                        PrintOnConsole.printRegisteredUsers();
                    }else{
                        PrintOnConsole.noUserRegisteredMessage();
                    }
                    break;
                // More to be added
                default: break;
            }
        }
    }
}
