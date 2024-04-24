import java.util.Stack;

class Solution {

    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        // Get the top element
        int topElem = stack.peek();
        // empty the whole stack and store the top and then pop it 
        stack.pop();
        // Reverse the remaining stack
        reverseStack(stack);
        // Insert the top element at the bottom
        insertAtBottom(stack, topElem);
    }

    static void insertAtBottom(Stack<Integer> st, int val) {
        if (st.empty()) {
            st.push(val);
        } else {
            // storing top for every step 
            int top = st.peek();
            // then remove it from the stack 
            st.pop();
            // now call till base case gets hit 
            insertAtBottom(st, val);
            // after base case gets hit we insert 
            st.push(top);
        }
    }
}

public class RevStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        // Push elements into the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        System.out.println("Original stack: " + stack);
        
        // Reverse the stack
        Solution.reverseStack(stack);
        
        System.out.println("Reversed stack: " + stack);
    }
}
