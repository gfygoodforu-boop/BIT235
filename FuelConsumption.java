public class FuelConsumption {
    public static void main(String[] args) {
        double tankCapacity = 40.0;
        double normalConsumption = 8.0; // liters per 100 km
        double roughConsumption = normalConsumption * 1.15;

        double normalDistance = (tankCapacity / normalConsumption) * 100;
        double roughDistance = (tankCapacity / roughConsumption) * 100;

        System.out.printf("Distance on normal roads: %.2f km%n", normalDistance);
        System.out.printf("Distance on rough roads: %.2f km%n", roughDistance);
    }
}