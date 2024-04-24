package Recursion.TreeRecursion;

public class Subsequence {
    static void getSubsequence(String str, String result) {
        // base case
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }
        getSubsequence(str.substring(1), result + str.charAt(0));
        getSubsequence(str.substring(1), result);

    }

    public static void main(String[] args) {
        getSubsequence("amit", "");
    }
}
