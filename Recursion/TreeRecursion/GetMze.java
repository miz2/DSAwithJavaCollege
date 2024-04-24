package Recursion.TreeRecursion;

public class GetMze {
    static void func(int row,int col,int endRow,int endCol,String result){
        if(row==endRow && col==endCol){
            System.out.println(result);
            return;
        }
        if(row>endRow || col>endCol){
            return;
        }
        func(row+1, col, endRow, endCol, result+"H");
        func(row, col+1, endRow, endCol, result+"V");
    }
    public static void main(String[] args) {
        func(0, 0, 2, 2, "");
    }
}
