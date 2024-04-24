

public class canNinjaWin {
    public static boolean canNinjaWin1(String str) {
        // Base case
        if (str.length() < 2) {
            return false;
        }
        
        // Iterate through the string
        for (int i = 0; i < str.length() - 1; i++) {
            // If two consecutive characters are '$$'
            if (str.charAt(i) == '$' && str.charAt(i + 1) == '$') {
                // Replace '$$' with '**'
                String ns = str.substring(0, i) + "**" + str.substring(i + 2);
                // Check if the modified string allows the ninja to win
                if (!canNinjaWin1(ns)) {
                    return true; // If not, return true
                }
            }
        }
        return false; // If no '$$' found or no winning scenario, return false
    }

    public static void main(String[] args) {
        // Test cases
        String[] testStrings = {"abc$$de", "$$abc$$", "abc$$$$def", "abc", "$$$$$$", "a$$b$$c"};
        
        for (String str : testStrings) {
            System.out.println("String: " + str + " Can win? " + canNinjaWin1(str));
        }
    }
}
