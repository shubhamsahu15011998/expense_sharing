public class ValidateCredential {
    public static boolean validateData(String name, String phoneNumber){
        if(!name.isEmpty() && !phoneNumber.isEmpty())
            if(phoneNumber.length()==10) {
                for(User current : AddUser.registeredUser) {
                    if (current.getPhoneNumber() == phoneNumber)
                        return false;
                }
                return true;
            }
        return false;
    }
}
