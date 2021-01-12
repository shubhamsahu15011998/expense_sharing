import java.util.Scanner;

public class Menu {

    private int choice;

    public void showMenu(){
        System.out.println("Please choose your next action from the list ");
        System.out.println("0. Enter 0 to exit ");
        System.out.println("1. Register a new user ");
        System.out.println("2. Display all registered users ");
        System.out.println("3. Edit an already added user ");
        System.out.println("4. Add a new expense ");
        System.out.println("5. Display all added expenses ");
        System.out.println("6. Edit an already existing expense ");
        System.out.println("7. Delete an expense ");
        System.out.println("8. Display debts ");
        System.out.println("\n Enter your choice : ");
    }

    public int acceptChoice()
    {
        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();
        return choice;
    }

}
