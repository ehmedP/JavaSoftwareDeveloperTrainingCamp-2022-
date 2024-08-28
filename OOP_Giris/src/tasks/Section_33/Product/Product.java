package tasks.Section_33.Product;

public class Product {
    
    private Integer id;
    private String name;
    private String description;
    private Double price;
    private Integer stockAmount;
    private String color;
    private String code;
    
    public Product() { }

    public Product(
        Integer id, String name, String description, 
        Double price, Integer stockAmount, String color, String code
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.color = color;
        this.code = code;
    }

    public Integer getId() { return this.id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }
    
    public String getDescription() { return this.description; }
    public void setDescription(String description) { this.description = description; }

    public Double getPrice() { return this.price; }
    public void setPrice(Double price) { this.price = price; }

    public Integer getStockAmount() { return this.stockAmount; }
    public void setStockAmount(Integer stockAmount) { this.stockAmount = stockAmount; }

    public String getColor() { return this.color; }
    public void setColor(String color) { this.color = color; }

    public String getCode() { return this.code; }
    public void setCode(String code) { this.code = code; }

}
