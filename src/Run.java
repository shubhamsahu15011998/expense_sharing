import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        System.out.println("Welcome to Simple Expense Sharing app.!");
        boolean valid=true;
        while(valid) {
            Menu menu = new Menu();
            menu.showMenu();
            int option = menu.acceptChoice();
            switch (option)
            {
                case 0:
                    valid=false;
                    break;
                case 1:
                    Scanner sc= new Scanner(System.in);
                    System.out.println("To register a new user, please provide their name & phone number separated by a space");
                    String name= sc.next();
                    String phoneNumber= sc.next();
                    if(DataValidator.validateUserData(name,phoneNumber)) {
                        int id = AddUser.addUser(name, phoneNumber);
                        System.out.println("User registered with id : "+ id + "\n\n\n\n");
                    }else {
                        System.out.println("Please enter valid Name or Phone number \n\n\n\n");
                    }
                    break;
                case 2:
                    ShowUsers.showRegisteredUsers();
                    break;
                // More to be added
                default: break;
            }
        }
    }
}
