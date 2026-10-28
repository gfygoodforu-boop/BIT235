import java.util.Scanner;

public class NumberToLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter an integer between 0 and 35: ");
            number = input.nextInt();
        } while (number < 0 || number > 35);

        if (number <= 9) {
            System.out.println("Output: " + number);
        } else {
            char letter = (char) ('A' + number - 10);
            System.out.println("Output: " + letter);
        }
        input.close();
    }
}
