package DecisionMaking;

public class LabelledLoops {
    public static void main(String[] args) {
        outer:
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                if(i==j){
                    // break outer 
                    // not possible with return 
                    continue outer;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
