import java.util.Scanner;
public class Menu {

    private String choice;

    private String[] menuItems;

    public Menu()
    {
        menuItems = new String[] {
                "Please choose your next action from the list   \n",
                "0. Enter 0 to exit   \n",
                "1. Register a new user   \n",
                "2. Display all registered users   \n",
                "3. Edit an already added user   \n",
                "4. Add a new expense   \n",
                "5. Display all added expenses   \n",
                "6. Edit an already existing expense   \n",
                "7. Delete an expense   \n",
                "8. Display debts   \n",
                "\n Enter your choice : \n"
        };
    }

    public String[] getMenuItems() {
        return menuItems;
    }

    public String acceptChoice()
    {
        Scanner scan = new Scanner(System.in);
        choice = scan.nextLine();
        choice.trim();
        return choice;
    }

}
