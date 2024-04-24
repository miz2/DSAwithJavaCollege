package Recursion.BackTracking;

public class AllPos {
    static void allAtoZPos(int n,String result){
        // base case
        if(result.length()==n){
            System.out.print(result+" ");
            return;
        }
        for(char a='A';a<='Z';a++){
            if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
                allAtoZPos(n,result+a);
            }
        }
    }
    public static void main(String[] args) {
        allAtoZPos(2, "");
    }
}
