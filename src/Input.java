import java.util.Scanner;

public class Input {
    private String name;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static int acceptId()
    {
        int id;
        Scanner scanner = new Scanner(System.in);
        id = scanner.nextInt();
        return id;
    }

    public void takeNameAndPhoneNumber() {
        Scanner scanner = new Scanner(System.in);
        String input[] = scanner.nextLine().split(",");
        if (input.length != 2) {
            PrintOnConsole.printRetryMessage();
        }else{
            name = input[0].trim();
            phoneNumber= input[1].trim();
        }
    }
}
