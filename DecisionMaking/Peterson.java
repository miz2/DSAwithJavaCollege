package DecisionMaking;

public class Peterson {
    static int factorial(int n){
        // if(n==0 || n==1){
        //     return 1;
        // }
        int result=1;
        while(n>1){
            result=result*n;
            n--;
        }
        return result;
    }
    public static void main(String[] args) {
        int n=145;
        // System.out.println(factorial(5));
        int cpy=n;
        int sum=0;
        while(cpy!=0){
            int digit=cpy%10;
            sum+= factorial(digit);
            cpy/=10;
        }
        if(n==sum){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
