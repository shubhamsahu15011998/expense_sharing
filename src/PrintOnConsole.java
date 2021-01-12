public class PrintOnConsole {

    public static void noUserRegisteredMessage() {
        System.out.println(" No users have been registered to be able to edit");
    }

    public static void editUserMessage() {
        System.out.println(" Which registered user do you want to edit?");
    }

    public static void phoneNumberDuplicationError() {
        System.out.println("Phone number already registered");
    }

    public static void printWelcomeMessage() {
        System.out.println("Welcome to Simple Expense Sharing app.!");
    }

    public static void printSuccessfulRegister(int id) {
        System.out.println("User registered with id : "+ id + "\n\n\n\n");
    }

    public static void printRetryMessage() {
        System.out.println("Please enter valid Name and Phone number \n\n\n\n");
    }

    public static void printEnterNewUserDetail() {
        System.out.println("To register a new user, please provide their name & phone number separated by a comma");
    }

    public static void printMenu(Menu menu) {
        for(String currentSentence : menu.getMenuItems())
        System.out.print(currentSentence);
    }
    public static void printRegisteredUsers() {
        if(UserAdder.registeredUsers.isEmpty())
            System.out.println("No user have been registered\n\n\n");
        else {
            System.out.println("Current Registered users are: \n");
            for (User currentUser : UserAdder.registeredUsers) {
                System.out.println(currentUser.getId()+" : "+currentUser.getName()+" , "+currentUser.getPhoneNumber());
            }
            System.out.println("\n\n\n");
        }
    }
    
}