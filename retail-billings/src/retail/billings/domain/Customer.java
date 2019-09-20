package retail.billings.domain;

import java.util.Date;

public class Customer {

    private Long custId;
    private String name;
    private String email;
    private String phone;
    private CustomerType custType;
    private Date createdDate;
    
    public Customer() {}
    public Customer(Long custId, String name, String email, String phone, CustomerType custType, Date createdDate) {
        this.custId = custId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.custType = custType;
        this.createdDate = createdDate;
    }
    
    public Long getCustId() {
        return custId;
    }
    public void setCustId(Long custId) {
        this.custId = custId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public CustomerType getCustType() {
        return custType;
    }
    public void setCustType(CustomerType custType) {
        this.custType = custType;
    }
    @Override
    public String toString() {
        return "Customer [custId=" + custId + ", name=" + name + ", email=" + email + ", phone=" + phone
                + ", createdDate=" + createdDate + "]";
    }
    
}
