package Repositories.UserDataRepository;

import Models.User;
import Repositories.UserRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Optional;

public class RunTimeUserDataRepository implements UserRepository {
    public static ArrayList<User> REGISTERED_USER_DATA = new ArrayList<User>();

    public static HashSet<String> PHONE_NUMBER_SET = new HashSet();

    @Override
    public ArrayList<User> getAllRegisteredUsers() {
        return new ArrayList<User>(REGISTERED_USER_DATA);
    }

    @Override
    public Optional<User> getUserById(Integer id) {
        for(User current_user : REGISTERED_USER_DATA)
            if(current_user.getId()==id)
                return Optional.of(current_user);
        return Optional.empty();
    }

    @Override
    public Optional<User> updateUser(Integer id, String name, String phoneNumber) {
        // Assumption that a User once registered never deleted
        return Optional.empty();
    }

    @Override
    public Boolean addUser(User user) {
        REGISTERED_USER_DATA.add(user);
        return true;
    }

    @Override
    public Boolean addPhoneNumberToSet(String phoneNumber) {
        PHONE_NUMBER_SET.add(phoneNumber);
        return true;
    }
}
