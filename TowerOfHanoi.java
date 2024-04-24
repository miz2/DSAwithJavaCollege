public class TowerOfHanoi {
    static void hanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("Transfer b "+n+" from "+src+" to "+dest);
            return;
        }
        // n-1 from src to helper using dest as helper
        hanoi(n-1, src, dest, helper);
        System.out.println("Transfer "+n+" from "+src+" to "+dest);
        hanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n=4;
        hanoi(n, "S", "H", "D");
    }
}
