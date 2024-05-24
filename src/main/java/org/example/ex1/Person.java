package org.example.ex1;

public class Person {
    private String firstName;
    private String lastName;

    // Constructor for a person with only a first name
    public Person(String firstName) {
        this.firstName = firstName;
        this.lastName = "";
    }

    // Constructor for a person with a first name and a last name
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter for the first name
    public String getFirstName() {
        return firstName;
    }

    // Getter for the last name
    public String getLastName() {
        return lastName;
    }

    // Override the equals method to compare Person objects based on their names
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return firstName.equals(person.firstName) && lastName.equals(person.lastName);
    }

    // Override the toString method to return the full name of the person
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
