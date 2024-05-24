package aut.utcluj.isp.ex2;

import org.example.ex2.Employee;
import org.example.ex2.Person;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeTest {
    @Test
    public void testCreate() {
        final Employee firstEmployee = new Employee("Harvey", "Specter", 2000d);
        assertEquals("Salary should be '2000'", Double.valueOf(2000d), firstEmployee.getSalary());
        assertEquals("Should display employee info", "Firstname: Harvey Lastname: Specter Salary: 2000.0", firstEmployee.showEmployeeInfo());
        assertTrue("Instance should be 'Person'", firstEmployee instanceof Person);

        final Employee secondEmployee = new Employee("John", "Wick", 1000d);
        assertEquals("Salary should be '1000'", Double.valueOf(1000d), secondEmployee.getSalary());
        assertEquals("Should display employee info", "Firstname: John Lastname: Wick Salary: 1000.0", secondEmployee.showEmployeeInfo());
        assertTrue("Instance should be 'Person'", secondEmployee instanceof Person);
    }
}
