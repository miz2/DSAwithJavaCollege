package Recursion;

public class RecString {
    // String is immutable
    // reverse must be new string
    static String reverse(String str) {
        if (str.length() == 0) {
            // we need to create a new string
            return "";
        }
        // make string small till it
        String smallString = str.substring(1);
        String result = reverse(smallString);
        char fc = str.charAt(0);
        // string and char can be concatenated even with boolean we can concatenate
        return result + fc;
    }

    static String searchReplace(String str, char m, char rep) {
        if (str.length() == 0) {
            return "";
        }
        String sm = str.substring(1);
        String result = searchReplace(sm, m, rep);
        char fc = str.charAt(0);
        if (fc == m) {
            return rep + result;
        } else {
            return fc + result;
        }
    }

    static String searchRemove(String str, char m) {
        if (str.length() == 0) {
            return "";
        }
        String sm = str.substring(1);
        String result = searchRemove(sm, m);
        char fc = str.charAt(0);
        if (fc == m) {
            return result;
        } else {
            return fc + result;
        }

    }

    static String hiHello(String str) {
        // base case
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == 'h' || str.charAt(1) == 'i') {
            String smallString = str.substring(2);
            String result = hiHello(smallString);
            return "Hello"+result;
        } else {
            String smallString = str.substring(1);
            String result = hiHello(smallString);
            char fc=str.charAt(0);
            return fc+result ;
        }
        
    }
    static String removeConse(String str){
            if(str.length()<=1){
                return str;
            }
            if(str.charAt(0)==str.charAt(1)){
                return str.substring(1);
            }
            else{
                // add to result 
              return str.charAt(0)+ removeConse(str.substring(1));
            }

    }
    static String removeConseAs(String str){
        if(str.length()<=1){
            return str;
        }
        if(str.charAt(0)==str.charAt(1)){
            // add asterisk
            return str.charAt(0)+ "*" +removeConseAs(str.substring(1));
        }
        else{
            // dont add 
            return str.charAt(0)+ removeConseAs(str.substring(1));
        }

    }
    public static void main(String[] args) {
        System.out.println(reverse("Mizaan"));
        System.out.println(searchReplace("hello", 'l', 'x'));
        System.out.println(searchRemove("hello", 'l'));
        System.out.println(hiHello("Hi bro are you Hi tom"));
        System.out.println(removeConse("aaabbbcc"));
        System.out.println(removeConseAs("aabbc"));
    }
}