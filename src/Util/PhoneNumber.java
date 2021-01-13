package Util;

import Repositories.UserDataRepository.*;

public class PhoneNumber {
    public static boolean phoneNumberDuplicationCheck(String phoneNumber){
        return RunTimeUserDataRepository.PHONE_NUMBER_SET.contains(phoneNumber);
    }
}
