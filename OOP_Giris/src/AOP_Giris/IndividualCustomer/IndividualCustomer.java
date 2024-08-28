package AOP_Giris.IndividualCustomer;

import AOP_Giris.Customer.Customer;

public class IndividualCustomer extends Customer { 
    private String firstName;
    private String lastName;


    public IndividualCustomer() { }
    public IndividualCustomer(int id, String customerNumber, String phone, String firstName, String lastName) {
        super(id, customerNumber, phone);
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
