package Recursion.TreeRecursion;

public class Fibbonaci {
    static int func(int n){
        if(n==0 || n==1){
            return n;
        }
        int fn1=func(n-1);
        int fn2=func(n-2);
        // when both get executed then we just add it 
        return fn1+fn2;
    }
    public static void main(String[] args) {
       System.out.println(func(8));
    }
}
