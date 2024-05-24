package org.example.ex3;

import java.util.ArrayList;
import java.util.List;

public class EmployeeController {
    private List<Employee> employees;

    public EmployeeController() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(final Employee employee) {
        employees.add(employee);
    }

    public Employee getEmployeeByCnp(final String cnp) {
        return employees.stream()
                .filter(employee -> employee.getCnp().equals(cnp))
                .findFirst()
                .orElse(null);
    }

    public Employee updateEmployeeSalaryByCnp(final String cnp, final Double salary) {
        Employee employee = getEmployeeByCnp(cnp);
        if (employee != null) {
            employee = new Employee(employee.getFirstName(), employee.getLastName(), salary, employee.getCnp());
            employees.removeIf(e -> e.getCnp().equals(cnp));
            employees.add(employee);
        }
        return employee;
    }

    public Employee deleteEmployeeByCnp(final String cnp) {
        Employee employee = getEmployeeByCnp(cnp);
        if (employee != null) {
            employees.remove(employee);
        }
        return employee;
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public int getNumberOfEmployees() {
        return employees.size();
    }
}
