public class FamilyStruc {
	public static String kthChildNthGeneration(int n, long k) {
		// Write your code here
        if(n==1||k==1){
			return "Male";
		}
		// get the parent of kth child
		long par=(k+1)/2;
		// now need to find out its gender 
		String parentGender =kthChildNthGeneration(n-1, par);
		// if kth child of nth generation is a 1st child then return as same 
		if(k==2*par-1){
			return parentGender;
		}
		else{
			if(parentGender=="Male"){
				return "Female";
			}
			else{
				return "Male";
			}
		}
	}
    public static void main(String[] args) {
       System.out.println(kthChildNthGeneration(3, 4)); 
    }

}