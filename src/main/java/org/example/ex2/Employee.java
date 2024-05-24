package org.example.ex2;

public class Employee extends Person {
    private Double salary;

    public Employee(String firstName, String lastName, Double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String showEmployeeInfo() {
        return "Firstname: " + getFirstName() + " Lastname: " + getLastName() + " Salary: " + salary;
    }
}
