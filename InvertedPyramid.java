public class InvertedPyramid {
    public static void main(String[] args) {
        int range=5;
        for(int i=1;i<=range;i++){
            // space loop
            for(int j=0;j<i;j++){
                System.out.print("k");
            }
            // in reverse order :as in inner loop
            for(int j=0;j<(range*2-(2*i-1));j++){
                System.out.print("*");
            }
            System.out.println();
        }
         range = 5;
         for (int i = range; i >= 1; i--) {
            // print spaces
            for (int j = 1; j <= range - i; j++) {
                System.out.print(" ");
            }
            // print stars or spaces
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == range) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
