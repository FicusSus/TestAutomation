package com.bootcampexercise.module10.Activity4;
import com.bootcampexercise.module10.Activity2.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

    public static void main(String[] args) {

        // 4.1 Create 5 employee objects
        Employee e1 = new Employee("John", 30, "Developer", "Google", 80000);
        Employee e2 = new Employee("Alice", 28, "Tester", "Amazon", 75000);
        Employee e3 = new Employee("Bob", 35, "Manager", "Microsoft", 95000);
        Employee e4 = new Employee("Disha", 26, "Analyst", "Meta", 70000);
        Employee e5 = new Employee("Tom", 40, "Architect", "Apple", 99000);

        // 4.2 Create list and add employees
        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);

        // 4.4 Print highest paid employee
        System.out.println("The employee whose salary is the highest is: " +
                Employee.getHighestPaidEmp(empList));
    }
}
