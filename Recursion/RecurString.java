package Recursion;

public class RecurString {
    static String reverse(String str){
        if(str.length()==0){
            return " ";
        }
         String result=reverse(str.substring(1));
        //  stack falls now fc:t then i then m then a 
         char fc=str.charAt(0);
         return result+fc;

    }
    static String searchReplace(String str,char search ,char replace){
        if(str.length()==0){
            return "";
        }
        // small problem
        String r=searchReplace(str.substring(1), search, replace);
        if(str.charAt(0)==search){
            return replace+ r;
        }
        else{
            return str.charAt(0)+r;
        }

    }
    static String searchReplaceChar(String str){
        if(str.length()<=1){
            // returns the last character
            return str;
        }
        if(str.charAt(0)=='h' && str.charAt(1)=='i'){
           String ss= str.substring(2);
           String result=searchReplaceChar(ss);
           return "Hello"+result;
        }
        else{
            String ss=str.substring(1);
            String result= searchReplaceChar(ss);
            // during stack fall
            char fc=str.charAt(0);
            return fc+result;
        }
    }
    static String removeConse(String str){
        // base case
        if(str.length()<=1){
            return str;
        }
        // small problem
        if(str.charAt(0)==str.charAt(1)){
            String result=removeConse(str.substring(1));
            return result;
        }
        else{
            String result=removeConse(str.substring(1));
            char fc=str.charAt(0);
            return fc+result;
        }
    }
    static String adjacentStar(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            String result = adjacentStar(str.substring(1));
            return str.charAt(0) + "*" + result;
        } else {
            return str.charAt(0) + adjacentStar(str.substring(1));
        }
    }
    
    public static void main(String[] args) {
        System.out.println(reverse("amit"));
        String r=searchReplace("Hello", 'l', 'x');
        System.out.println(r);
        System.out.println(searchReplaceChar("hi Amit hi tom"));
        System.out.println(removeConse("AAAABBBCCDC"));
        System.out.println(adjacentStar("AABB"));
    }
}
