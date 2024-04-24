public class HollowPattern {
    public static void main(String[] args) {
        int range = 5;

        // prints the upper half 
        for (int i = 1; i <= range; i++) {
            // prints stars
            for (int j = range; j >= i; j--) {
                System.out.print("*");
            }

            // prints spaces
            for (int j = 1; j <= 2 * i - 2; j++) {
                System.out.print(" ");
            }

            // prints stars again
            for (int j = range; j >= i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

        // lower half 
        for (int i = 1; i <= range; i++) {
            // prints stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // prints spaces
            for (int j = 1; j <= 2 * (range - i); j++) {
                System.out.print(" ");
            }

            // prints stars again
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
