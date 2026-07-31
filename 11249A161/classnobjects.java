class Student
{
    String name;
    int rollno;
    double marks;

    public Student(String name, int rollno, double marks)
    {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    public String calculategrade()
    {
        if(this.marks >= 90)
        {
            return "S";
        }
        else if(this.marks >= 80)
        {
            return "A";
        }
        else if(this.marks >= 70)
        {
            return "B";
        }
        else if(this.marks >= 60)
        {
            return "C";
        }
        else if(this.marks >= 50)
        {
            return "D";
        }
        else
        {
            return "F";
        }
    }

    public void display()
    {
        System.out.println("Student name: " + this.name);
        System.out.println("Student rollno: " + this.rollno);
        System.out.println("Student marks: " + this.marks);
        System.out.println("Student grade: " + this.calculategrade());
    }
}
public class classnobjects 
{
    public static void main(String[] args) 
    {
        Student student1 = new Student("Abhijith",23,82.50);
        Student student2 = new Student("Geethika",57,95.50);
        Student student3 = new Student("Laxman",52,78.00);

        student1.display();
        student2.display();
        student3.display();
    }
}
