public class ProperCaseString {
    public static void main(String[] args) {
        String s="miz AnA";
        System.out.println(s);
        // split on basis of space like miz at 0 then AnA at 1
        String arr[]= s.split(" ");
        String fullname="";
        for(String value:arr){
            char fc= value.charAt(0);
            String fcCap=String.valueOf(fc).toUpperCase();
            String rem=value.substring(1).toLowerCase();
            String tm=fcCap+ rem;
            fullname=fullname+ tm+" ";
            
        }

    }
}
