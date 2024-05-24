package org.example.ex2;

public abstract class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName) {
        this.firstName = firstName;
        this.lastName = "";
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public abstract String showEmployeeInfo();
}
