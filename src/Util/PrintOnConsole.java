package Util;

import Models.User;

import java.util.ArrayList;

public class PrintOnConsole {

    public static void printWelcomeMessage() {
        System.out.println("Welcome to Simple Models.Expense Sharing app.!");
    }

    public static void invalidDataFormat(){
        System.out.println("Input data format is incorrect with respect to the Command");
    }

    public static void phoneNumberDuplicationError() {
        System.out.println("Phone number already registered");
    }

    public static void noUserRegisteredMessage() {
        System.out.println(" No users have been registered to be able to edit");
    }

    public static void printSuccessfulRegister(int id) {
        System.out.println("Models.User registered with id : "+ id + "\n\n\n\n");
    }
    public static void printSuccessfulUpdated(int id) {
        System.out.println("Models.User successfully updated with id : "+ id + "\n\n\n\n");
    }

    public static void invalidUsernameOrPhonenumber() {
        System.out.println("Please enter valid Name and Phone number \n\n\n\n");
    }

    public static void printEnterNewUserDetail() {
        System.out.println("To register a new user, please provide their name & phone number separated by a comma");
    }

    public static void  commandNotRecognised() {
        System.out.println("The Command you entered is not recognised \n Please retry");
    }

    public static void printRegisteredUsers(ArrayList<User> allUser) {
        if(allUser.isEmpty())
            System.out.println("No user have been registered\n\n\n");
        else {
            System.out.println("Current Registered users are: \n");
            for (User currentUser : allUser) {
                System.out.println(currentUser.getId()+" : "+currentUser.getName()+", "+currentUser.getPhoneNumber());
            }
            System.out.println("\n\n\n");
        }
    }
    
}