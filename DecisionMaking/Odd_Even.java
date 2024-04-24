package DecisionMaking;

public class Odd_Even {
    public static void main(String[] args) {
        int num=5;
        if(num%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        if((num^1)==num+1){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        if((num &1)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        if((num|1) >num){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
