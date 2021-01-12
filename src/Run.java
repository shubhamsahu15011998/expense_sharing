public class Run {
    public static void main(String[] args) {
        System.out.println("Welcome to Simple Expense Sharing app.!");
        outerLoop:
        while(1) {
            Menu menu = new Menu();
            menu.showMenu();
            int option = menu.acceptChoice();
            switch (option)
            {
                case 0: break outerLoop;
                // More to be added
                default: break;
            }
        }
    }
}
