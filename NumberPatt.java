public class NumberPatt {
    public static void main(String[] args) {
        int range=5;
        for(int i=1;i<=range;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=i*2;j<range*2;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
