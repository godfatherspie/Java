import java.util.Scanner;


class Employee {
    protected String name;
    protected double salary;


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    public void DisplaySalary() {
        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: " + salary);
    }
}


class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void DisplaySalary() {
        double incrementedSalary = salary + (salary * 0.50); // 50% hike
        System.out.println("Full-Time Employee Name: " + name);
        System.out.println("Base Salary: " + salary);
        System.out.println("Salary after 50% hike: " + incrementedSalary);
    }
}


class InternEmployee extends Employee {
    public InternEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void DisplaySalary() {
        double incrementedSalary = salary + (salary * 0.25); // 25% hike
        System.out.println("Intern Employee Name: " + name);
        System.out.println("Base Salary: " + salary);
        System.out.println("Salary after 25% hike: " + incrementedSalary);
    }
}


public class empInherit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        
        System.out.print("Enter Full-Time Employee Name: ");
        String fullTimeName = sc.nextLine();
        System.out.print("Enter Full-Time Employee Salary: ");
        double fullTimeSalary = sc.nextDouble();
        sc.nextLine(); 

        
        FullTimeEmployee fullTime = new FullTimeEmployee(fullTimeName, fullTimeSalary);

        
        System.out.print("Enter Intern Employee Name: ");
        String internName = sc.nextLine();
        System.out.print("Enter Intern Employee Salary: ");
        double internSalary = sc.nextDouble();

        
        InternEmployee intern = new InternEmployee(internName, internSalary);

        
        System.out.println("\nFull-Time Employee Details:");
        fullTime.DisplaySalary();

        System.out.println("\nIntern Employee Details:");
        intern.DisplaySalary();

        
        sc.close();
    }
}
