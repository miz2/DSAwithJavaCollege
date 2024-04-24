package OOPS;

class A {
    A() {
        System.out.println("default");
    }

    A(int x) {
        this(); // Calling the default constructor of class A
        System.out.println("Param cons");
    }

    A(int x, int y) {
        this(x); // Calling the parameterized constructor of class A with one parameter
        System.out.println("Param cons");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        A ob = new A(23);
       System.out.println(ob.getClass()); 
    }
}
