import java.util.Scanner;
public class KM_TO_MILES {
    public static void main(String[] args) {
      // Write a java program to convert kilometers to miles.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value in Kilometers");
        double a = sc.nextDouble();
        double sum = a*0.621;
        System.out.println("The Value in Miles is " +sum + " Miles");
    }
}
