package AOP_Giris.Product;

// PascallCase
public class Product {

    // camelCase
    private String name;
    private Double unitPrice;
    private Double discount;
    private String imageUrl;
    private Integer unitsInStock;
    
    
    public Product() { }

    public Product(String name, Double unitPrice, Double discount, String imageUrl, Integer unitsInStock) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.imageUrl = imageUrl;
        this.unitsInStock = unitsInStock;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public Double getDiscount() {
        return discount;
    }
    public void setDiscount(Double discount) {
        this.discount = discount;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public Integer getUnitsInStock() {
        return unitsInStock;
    }
    public void setUnitsInStock(Integer unitsInStock) {
        this.unitsInStock = unitsInStock;
    }
}
