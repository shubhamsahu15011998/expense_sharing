public class Run {
    public static void main(String[] args) {
        PrintOnConsole.printWelcomeMessage();
        boolean valid = true;
        while(valid) {
            Menu menu = new Menu();            // Little doubt of it's positional availability
            PrintOnConsole.printMenu(menu);
            String option = menu.acceptChoice();
            switch (option)
            {
                case "0":
                    valid=false;
                    break;

                case "1":
                    PrintOnConsole.printEnterNewUserDetail();
                    Input input_1 = new Input();
                    input_1.takeNameAndPhoneNumber();
                    String name_1 = input_1.getName();
                    String phoneNumber_1 = input_1.getPhoneNumber();
                    if(DataValidator.validateUserData(name_1,phoneNumber_1)) {
                        int id = UserAdder.addUser(name_1, phoneNumber_1);
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
                        PrintOnConsole.enterId();
                        int id = Input.acceptId();
                        PrintOnConsole.printEnterUpdatedDetail();
                        Input input_3 = new Input();
                        input_3.takeNameAndPhoneNumber();
                        String name_3 = input_3.getName();
                        String phoneNumber_3 = input_3.getPhoneNumber();
                        System.out.println(UserAdder.registeredUsers.get(id-1).getPhoneNumber());
                        if(DataValidator.validateName(name_3) && DataValidator.validatePhoneNumber(phoneNumber_3) &&
                           ( (phoneNumber_3.equals(UserAdder.registeredUsers.get(id-1).getPhoneNumber())) || (!DataValidator.phoneNumberDuplicationCheck(phoneNumber_3)) )
                        ) {
                            UserAdder.registeredUsers.get(id-1).setName(name_3);
                            UserAdder.registeredUsers.get(id-1).setPhoneNumber(phoneNumber_3);
                            PrintOnConsole.printSuccessfulUpdated(id);
                        }else {
                            PrintOnConsole.printRetryMessage();
                        }

                    }else{
                        PrintOnConsole.noUserRegisteredMessage();
                    }
                    break;
                case "4":
                    break;
                // More to be added
                default: break;
            }
        }
    }
}
