package Repositories;

import Models.User;

import java.util.ArrayList;
import java.util.Optional;

public interface UserRepository {

    Boolean addUser(User user);

    ArrayList<User> getAllRegisteredUsers();

    Optional<User> getUserById(Integer id);

    Optional<User> updateUser(Integer id, String name, String phoneNumber);

    Boolean addPhoneNumberToSet(String phoneNumber);

}
