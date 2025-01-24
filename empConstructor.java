import java.util.Scanner;

class Employee {
    String name;
    int empNo;
    String qual;
    String address;
    String contactNo;
    double basicSal;
    double da; // Dearness Allowance
    double ta; // Travel Allowance
    double netSal;

    // Default constructor
    public Employee() {
        name = "Not Available";
        empNo = 0;
        qual = "Not Available";
        address = "Not Available";
        contactNo = "Not Available";
        basicSal = 0.0;
        da = 0.0;
        ta = 0.0;
        netSal = 0.0;
    }

    // Parameterized constructor
    public Employee(String name, int empNo, String qual, String address, String contactNo, double basicSal) {
        this.name = name;
        this.empNo = empNo;
        this.qual = qual;
        this.address = address;
        this.contactNo = contactNo;
        this.basicSal = basicSal;
        calculateSalary();
    }

    // Copy constructor
    public Employee(Employee other) {
        this.name = other.name;
        this.empNo = other.empNo;
        this.qual = other.qual;
        this.address = other.address;
        this.contactNo = other.contactNo;
        this.basicSal = other.basicSal;
        this.da = other.da;
        this.ta = other.ta;
        this.netSal = other.netSal;
    }

    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Employee Number: ");
        empNo = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter Qualification: ");
        qual = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Contact Number: ");
        contactNo = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSal = sc.nextDouble();

        calculateSalary();

        sc.close();
    }

    private void calculateSalary() {
        da = basicSal * 0.1; // Assume DA is 10% of Basic Salary
        ta = basicSal * 0.05; // Assume TA is 5% of Basic Salary
        netSal = basicSal + da + ta;
    }

    public void displayDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("Employee Number: " + empNo);
        System.out.println("Qualification: " + qual);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNo);
        System.out.println("Basic Salary: " + basicSal);
        System.out.println("Dearness Allowance (DA): " + da);
        System.out.println("Travel Allowance (TA): " + ta);
        System.out.println("Net Salary: " + netSal);
    }

}

public class EmployeeMain {
    public static void main(String[] args) {
        // Create an employee using the default constructor
        Employee emp1 = new Employee();
        System.out.println("Default Constructor Employee:");
        emp1.displayDetails();

        // Accept details for the first employee
        System.out.println("\nEnter details for Employee 1:");
        emp1.acceptDetails();
        emp1.displayDetails();

        // Using Parameterized Constructor
        Employee emp2 = new Employee("Shravan", 10001, "M. Tech", "Gujrat", "9091937212", 1000000);
        System.out.println("\nParameterized Constructor Employee:");
        emp2.displayDetails();

        // Using Copy Constructor
        Employee emp3 = new Employee(emp1);
        System.out.println("\nCopy Constructor Employee:");
        emp3.displayDetails();
        
    }
}
