package MY_PRACTICE.SQA;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your username:");
        String name = sc.next();

        System.out.print("Enter password:");
        String pass = sc.next();

        String oriUsername = "UUUUUpppakul";
        String oriPassword = "Naaaath";

        if(name != oriUsername) System.out.println("User verified succesfully"); // compare with wrong operator --> needs to use .equals() method

        if(pass == oriPassword) System.out.println("User again verified successfully"); // compare with wrong operator --> needs to use .equals() method

        //
    }
}
