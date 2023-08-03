import java.util.Scanner;
public class Greet_With_Name {
  // Write a program which asks the user to enter his/her name and greets them with "Hello<name>, have a good day" text.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        String str = sc.nextLine();
        System.out.println("Hello " + str + ", Have a good day.");
    }
}
