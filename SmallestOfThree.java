import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double first = input.nextDouble();
        double second = input.nextDouble();
        double third = input.nextDouble();

        double smallest = Math.min(first, Math.min(second, third));
        System.out.print("Smallest number(s):");
        if (first == smallest) {
            System.out.print(" " + first);
        }
        if (second == smallest) {
            System.out.print(" " + second);
        }
        if (third == smallest) {
            System.out.print(" " + third);
        }
        System.out.println();
        input.close();
    }
}
