package org.example.ex3;

public class Employee {
    private String firstName;
    private String lastName;
    private Double salary;
    private String cnp;

    public Employee(String firstName, String lastName, Double salary, String cnp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.cnp = cnp;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public String getCnp() {
        return cnp;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return cnp.equals(employee.cnp);
    }

    @Override
    public int hashCode() {
        return cnp.hashCode();
    }
}
