package Recursion.TreeRecursion;

public class RopeCut {
    static int func(int n,int a ,int b,int c){
        if(n==0){
            return 1;
        }
        // if it goes to -ve values then 
        if(n<0){
            return -1;
        }
        int n1=func(n-a, a, b, c);
        int n2=func(n-b, a, b, c);
        int n3=func(n-c, a, b, c);
        int fina=Math.max(n1, Math.max(n2, n3));
        if(fina==-1){
            return -1;
        }
        return fina+1;
    }
    public static void main(String[] args) {
        System.out.println(func(8, 5, 3, 2));
    }
}
