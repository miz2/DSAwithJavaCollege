import java.util.ArrayList;
import java.util.List;
public class Phone {
    public static List<String> letterCombinations(String a) {
        if (a == null || a.length() == 0) {
            return new ArrayList<>();
        }
        String keypad[] = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> res = new ArrayList<>();
        helper(a, "", keypad, res);
        return res;
    }

    static void helper(String a, String ans, String keypad[], List<String> res) {
        // Base case
        if (a.length() == 0) {
            res.add(ans);
            return;
        }
        // First character of string 'a' represents a digit
        // which corresponds to a string in the keypad array
        String keys = keypad[a.charAt(0) - '0'];
        // Iterate over the string in the keypad array
        for (int i = 0; i < keys.length(); i++) {
            // Call the method recursively with the next substring of 'a'
            // and append the current character to 'ans'
            helper(a.substring(1), ans + keys.charAt(i), keypad, res);
        }
    }
    public static void main(String[] args) {
        String input = "23";
        List<String> combinations = letterCombinations(input);
        System.out.println("Combinations for " + input + ": " + combinations);
    }
}
