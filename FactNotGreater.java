import java.util.List;
import java.util.ArrayList;
public class FactNotGreater {
    public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here
           List< Long > ans = new ArrayList<>();
           long result=1,mult=1;
        //    but need to terminate it before 
           while(result<=n/mult ){
               result*=mult;
               ans.add(result);
               mult++;
           }
           return ans;
    }
    public static void main(String[] args) {
        System.out.println(factorialNumbers(8));
    }
}