package tasks.Section_36.Employee;

import tasks.Section_36.Person.Person;

public class Employee extends Person {
    private Double salary;

    public Employee() { }
    public Employee(String firstName, String lastName, int age, String email, Double salary) {
        super(firstName, lastName, age, email);
        this.salary = salary;
    }

    public Double getSalary() { return this.salary; }
    public void setSalary(Double salary) { this.salary = salary; }
    
}
