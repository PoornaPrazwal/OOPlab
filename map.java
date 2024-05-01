import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // Creating a HashMap to store employee information
        Map<Integer, String> employeeMap = new HashMap<>();

        // Adding employee details
        employeeMap.put(1001, "John Doe");
        employeeMap.put(1002, "Alice Smith");
        employeeMap.put(1003, "Bob Johnson");

        // Accessing employee information by employee ID
        System.out.println("Employee with ID 1001: " + employeeMap.get(1001));
        System.out.println("Employee with ID 1002: " + employeeMap.get(1002));
        System.out.println("Employee with ID 1003: " + employeeMap.get(1003));

        // Checking if an employee ID exists
        System.out.println("Contains employee ID 1001: " + employeeMap.containsKey(1001));
        System.out.println("Contains employee ID 1004: " + employeeMap.containsKey(1004));

        // Iterating through the employee map
        System.out.println("Employee list:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Removing an employee
        employeeMap.remove(1002);
        System.out.println("After removing Employee with ID 1002: " + employeeMap);
    }
}

