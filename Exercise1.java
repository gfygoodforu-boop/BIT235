import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour;
        do {
            System.out.print("Enter an hour between 1 and 24: ");
            hour = input.nextInt();
        } while (hour < 1 || hour > 24);

        if (hour < 18) {
            System.out.println("Good day");
        } else {
            System.out.println("Good evening");
        }

        System.out.print("Multiples of 5 from 10 to 95: ");
        int multiple = 10;
        while (multiple <= 95) {
            System.out.print(multiple);
            if (multiple < 95) {
                System.out.print(", ");
            }
            multiple += 5;
        }
        System.out.println();

        int number = 1;
        int sum = 0;
        while (number <= 10) {
            sum += number;
            number++;
        }
        System.out.println("Sum of 1 to 10: " + sum);
        input.close();
    }
}
