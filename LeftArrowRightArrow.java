public class LeftArrowRightArrow {
    public static void main(String[] args) {
        int range = 5;

        // Upper half
        for (int i = 1; i <=range; i++) {
            for (int j = 1; j <= range - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = i; j <=range; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
       for(int i=1;i<=range;i++){
        for(int j=1;j<i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
       }
    }
}
