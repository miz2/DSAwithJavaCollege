package DecisionMaking;

public class RotateNum {
    public static void main(String[] args) {
        int num=12345;
        int rot=2;
        int count=0;
        int cpy=num;
        // count no of digits
        while(cpy!=0){
            count++;
            cpy/=10;
        }
        // power for split
        rot=rot%count;
        if(rot<0){
            rot=rot+count;
        }
        int pow=(int)Math.pow(10, rot);
        int lhs=num/pow;
        int rhs=num%pow;
        System.out.println(lhs);
        System.out.println(rhs);
        
        // power for rhs shifting 
        int pow2=(int)Math.pow(10, count-rot);
        int result= rhs*pow2 +lhs;
        System.out.println(result);
    }
}
