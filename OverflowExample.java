public class OverflowExample {

	public static void main(String args[]) {
	
		// Overflow
		int overFlow = 2147483647;
		System.out.println("overflow"+ (overFlow + 1));         
		
		// Underflow
		int underFlow = -2147483648;
		System.out.println("Underflow" + (underFlow - 1));
     	
 	}
}