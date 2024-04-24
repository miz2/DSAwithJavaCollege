import java.util.Stack;

public class StackImp{
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        st.add(45);
        st.add(23);
        st.add(444);
        System.out.println(st);
        System.out.println(st.peek());
    }
}