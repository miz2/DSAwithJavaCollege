package Recursion.Patterns;

public class RightTriangle {
    static void printline(int line){
        // base 
        if(line==0){
            return;
        }
        printline(line-1);
        // when 1st stack is falling 
        printStar(line);
        System.out.println();
        // check for inverted 
        
    }
    static void printStar(int star){
        if(star==0){
            return;
        }
        printStar(star-1);
        System.out.print("*");
       
    }

    public static void main(String[] args) {
        printline(5);
    }
}
