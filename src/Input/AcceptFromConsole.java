package Input;

import java.util.Scanner;

public class AcceptFromConsole {
    public static String readCommand()
    {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        return inputString;
    }
}
