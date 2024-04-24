public class DiagonalPattern {
    public static void main(String[] args) {
        int range=7;
        int totalSpaces=range-1;
        for(int i=1;i<=range-1;i++){
            // space
            for(int j=0;j<=totalSpaces;j++){
                System.out.print(" ");
            }
            // need just one star
            System.out.println("*");
            totalSpaces--;
        }

        // cross diagonal
        int totalSpace=1;
        for(int i=1;i<=range-1;i++){
            // space
            for(int j=0;j<=totalSpace;j++){
                System.out.print(" ");
            }
            // need just one star
            System.out.println("*");
            totalSpace++;
        }
    }
}
