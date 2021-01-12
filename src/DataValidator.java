public class DataValidator { // user data validator
    public static boolean validateUserData(String name, String phoneNumber){
        if(!name.isEmpty() && !phoneNumber.isEmpty())
            if(phoneNumber.length()==10) {

                for(User current : AddUser.registeredUsers) {
                    if (current.getPhoneNumber() == phoneNumber)
                        return false;
                }
                return true;
            }
        return false;
    }
}
