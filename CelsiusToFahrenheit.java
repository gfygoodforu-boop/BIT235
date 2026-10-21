import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in degrees Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 9.0 / 5.0 + 32;

        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");

        scanner.close();
    }
}