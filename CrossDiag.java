public class CrossDiag {
    public static void main(String[] args) {
        int range = 5;
        for (int i = 1; i <= range; i++) {
            for (int j = 1; j <= range; j++) {
                if (i == j || i + j == range + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
