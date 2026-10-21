public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 5000.00;
        double rate = 0.04;
        int years = 10;

        double amount = principal * Math.pow(1 + rate, years);
        double interest = amount - principal;

        System.out.printf("Principal: $%.2f%n", principal);
        System.out.printf("Interest rate: %.0f%% per year%n", rate * 100);
        System.out.printf("Time: %d years%n", years);
        System.out.printf("Compound amount: $%.2f%n", amount);
        System.out.printf("Interest earned: $%.2f%n", interest);
    }
}