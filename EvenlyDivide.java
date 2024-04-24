public class EvenlyDivide {
    public static int countDigits(int n) {
        // Convert the number to a string
        String numStr = Integer.toString(n);

        // Count the number of digits that evenly divide 'n'
        int count = 0;
        for (int i = 0; i < numStr.length(); i++) {
            // Get the current digit as an integer
            int digit = Character.getNumericValue(numStr.charAt(i));

            // Check if the digit evenly divides 'n'
            if (digit != 0 && n % digit == 0) {
                count++;
            }
        }

        // Return the result
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countDigits(336));
    }
}
