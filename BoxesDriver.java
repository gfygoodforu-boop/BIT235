public class BoxesDriver {
    public static void main(String[] args) {
        // Create and draw a 5 x 5 box
        Boxes box = new Boxes(5);
        box.draw();

        System.out.println();

        // Change the same box to 8 x 8 and draw it again
        box.setSize(8);
        box.draw();
    }
}
