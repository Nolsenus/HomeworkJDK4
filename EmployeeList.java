import java.util.*;
import java.util.stream.Collectors;

public class EmployeeList {
    private final List<Employee> employees;

    public EmployeeList(List<Employee> employees) {
        this.employees = employees;
    }

    public EmployeeList(Employee[] employees) {
        this(Arrays.asList(employees));
    }

    public EmployeeList() {
        this(new LinkedList<>());
    }

    public List<Employee> getEmployees() {
        return new LinkedList<>(employees);
    }

    public List<Employee> getByExperience(int experience) {
        List<Employee> result = new LinkedList<>();
        for (Employee e : employees) {
            if (e.getExperience() == experience) {
                result.add(e);
            }
        }
        return result;
    }

    public Map<Integer, List<String>> getPhoneNumbersByName (String name) {
        Map<Integer, List<String>> result = new HashMap<>();
        for (Employee e : employees) {
            if (e.getName().equals(name)) {
                result.put(e.getId(), e.getPhoneNumbers());
            }
        }
        return result;
    }

    public Employee getById(int id) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public String toString() {
        List<String> employeeStrings = employees.stream().map(Employee::toString).collect(Collectors.toList());
        return String.format("{%s}", String.join("\n", employeeStrings));
    }
}
