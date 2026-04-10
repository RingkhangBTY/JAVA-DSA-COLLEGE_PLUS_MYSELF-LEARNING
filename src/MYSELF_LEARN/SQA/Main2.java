package MYSELF_LEARN.SQA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public List<User> userDetails = new ArrayList<>();

    public Main2() {
        userDetails.add(new User("alice", "1234"));
        userDetails.add(new User("bob", "pass"));
        userDetails.add(new User("charlie", "char123"));
        userDetails.add(new User("david", "david@123"));
        userDetails.add(new User("eva", "eva123"));
        userDetails.add(new User("frank", "frank1"));
        userDetails.add(new User("grace", "grace@1"));
        userDetails.add(new User("henry", "henry123"));
        userDetails.add(new User("irene", "irene@123"));
        userDetails.add(new User("jack", "jack123"));
    }

    public boolean validateUser(String username, String password) {

        for (User user : userDetails) {

            if (user.getPassword() == username && user.getUsername().equals(password)) { // username is compared with password and vice versa
                return true;
            }

        }

        return true ; // needs to return false else it will return true for any inputs.
    }

    public static void main(String[] args) {
        Main2 obj = new Main2();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
//        sc.nextInt();  // value not stored in any variable
        String pass = sc.nextLine();

        boolean isValid = obj.validateUser(pass, username); // position of arguments is wrong

        System.out.println("User valid: " + isValid);
    }
}
