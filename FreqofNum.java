import java.util.HashMap;

public class FreqofNum {
    public static void main(String[] args) {
        int num = 234522764;
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        while (num != 0) {
            int digit = num % 10;
            // when it doesn't contains then give count as 1
            if (!frequencyMap.containsKey(digit)) {
                frequencyMap.put(digit, 1);
            } else {
                int count = frequencyMap.get(digit);
                frequencyMap.put(digit, count + 1);
            }
            num /= 10;
        }

        System.out.println(frequencyMap);
    }
}
