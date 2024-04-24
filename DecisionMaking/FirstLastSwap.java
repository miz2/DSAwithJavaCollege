package DecisionMaking;

public class FirstLastSwap {
    public static void main(String[] args) {
        int num=9246;
        int cpy=num;
        int count=0;
        while(cpy!=0){
            count++;
            cpy/=10;
        }
        int powF=(int)Math.pow(10, count-1);
        int ld=num%10;
        int fd=num/powF;
        System.out.println(fd);
        System.out.println(ld);
        // middle part 
        // remove the last part
        num=num/10;
        // now removing the first part by 
        int pow2=(int)Math.pow(10, count-2);
        int middleNum=num%pow2;
        int result=ld*powF +middleNum*10+fd;
        System.out.println(result);
    }
}
