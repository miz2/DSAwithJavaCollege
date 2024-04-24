import java.math.BigDecimal;
import java.math.BigInteger;

public class BigTypes {
    public static void main(String[] args) {
        BigInteger b=new BigInteger("98458528340344");
        BigInteger b1=new BigInteger("73847857485435");
        // now if we want to sum them 
        // b+b1 is not possible 
        // Is immutable 
        BigInteger b3=b.add(b1);
        System.out.println(b3);
        BigDecimal bs=new BigDecimal("738487234.35956645");
        System.out.println(bs);
    }
}
