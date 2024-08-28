package tasks.task2.Section_38.Entity;

public class Customer {

    private String id;
    private String name;
    private String description;
    private String email;
    private Integer age;

    public Customer(String id, String name, String description, String email, Integer age) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.email = email;
        this.age = age;
    }

    public Customer() { }

    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return this.description; }
    public void setDescription(String description) { this.description = description; }

    public String getEmail() { return this.email; }
    public void setEmail(String email) { this.email = email; }

    public Integer getAge() { return this.age; }
    public void setAge(Integer age) { this.age = age; }
    
}
