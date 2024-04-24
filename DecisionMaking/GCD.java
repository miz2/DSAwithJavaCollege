package DecisionMaking;

public class GCD {
    public static void main(String[] args) {
        int a =24,b=36;
        // Brute Force
        int min=a>b?b:a;
        while(min>0){
            if(a%min==0 && b%min==0){
                System.out.println("GCD "+min);
                break;
            }
            min--;
        }
        // Division method 
        while(a%b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        System.out.println("GCD "+b);
        // subtraction method 
        a=24;
        b=36;
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        System.out.println("GCD: " + a);

    }
}
