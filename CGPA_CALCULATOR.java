import java.util.Scanner;
public class CGPA_CALCULATOR {
    public static void main(String[] args) {
// Write a program to calculate CGPA using marks of 3 subjects(out of 100).
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks of Subject 1: ");
        float a = sc.nextFloat();
        System.out.println("Enter the Marks of Subject 2: ");
        float b = sc.nextFloat();
        System.out.println("Enter the Marks of Subject 3: ");
        float c = sc.nextFloat();
        float sum = ((a+b+c)*100)/300;
        System.out.println("Your CGPA is " + sum +"cgpa");
    }
}
