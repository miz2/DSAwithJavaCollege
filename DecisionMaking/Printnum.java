package DecisionMaking;

public class Printnum {
    public static void main(String[] args) {
        int num=1234;
        int cpy=num;
        int count=0;
        while(cpy!=0){
            count++;
            cpy/=10;
        }
        while(num!=0){
            int pow=(int)Math.pow(10, count-1);
            System.out.println(num/pow);
            num=num%pow;
            count--;
        }
    }
   
}
