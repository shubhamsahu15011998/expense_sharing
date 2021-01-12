public class DataValidator {

    //public static boolean

    public static boolean phoneNumberDuplicationCheck(String phoneNumber) {
        if (UserAdder.phoneNumberSet.contains(phoneNumber)){
            PrintOnConsole.phoneNumberDuplicationError();
            return true;
        }
        return false;
    }

    public static boolean validateUserData(String name, String phoneNumber) {
        if (!name.isEmpty() && !phoneNumber.isEmpty())
            if (phoneNumber.length() == 10)
                if(!phoneNumberDuplicationCheck(phoneNumber))
                    return true;
        return false;
    }
}