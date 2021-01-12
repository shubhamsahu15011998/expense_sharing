import java.util.ArrayList;
import java.util.HashSet;

public class UserAdder {
    public static ArrayList<User> registeredUsers = new ArrayList<User>();

    public static HashSet<String> phoneNumberSet = new HashSet();

    public static int addUser(String name, String phoneNumber){
        registeredUsers.add(new User(registeredUsers.size()+1,name,phoneNumber));
        addPhoneNumberToSet(phoneNumber);
        return registeredUsers.size();
    }

    public static void addPhoneNumberToSet(String phoneNumber)
    {
        phoneNumberSet.add(phoneNumber);
    }

}
