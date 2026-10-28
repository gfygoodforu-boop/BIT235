public class PerfectSquares {
    public static void main(String[] args) {
        System.out.print("Perfect squares between 1 and 100: ");
        for (int i = 1; i * i <= 100; i++) {
            System.out.print(i * i);
            if (i * i < 100) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
