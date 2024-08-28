package AOP_Giris.CorporateCustomer;

import AOP_Giris.Customer.Customer;

public class CorporateCustomer extends Customer {
    private String companyName;
    private String textNumber;
    
    public CorporateCustomer() { }

    public CorporateCustomer(int id, String customerNumber, String phone, String companyName, String textNumber) {
        super(id, customerNumber, phone);
        this.companyName = companyName;
        this.textNumber = textNumber;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getTextNumber() {
        return textNumber;
    }
    public void setTextNumber(String textNumber) {
        this.textNumber = textNumber;
    }

    
}
