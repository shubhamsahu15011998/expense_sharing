public class ValidateCredential {
    public static boolean validateData(String name, String phoneNumber){
        if(!name.isEmpty() && !phoneNumber.isEmpty())
            if(phoneNumber.length()==10)
                return true;

        return false;
    }
}
