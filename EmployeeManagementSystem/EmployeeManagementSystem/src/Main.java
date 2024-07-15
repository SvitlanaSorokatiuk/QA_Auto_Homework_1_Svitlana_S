import com.example.employees.Designer;
import com.example.employees.Developer;
import com.example.employees.Employee;
import com.example.employees.Manager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];
        employees[0] = new Manager("Шевченко Тарас", 45, 5000);
        employees[1] = new Developer("Франко Іван", 41, 4100);
        employees[2] = new Designer("Українка Леся", 35, 3200);

        for (Employee employee : employees) {
            employee.performJob();
            employee.describeRole();
        }

        System.out.println("--------------------");
        employees[0].describeRole("управління працівниками компанії");
        employees[1].describeRole("виконання юніт тестування");
        employees[2].describeRole("поєднання кольорів");
    }
}