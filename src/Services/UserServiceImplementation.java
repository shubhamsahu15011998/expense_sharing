package Services;

import Models.User;
import Repositories.UserDataRepository.*;


public class UserServiceImplementation implements UserService{
    public static User createNewUser(String name, String phonenumber) {
        Integer id = RunTimeUserDataRepository.REGISTERED_USER_DATA.size() + 1;
        return new User(id,name,phonenumber);
    }
}
