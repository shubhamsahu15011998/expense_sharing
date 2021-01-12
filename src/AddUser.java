import java.util.ArrayList;

public class AddUser {
    public static ArrayList<User> registeredUsers = new ArrayList<User>();

    public static int addUser(String name, String phoneNumber){
        registeredUsers.add(new User(registeredUsers.size()+1,name,phoneNumber));
        return registeredUsers.size()+1;
    }
}
