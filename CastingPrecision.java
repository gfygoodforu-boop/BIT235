public class CastingPrecision {
    public static void main(String[] args) {
        double pi = 3.1415926536;
        float piAsFloat = (float) pi;
        System.out.println("double PI: " + pi);
        System.out.println("float PI: " + piAsFloat);

        double amountWithCents = 23.99;
        System.out.println("Amount with cents: " + amountWithCents);

        double amountWithZeroCents = 23.00;
        System.out.println("Amount with zero cents: " + amountWithZeroCents);
    }
}
