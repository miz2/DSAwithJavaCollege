public class Rec {
    public static int[] printNos(int x) {
        // Write Your Code Here
         int []ans = new int[x];

        // Calling recursive function
        rec(x, ans);

        return ans;
    }
    public static void rec(int x,int [] ans){
        if(x==0){
            return;
        }
        rec(x-1, ans);
        ans[x-1]=x;
    }
    public static void main(String[] args) {
        int n = 7;
        int[] x = printNos(n);
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
    
}