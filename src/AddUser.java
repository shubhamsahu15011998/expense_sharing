import java.util.ArrayList;

public class AddUser {
    public static ArrayList<User> registeredUser= new ArrayList<User>();

    public static void addUser(String name, String phoneNumber){
        registeredUser.add(new User(registeredUser.size()+1,name,phoneNumber));
    }
    // Initialize an ArrayList with add()
        //gfg.add("Geeks");
        //gfg.add("for");
        //gfg.add("Geeks");
}
