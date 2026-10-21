import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String first = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String second = scanner.nextLine();

        boolean stringsEqual = first.equals(second);
        System.out.println("The two given strings are equal: " + stringsEqual);

        if (first.length() > 0 && second.length() > 0) {
            boolean firstCharactersEqual = first.charAt(0) == second.charAt(0);
            System.out.println("The first characters are equal: " + firstCharactersEqual);
        } else {
            System.out.println("Cannot compare first characters because at least one string is empty.");
        }

        scanner.close();
    }
}