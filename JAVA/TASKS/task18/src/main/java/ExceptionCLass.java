//Write a code that asks the user for age and that accepts the Integer value.
// Handle the error that is encountered when the users tries to enter a name instead of age

import java.util.Scanner;

public class ExceptionCLass {

public static void main(String[] args) {
    try {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your age");
        int age = input.nextInt();
        System.out.println("thats how old you are");
    } catch (Exception InputMismatchException) {
        System.out.println("You can only enter your age");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println("thats how old you are");

    }
   
}
}
