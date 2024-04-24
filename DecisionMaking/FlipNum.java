package DecisionMaking;

public class FlipNum {
    public static void main(String[] args) {
        int num=32145;
        int pos=0;
        int sum=0;
        while(num!=0){
            int digit=num%10;
            pos++;
            int pow=(int)Math.pow(10, digit-1);
            sum=sum+pos*pow;
            num/=10;
        }
        System.out.println(sum);
    }
}
