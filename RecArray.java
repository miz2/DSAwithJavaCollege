public class RecArray {
    static boolean isSorted(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]>arr[idx+1]){
            return false;
        }
        return isSorted(arr, idx+1);
    }
    static boolean isPresent(int arr[],int num,int idx){
        // base :here two base cases
        if(arr.length==idx){
            return false;
        }
        // condition to check 
        if(arr[idx]==num){
            return true;
        }
        // kaam 
       return isPresent(arr, num, idx+1);
    }
    // give its index and count
    static int[] searchOccurenceHelper(int arr[],int search,int index,int count){
        // base case array gets exhausted 
        if(arr.length==index){
            if(count==0){
                // return null;
                // or 
                int [] result=new int[0];
                return result;
            }
            int [] result=new int[count];
            return result;
        }
        //    need to count the occurence 
        // when the stack is forming and does,'t work when stack falls
        if(arr[index]==search){
            count++;
        }
        // in order to goto next index till we exhaust and hit the base case 
       int result[]= searchOccurenceHelper(arr, search, index+1, count);
       //backtracking step
       if(arr[index]==search){
        // as stack falls
       result[count-1]=index;
    }
       return result;
        }
    static int[] searchOccurence(int arr[],int search,int index){
     return searchOccurenceHelper(arr, search, index, 0);
    }

    static void searchReplace(int arr[],int search,int idx){
        if(arr.length==idx){
            return;
        }
        if(arr[idx]==search){
            arr[idx]=500;
            // return;
        }
        searchReplace(arr, search, idx+1);
    }
    static void minMax(int[] arr,int min,int max,int idx){
        // base case
        if(idx==arr.length){
            System.out.println("Min"+min);
            System.out.println("Max"+max);
            return;
        }
        if(arr[idx]<arr[min]){
            min=idx;
        }
        if(arr[idx]>arr[max]){
            max=idx;
        }
        minMax(arr, min, max, idx+1);
    }
    static int[] minMaxArr(int[] arr, int idx) {
        // Base case: when idx reaches the length of the array
        if (idx == arr.length) {
            // Return an array containing the minimum and maximum values found
            return new int[]{arr[1], arr[0]}; 
        }
    
        // Update maximum if current element is greater
        if (arr[idx] > arr[0]) {
            arr[0] = arr[idx];
        }
        
        // Update minimum if current element is smaller
        if (arr[idx] < arr[1]) {
            arr[1] = arr[idx];
        }
    
        // Recur for next index
        return minMaxArr(arr, idx + 1);
    }

    static void reverse(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
        reverse(arr, low+1, high-1);
    }

    static int[] rev(int arr[],int low,int high){
        if(low>=high){
            return arr.clone();
        }
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;

        return rev(arr, low+1, high-1);
    }
    // search element in array 
    public static void main(String[] args) {
        int arr[]={10,23,40,45,67,40};
      boolean res=  isSorted(arr, 0);
      System.out.println(res?"Sorted":"Not sorted");
      boolean pr=isPresent(arr, 0, 0);
      System.out.println(pr?"Found":"Not found");
      int indexes[]=searchOccurence(arr, 40, 0);
    for(int i=0;i<indexes.length;i++){
        System.out.println(indexes[i]);
    }
    int as[]={5,50,50,20,30};
    searchReplace(as, 50, 0);
    for(int i=0;i<as.length;i++){
        System.out.println(as[i]);
    }

    // minmax
    minMax(arr, 0, 0, 0);

    int[] arr3 = {3, 7, 1, 9, 4, 5};
    int[] result = minMaxArr(arr3, 0);
    System.out.println("Minimum: " + result[0]);
    System.out.println("Maximum: " + result[1]);
    reverse(arr3, 0, arr3.length);
    }
}
