import java.util.*;

public class Subsetsum2{
    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        // Write your code here..
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        helper(0, arr, new ArrayList<>(), ans);
        return ans;
    }

    static void helper(int idx, int num[], List<Integer> ds, ArrayList<ArrayList<Integer>> ans) {
        // for empty subset [] just add to the ans
        ans.add(new ArrayList<>(ds));
        // traverse for all other elements 
        for (int i = idx; i < num.length; i++) {
            // check for duplicates and ignore them 
            if (i > idx && num[i] == num[i - 1]) {
                continue;
            }
            // now simply add the element 
            ds.add(num[i]);
            helper(i + 1, num, ds, ans);
            // remove it for backtracking :
            ds.remove(ds.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        ArrayList<ArrayList<Integer>> subsets = uniqueSubsets(arr.length, arr);
        
        // Printing the subsets
        for (ArrayList<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
