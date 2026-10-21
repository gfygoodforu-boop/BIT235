import java.util.Scanner;

public class DifferenceOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int first = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int second = scanner.nextInt();

        int difference = first - second;

        System.out.println("The difference between " + first + " and " + second + " is: " + difference);

        scanner.close();
    }
}