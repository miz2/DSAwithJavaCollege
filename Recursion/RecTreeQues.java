package Recursion;

public class RecTreeQues {
    static int fibbonaci(int n){
        if(n<=1){
            return n;
        }
        int ft=fibbonaci(n-1);
       int st= fibbonaci(n-2);
       return ft+st;
    }
    static int climbStairs(int n){
        if(n<=1){
            return 1;
        }
        int c1=climbStairs(n-1);
        int c2=climbStairs(n-2);
        return c1+c2;
    }
    static int ropeCut(int ropeLen, int a, int b, int c) {
        if (ropeLen < 0) {
            return -1; // Cannot cut the rope with given lengths
        }
        if (ropeLen == 0) {
            return 0; // Base case: no more cutting needed
        }
        int o1 = ropeCut(ropeLen - a, a, b, c);
        int o2 = ropeCut(ropeLen - b, a, b, c);
        int o3 = ropeCut(ropeLen - c, a, b, c);
        int fina = Math.max(Math.max(o1, o2), o3);
        if (fina == -1) {
            return -1; // If unable to cut the rope, return -1
        }
        return fina + 1; // Add 1 for the current cut
    }
    public static void main(String[] args) {
        System.out.println(fibbonaci(5));
        System.out.println(ropeCut(5, 2, 5, 1));
    }
}
