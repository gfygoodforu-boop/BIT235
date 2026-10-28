class SwitchDemo {
    public static void main(String[] args) {
        int x;
        x = (int)(1 + Math.random() * 6);

        switch (x) {
            case 1:
                System.out.println("Apples");
                break;

            case 2:
                System.out.println("Oranges");
                break;

            case 3:
                System.out.println("Bananas");
                break;

            case 4:
                System.out.println("Kiwi");
                break;

            case 5:
                System.out.println("Grapes");
                break;

            case 6:
                System.out.println("Cherries");
                break;

            default:
                System.out.println("Invalid selection");
                break;
        }
    }
}