package DecisionMaking;

public class GreatestThree {
    public static void main(String[] args) {
        int f=100,s=200,t=300;
        if(f>s){
            if(f>t){
                System.out.println("first is greatets");
            }
            else{
                System.out.println("third is greatest");
            }
        }
        else{
            if(s>t){
                System.out.println("second is greatest");
            }
            else{
                System.out.println("third");
            }
        }
    }
}
