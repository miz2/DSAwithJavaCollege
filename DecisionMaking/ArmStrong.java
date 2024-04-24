package DecisionMaking;

public class ArmStrong {
    public static void main(String[] args) {
        int num=153;
        int cpy=num;
        int arm=0;
        int count=0;
        while(cpy!=0){
            count++;
            cpy/=10;
        }
        System.out.println(count);
        cpy=num;
        while(cpy!=0){
            int digit=cpy%10;
            arm+=(int)Math.pow(digit,count);
            cpy/=10;
        }
        if(num==arm){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
