public class RecBasic {
    static void printNTimes(int n) {
        // base case
        if (n == 0) {
            // exit from current call
            return;
        }
        // kaam
        // pre call
        // head recursion :
        System.out.println("Miz" + n);
        // recursion
        // small problem
        printNTimes(n - 1);
        // stack falls and we print it in forward order
        // post call
        // tail recursion:if at last
        System.out.println("Miz" + n);
    }

    static void num(int n) {
        if (n == 0) {
            return;
        }
        num(n / 10);
        System.out.println(n % 10);
    }

    static void sum1(int n, int result) {
        if (n == 0) {
            System.out.println(result);
            return;
        }
        int digit = n % 10;
        result += digit;
        sum1(n / 10, result);
        // tail recursion is here
    }

    static int sum2(int n) {
        // in this the stack will fall and we then we make the logic unlike when we used void 
        // don't make local variable
        if (n == 0) {
            // initial value of sum
            return 0;
        }
        int sum = sum2(n / 10);
        sum += n % 10;
        return sum;
        // head recursion takes place here
    }

    static void evenOdd(int n,int even,int odd){
        if(n==0){
            System.out.println("Even"+even);
            System.out.println("Odd"+odd);
            return;
        }
        if(n%2==0){
            even++;
        }
        else{
            odd++;
        }
        evenOdd(n-1, even, odd);
        // tail recursion
    }

    static int[] cEvenOdd(int n){
        // [0]-even [1]-odd
        if(n==0){
            // create array
            int arr[]=new int[2];
            // arr[0]= 0 and arr [1]=1
            return arr;
        }
        int arr[]=cEvenOdd(n-1);
        if(n%2==0){
            arr[0]+=1;
        }
        else{
            arr[1]+=1;
        }
        return arr;
    }
   static boolean pallindrome(int n,int rev,int rem){
    if(rem==0){
        return true;
    }
   else return pallindrome(n, rev*10+rem%10, rem/10);
   }

   static void table(int n,int idx,int range){
    if(idx> range){
        return;
    }
    System.out.println(n +"*"+ +idx+"="+(n*idx));
    table(n, idx+1, range);
   }
   static void table2(int n,int idx,int range){
    if(idx==0){
        return;
    }
    
    table2(n, idx-1, range);
    System.out.println(n +"*"+ +idx+"="+(n*idx));
   }

   public static int zeroNum(int n, int count) {
    if (n == 0) {
        return count;
    }
    if (n % 10 == 0) {
        count++;
    }
    return zeroNum(n / 10, count);
}
    static void zeroNu(int n,int count){
        if(n==0){
            System.out.println(count);
            return ;
        }
        int digit=n%10;
        if(digit==0){
            count++;
        }
        zeroNu(n/10, count);
    }

    static int sumN(int n){
        if(n==1){
            return 1;
        }
       int  fn= n+sumN(n-1);
       return fn;
    }
    public static int sumM(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        return sumM(n - 1, sum + n);
    }
    static void sumV(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sumV(n-1, sum+n);
    }

    static String printTable(int num,int val){
        // one time
        // base case
        if(val==0){
            return "";
        }
        // String res=""; blank 
        // repeat
        String result=printTable(num, val-1);
        String exp=num +"*"+ val +"="+(num*val);
        // fill it n times 
        return result+exp +"\n";
    }
    public static void main(String[] args) {
        // printNTimes(4);
        // num(12345);
        // sum1(51, 0);
        System.out.println(sum2(231));

        // evenOdd(10, 0, 0);
        // int arr[]=cEvenOdd(5);
        // System.out.println(arr[1]+"odd");
        // System.out.println("even"+arr[0]);
       System.out.println(pallindrome(123, 0, 0));
       table(5, 1, 10);
       System.out.println(zeroNum(1000, 0));
       zeroNu(2100, 0);
       System.out.println(sumN(5));
       System.out.println(sumM(4, 0));
       sumV(5, 0);
       table2(5, 10, 1);
       String r= printTable(5, 10);
       System.out.println(r);
    }
}
