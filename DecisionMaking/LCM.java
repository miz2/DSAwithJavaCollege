package DecisionMaking;

public class LCM {
    public static void main(String[] args) {
        int a=12;
        int b=24;
        int aC=a;
        int bC=b;
        while(a%b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        int lcm=(aC*bC)/b;
        System.out.println(lcm);
    }
}
