package OOPS;
abstract class Account{
    // Local scope is within some {} or a method
    // default scope here int id !! i.e within the folder menas the package 
    // protected (within the package ,outside the package using inheritance)
    // private is within the class 
    // public accesible everywhere
    // no global scope is allowed in Java 
    int id;
    String name;
    double balance;
    double roi;
    // public void computeRoi(){
    //     System.out.println("Account ROI is 3%");
    // }
    // must be defined by class and is compulsory then the child class will also become abstract
   abstract public void computeRoi();
    
    public void deposit(){
        System.out.println("Deposit Account");
    }
    public void withdraw(){
        System.out.println("Withdraw Account");
    }
    public void showBalance(){
        System.out.println("Showing balance account");
    }
}
class SavingAccount extends Account{
    // now we have some specific features of this class 
    public void limit(){
        System.out.println("Saving A/c limited transactions");
    }
    @Override
    public void computeRoi(){
        System.out.println("Rate of interest here: 4.5%");
    }
}
class CurrentAccount extends Account{
    public void noLimit(){
        System.out.println("No limit here");
    }
    public void odLimit(){
        System.out.println("Overdraft limit");
    }
    @Override
    public void computeRoi(){
        System.out.println("It has ROI as 5.5%");
    }
}
public class ISA {
    public static void main(String[] args) {
        // Account class ka object  should not be made at any cost 
        SavingAccount sa=new SavingAccount();
        sa.deposit();;
        sa.withdraw();
        sa.limit();
        System.out.println("*********");
        CurrentAccount ca=new CurrentAccount();
        ca.noLimit();
        ca.odLimit();
    }
}
