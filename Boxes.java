public class Boxes {
    private int size;

    // Constructor
    public Boxes(int size) {
        setSize(size);
    }

    // Set the size of the box (minimum 2, maximum 10)
    public void setSize(int size) {
        if (size < 2 || size > 10) {
            throw new IllegalArgumentException("Box size must be between 2 and 10.");
        }
        this.size = size;
    }

    // Return the box size as a String
    @Override
    public String toString() {
        return size + " x " + size;
    }

    // Draw the square box on the console
    public void draw() {
        System.out.println("Box size: " + this);

        for (int row = 0; row < size; row++) {
            if (row == 0 || row == size - 1) {
                for (int col = 0; col < size; col++) {
                    System.out.print("-");
                }
            } else {
                System.out.print("|");
                for (int col = 0; col < size - 2; col++) {
                    System.out.print(" ");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
