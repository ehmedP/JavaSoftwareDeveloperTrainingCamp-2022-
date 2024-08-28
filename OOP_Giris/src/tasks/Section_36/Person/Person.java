package tasks.Section_36.Person;

public class Person {
    
    private String firstName;
    private String lastName;
    private int age;

    public Person() { }
    public Person(String firstName, String lastName, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() { return this.firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return this.lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getAge() { return this.age; }
    public void setAge(int age) { this.age = age; }
    
}
