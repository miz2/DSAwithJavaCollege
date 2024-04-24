package DecisionMaking;

public class Greatest4 {
    public static void main(String[] args) {
        int n1=6;
        int n2=8;
        int n3=89;
        int n4=50;
        if(n1>n2){
            if(n1>n3){
                if(n1>n3){
                    System.out.println("first");
                }
                else{
                    System.out.println("fourth");
                }
            }
            else{
                if(n3>n4){
                    System.out.println("third");
                }
                else{
                    System.out.println("Fourth");
                }
            }
        }
        else{
            if(n2>n3){
                if(n2>n4){
                    System.out.println("second");
                }
                else{
                    System.out.println("fourth");
                }
            }
            else{
                if(n3>n4){
                    System.out.println("third");
                }
                else{
                    System.out.println("fourth");
                }
            }
        }
    }
}
