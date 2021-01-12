public class DataValidator {

    //public static boolean

    public static boolean phoneNumberDuplicationCheck(String phoneNumber) {
        if (UserAdder.phoneNumberSet.contains(phoneNumber)){
            PrintOnConsole.phoneNumberDuplicationError();
            return true;
        }
        return false;
    }

    public static boolean validatePhoneNumber(String phoneNumber){
        if ( phoneNumber.length() == 10 )
            return true;
        return false;
    }

    public static boolean validateName(String name){
        if (!name.isEmpty()) return true;
        return false;
    }
    public static boolean validateUserData(String name, String phoneNumber) {
        if (validateName(name) && validatePhoneNumber(phoneNumber) && !phoneNumberDuplicationCheck(phoneNumber))
            return true;
        return false;
    }
}