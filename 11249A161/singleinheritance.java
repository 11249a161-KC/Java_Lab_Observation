class Employee {
    int id;
    String name;
    double basicSalary;

    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }
}

class PermanentEmployee extends Employee {
    double hra;
    double da;

    PermanentEmployee(int id, String name, double basicSalary, double hra, double da) {
        super(id, name, basicSalary);
        this.hra = hra;
        this.da = da;
    }

    void display() {
        double grossSalary = basicSalary + hra + da;
        
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class singleinheritance {
    public static void main(String[] args) {
        PermanentEmployee emp = new PermanentEmployee(101, "Jordan", 50000, 10000, 5000);
        emp.display();
    }
}
