package aop_final.Entities;

public class Product {
    
    private Integer id;
    private String name;
    private Double unitPrice;
    
    public Product() { }
    public Product(Integer id, String name, Double unitPrice) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
    }
    
    public Integer getId() { return this.id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }
    
    public Double getUnitPrice() { return this.unitPrice; }
    public void setUnitPrice(Double unitPrice) { this.unitPrice = unitPrice; }
}
