package Recursion.TreeRecursion;

public class DiceProblem {
    static void dice(int currentVal,int end,String result){
        if(currentVal==end){
            System.out.println(result) ;
            return;
        }
        if(currentVal>end){
            return;
        }
        for(int i=1;i<=6;i++){
            dice(currentVal+i, end, result+i);
        }

    }
    public static void main(String[] args) {
        dice(0, 10, "");
    }
}
