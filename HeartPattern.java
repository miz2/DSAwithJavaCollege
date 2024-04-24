public class HeartPattern {
    public static void main(String[] args) {
        int range=5;
        for (int i = 2; i <range; i++) {
            for (int space = 1; space < range - i; space++) {
                System.out.print(" ");
            }

            int odd = 2 * i + 1;
            for (int star = 1; star <= odd; star++) {
                System.out.print("*");
            }
            for(int j=0;j<2*range-(2*i-1);j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
