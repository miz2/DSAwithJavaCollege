package Recursion;

public class TreeRec {
    static void fun(int num){
        if(num<=0){
            return;
        }
        System.out.println("Stack Builds"+num);
        fun(num-1);
        System.out.println("In between call"+num);
        fun(num-2);
        System.out.println("Post call"+num);
    }
    public static void main(String[] args) {
        fun(3);
    }
}
