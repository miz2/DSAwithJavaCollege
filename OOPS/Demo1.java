package OOPS;

import java.util.Scanner;

// class is a blueprint 
// class in PascalCase
class Employee{
    // features /members of class employee 
   private int id;
    private String name;
    private double salary;
    private String companyName;
   public void input(int id,String n,double s){
        if(id<=0 || salary <=0){
            System.out.println("Invalid Data");
            return;
        }
        // this is a keyword 
        // this :I contain the current calling object reference 
        // values get copied in this 
        // this is optional to write is compiler are now better 
        // below we will need this as there might be confusions
        // Local varibale is aShadow problem nearerst variable which is solved by this 
        this.id=id;
        name=n;
        this.salary=s;
    }
    // called with class hence called methods 
  public void print(){
    System.out.println("Company:"+companyName);
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.salary);
    }
    // it is just empty 
    Employee(){
        // passing the defalt values 
        System.out.println("This is default constuctor ");
        // id=100;
        // name="Raju";
        // salary=7432;
        this.companyName="Skillrisers";
    }
    Employee(int id,String name,double salary){
        // calling default constuctor 
        this();
        System.out.println("This is parameterized constrcutor ");
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void setterSalary(double salary){
        this.salary=salary;
    }
    public double getterSalary(){
        return salary;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class Demo1 {

    public static void main(String[] args) {
        Employee ram; //ram is a varaible of type Employee hence this is our custom data type 
        int x; //x is variable of type int 
        // new is a keyword which allocates memory dynamically 
        // new employee will create an object and gets assinged to ram 
        // function main always go to stack memory with local variables 
        x=100;
        ram=new Employee(1,"Ram",83434);
        // System.out.println(ram.id);
        // System.out.println(ram.name);
        // System.out.println(ram.salary);
        System.out.println("Value of x:"+x);
        // ram.name="Ram KUmar";
        // ram.id=1;
        // ram.salary=87343;
        // System.out.println(ram.id);
        // System.out.println(ram.name);
        // System.out.println(ram.salary);
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the id:");
        // int id=sc.nextInt();
        // System.out.println("Enter the name");
        // String name=sc.next();
        // System.out.println("Enter the salary");
        // double salary=sc.nextInt();
        // ram.input(2,"Ram Singh",45000);
        // ram.print();
        // Employee sh=new Employee();
        // sh.input(id, name, salary);
        // sh.print();
        ram.setterSalary(ram.getterSalary()+20000);
        ram.print(); //calling with values of constructor 
        sc.close();
    }
}
