package Util;

public class UserDataValidator {


    public static boolean validatePhoneNumber(String phoneNumber){
        if ( phoneNumber.length() == 10 ) {
            for (int index = 0; index < 10; index++) {
                if(phoneNumber.charAt(index) <'0' || phoneNumber.charAt(index)>'9')
                    return false;
            }
            return true;
        }
        return false;
    }

    public static boolean validateName(String name){
        if (!name.isEmpty()) return true;
        return false;
    }

    public static boolean validateUserData(String name, String phoneNumber) {
        if (validateName(name) && validatePhoneNumber(phoneNumber))
            return true;
        return false;
    }
}