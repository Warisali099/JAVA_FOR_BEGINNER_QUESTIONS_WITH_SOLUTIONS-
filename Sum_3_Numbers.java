import java.util.Scanner;
public class Sum_3_Numbers {
    public static void main(String[] args) {
      // Write a program to sum 3 numbers in java
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        float a = sc.nextFloat();
        System.out.println("Enter number 2: ");
        float b = sc.nextFloat();
        System.out.println("Enter number 3: ");
        float c = sc.nextFloat();
        float sum = a+b+c;
        System.out.println("The sum of these numbers are: "+sum);
    }
}
