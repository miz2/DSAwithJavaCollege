package Recursion.TreeRecursion;
public class Intro {
    static void fun(int n){ 
        if(n<=0)
        {
            return;
        }
        System.out.println("Pre Call"+n);
        fun(n-1); //one branch 
        // stack fall for n-1 
        System.out.println("between call"+n);
        fun(n-2); //second branch 
        // works when 1st branch falls 
        System.out.println("Post call"+n);
    }
    public static void main(String[] args) {
        fun(4);
    }
}

