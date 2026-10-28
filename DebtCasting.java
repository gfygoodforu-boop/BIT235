public class DebtCasting {
    public static void main(String[] args) {
        // U.S. total public debt, whole-dollar amount, as of 2026-10-26.
        long nationalDebt = 40_528_358_939_415L;
        int debtAsInt = (int) nationalDebt;
        System.out.println("National debt (long): $" + nationalDebt);
        System.out.println("National debt cast to int: " + debtAsInt);

        double debtAsDouble = 40_528_358_939_415.85;
        byte debtAsByte = (byte) debtAsDouble;
        System.out.println("National debt (double): $" + debtAsDouble);
        System.out.println("National debt cast to byte: " + debtAsByte);
    }
}
