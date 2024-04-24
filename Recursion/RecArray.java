package Recursion;

public class RecArray {
    static boolean isSorted(int idx, int arr[]) {
        if (idx == arr.length) {
            return true;
        }
        if (arr[idx] > arr[idx + 1]) {
            return false;
        }
        return isSorted(idx + 1, arr);

    }

    static boolean isPresent(int arr[], int idx, int search) {
        if (idx == arr.length) {
            return false;
        }
        if (arr[idx] == search) {
            return true;
        }
        return isPresent(arr, idx + 1, search);
    }

    static int[] findAll(int arr[], int idx, int search) {
        return findAllHelper(arr, idx, search, 0);
    }

    static int[] findAllHelper(int arr[], int idx, int search, int count) {
        // base case
        if(idx==arr.length){
            int result []=new int[count];
            return result;
        }
        if(arr[idx]==search){
            count++;
        }
        int result[]= findAllHelper(arr, idx+1, search, count);
        // for filling
        if(arr[idx]==search){
            // as satck falls so need to place like this 
            result[count-1]=idx;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 18, 45, 34 };
        int arr2[] = { 34, 45, 34, 50 ,60,34};
        System.out.println(isSorted(0, arr));
        System.out.println(isPresent(arr, 0, 34));
        int result[]= findAll(arr2, 0, 34);
        for(int i:result){
            System.out.println(i);
        }
    }
} 
