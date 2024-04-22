public class Employee {
    private String name;
    private int employeeID;
    private double salary;

    public Employee(String name, int employeeID, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }
    public void updateName(String newName) {
        this.name = newName;
    }
    public void updateEmployeeID(int newEmployeeID) {
        this.employeeID = newEmployeeID;
    }
    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 1001, 50000);
        emp1.displayInfo();
        System.out.println("\nUpdating employee information...\n");
        emp1.updateName("Jane Smith");
        emp1.updateSalary(60000);
        emp1.displayInfo();
    }
}
