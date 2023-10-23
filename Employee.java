import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Employee {
    private final int id;
    private String name;
    private int experience;
    private List<String> phoneNumbers;

    public Employee(int id, String name, int experience, List<String> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.experience = experience;
        this.phoneNumbers = phoneNumbers;
    }

    public Employee(int id, String name, int experience, String phoneNumber) {
        this(id, name, experience, Arrays.asList(phoneNumber));
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public List<String> getPhoneNumbers() {
        return new LinkedList<>(phoneNumbers);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void addPhoneNumber(String phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }

    @Override
    public String toString() {
        return String.format("Employee{id: %d, name:%s, experience: %d, phoneNumbers: %s}"
                , id, name, experience, String.join(", ", phoneNumbers));
    }
}
