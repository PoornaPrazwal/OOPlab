// Superclass: Employee
class Employee {
    // Fields
    private String name;
    private int employeeId;

    // Constructors
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}

// Subclass: Manager
class Manager extends Employee {
    // Fields
    private String department;

    // Constructors
    public Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    // Methods
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void manageTeam() {
        System.out.println("Manager is managing the team.");
    }

    // Override displayInfo method to include department information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

// Main class for demonstration
public class InheritanceExample {
    public static void main(String[] args) {
        // Create objects of Employee and Manager
        Employee employee = new Employee("Rahul", 101);
        Manager manager = new Manager("AJAY", 201, "HR");

        // Display information about the objects
        System.out.println("Employee Information:");
        employee.displayInfo();
        System.out.println();

        System.out.println("Manager Information:");
        manager.displayInfo();
        manager.manageTeam();
    }
}
