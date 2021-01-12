public class ShowUsers {
    public static void showRegisteredUsers() {
        if(AddUser.registeredUsers.isEmpty())
            System.out.println("No user have been registered\n\n\n");
        else {
            System.out.println("Current Registered users are: \n\n");
            for (User currentUser : AddUser.registeredUsers) {
                System.out.println(currentUser.getId()+" , "+currentUser.getName()+" , "+currentUser.getPhoneNumber());
            }
        }
    }
}