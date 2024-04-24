package Recursion.TreeRecursion;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<String> generateSubsequences(String s) {
        List<String> ans = new ArrayList<>();
        generate(s, ans, 0, "");
        return ans;
    }

    static void generate(String s, List<String> result, int i, String str) {
        // base case
        if (i == s.length()) {
            result.add(str);
            return;
        }

        // include the current character
        generate(s, result, i + 1, str + s.charAt(i));
        
        // exclude the current character
        generate(s, result, i + 1, str);
    }
}

public class SubSeq {
    public static void main(String[] args) {
        String input = "abc";
        List<String> subsequences = Solution.generateSubsequences(input);
        
        System.out.println("Subsequences of '" + input + "':");
        for (String subsequence : subsequences) {
            System.out.println(subsequence);
        }
    }
}
