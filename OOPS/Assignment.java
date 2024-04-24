package OOPS;
class Student {
    private int rollno;
    private String name;
    private int marks[] = new int[3];
    private String collegeName;

    // Default constructor
    Student() {
        this.collegeName = "DIT University";
    }

    Student(int rollno, String name, int marks[]) {
        // call the default
        this();
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

   public int totalMarks() {
    int total=0;
    for(var mark:marks){
        total+=mark;
    }
    return total;
    }

    private double percentage() {
        return totalMarks()/marks.length;
    }

    private String grade() {
        var percent=percentage();
        if(percent>=90){
            return "A Grade";
        }
        if(percent>=80){
            return "B Grade";
        }
        else{
            return "C Grade";
        }
    }
    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void reportCard() {
        System.out.println("************Report Card for " + collegeName + " **************");
        System.out.println("Roll No " + rollno);
        System.out.println("Name " + name);
        for (var mark : marks) {
            System.out.println("Marks" + mark);
        }
        System.out.println("Grade: "+grade());
        System.out.println("*************************************************************");
    }
}

public class Assignment {
    public static void main(String[] args) {
        Student Rahul = new Student(21, "Rahul Dravid", new int[]{80, 80, 91});
        Rahul.reportCard();
        
    }
}
