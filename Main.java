import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>(Arrays.asList(
                new Employee(1, "John", 10, "12345"),
                new Employee(2, "Jack", 6, "54321"),
                new Employee(3, "Jeremiah", 23, "15243"),
                new Employee(4, "Jessica", 31, "51423"),
                new Employee(5, "Jules", 23, "13524")));
        EmployeeList employeeList = new EmployeeList(employees);
        System.out.println("Initial employee list:");
        System.out.println(employeeList);

        employeeList.addEmployee(new Employee(6, "Jerma", 50, "11111"));
        System.out.println("\n\nEmployee list after adding Jerma:");
        System.out.println(employeeList);

        employeeList.addEmployee(new Employee(7, "John", 10, Arrays.asList("12312","32132","11223")));
        System.out.println("\n\nEmployee list after adding the second John:");
        System.out.println(employeeList);

        System.out.println("\n\nEmployees with experience 23:");
        for (Employee e : employeeList.getByExperience(23)) {
            System.out.println(e);
        }

        System.out.println("\n\nEmployees with experience 50:");
        for (Employee e : employeeList.getByExperience(50)) {
            System.out.println(e);
        }

        System.out.println("\n\nEmployees with experience 0:");
        for (Employee e : employeeList.getByExperience(0)) {
            System.out.println(e);
        }

        System.out.println("\n\nPhone numbers of employees with name \"John\":");
        Map<Integer, List<String>> phones = employeeList.getPhoneNumbersByName("John");
        for (Integer i : phones.keySet()) {
            System.out.printf("ID: %d ---- Phone Numbers: %s%n", i, String.join(", ", phones.get(i)));
        }

        System.out.println("\n\nPhone numbers of employees with name \"Bob\":");
        phones = employeeList.getPhoneNumbersByName("Bob");
        for (Integer i : phones.keySet()) {
            System.out.printf("ID: %d ---- Phone Numbers: %s%n", i, String.join(", ", phones.get(i)));
        }

        System.out.println("\n\nEmployee with ID 4:");
        System.out.println(employeeList.getById(4));

        System.out.println("\n\nEmployee with ID 999:");
        System.out.println(employeeList.getById(999));
    }
}
