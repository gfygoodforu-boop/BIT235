import java.util.Scanner;
public class FramingCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length;
        do {
            System.out.print("Enter picture length in inches: ");
            length = input.nextDouble();
        } while (length <= 0);
        double width;
        do {
            System.out.print("Enter picture width in inches: ");
            width = input.nextDouble();
        } while (width <= 0);
        input.nextLine(); // Consume the remaining newline.
        String frameType;
        do {
            System.out.print("Enter frame type (regular/fancy): ");
            frameType = input.nextLine().trim().toLowerCase();
            if (!frameType.equals("regular") && !frameType.equals("fancy")) {
                System.out.println("Please enter regular or fancy.");
            }
        } while (!frameType.equals("regular") && !frameType.equals("fancy"));
        System.out.print("Enter frame colour (enter white for no colouring charge): ");
        String colour = input.nextLine().trim();
        String addCrowns;
        do {
            System.out.print("Add crowns? (yes/no): ");
            addCrowns = input.nextLine().trim().toLowerCase();
        } while (!addCrowns.equals("yes") && !addCrowns.equals("y")
                && !addCrowns.equals("no") && !addCrowns.equals("n"));
        int crownCount = 0;
        if (addCrowns.equals("yes") || addCrowns.equals("y")) {
            do {
                System.out.print("How many crowns (0 or more): ");
                crownCount = input.nextInt();
            } while (crownCount < 0);
        }
        // Per-inch charges use the picture perimeter: 2 x (length + width).
        double perimeter = 2 * (length + width);
        double frameRate = frameType.equals("regular") ? 0.15 : 0.25;
        double frameCost = perimeter * frameRate;
        double colouringCost = colour.equalsIgnoreCase("white") ? 0.0 : perimeter * 0.10;
        double crownsCost = crownCount * 0.35;
        double totalCost = frameCost + colouringCost + crownsCost;
        System.out.printf("Frame perimeter: %.2f inches%n", perimeter);
        System.out.printf("Frame cost: $%.2f%n", frameCost);
        System.out.printf("Colouring cost: $%.2f%n", colouringCost);
        System.out.printf("Crowns cost: $%.2f%n", crownsCost);
        System.out.printf("Total framing cost: $%.2f%n", totalCost);
        input.close();
    }
}
