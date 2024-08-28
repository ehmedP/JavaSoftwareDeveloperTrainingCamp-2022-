package tasks.Section_36.Customer;

import tasks.Section_36.Person.Person;

public class Customer extends Person {

    private String email;

    public Customer() { }
    public Customer(String firstName, String lastName, int age, String email) {
        super(firstName, lastName, age, email);
        this.email = email;
    }

    public String getEmail() { return this.email; }
    public void setEmail(String email) { this.email = email; }
    
}
