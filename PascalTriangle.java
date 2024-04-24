public class PascalTriangle {
    public static void main(String[] args) {
        int range=7;
        int mid=range/2;
        int starts=1;
        for(int i=1;i<=range;i++){
            for(int j=1;j<=starts;j++){
                System.out.print("*");
            }
            if(i<mid){
                starts++;
            }
            else{
                starts--;
            }System.out.println();
        }
        int start=1;
        int newMid=range/2;
        int space=newMid;
        for(int i=1;i<=range;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=start;j++){
                System.out.print("*");
            }
            if(i<newMid){
                start++;
                space--;
            }
            else{
                start--;
                space++;
            }System.out.println();
        }
    }
}
