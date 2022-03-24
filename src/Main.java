import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jone", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println("======================================================");
        System.out.println(employeeList.get(1));
        System.out.println("======================================================");
        System.out.println(employeeList.isEmpty());
        System.out.println("======================================================");
        employeeList.set(1, new Employee("Frank","Castle", 31));
        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println("======================================================");
        System.out.println("Size of employeeList is " + employeeList.size());
        System.out.println("======================================================");
        employeeList.add(3, new Employee("John", "Doe", 412));
        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println("======================================================");
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee: employeeArray) {
            System.out.println(employee);
        }
        System.out.println("=======================================================");
        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
        System.out.println(employeeList.indexOf(new Employee("Frank", "Castle", 31)));
        System.out.println("=======================================================");
        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));
    }
}
