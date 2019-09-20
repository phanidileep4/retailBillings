package retail.billings.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Long orderNo;
    private Date createdDate;
    private String createdBy;
    private Double totalOrderValue;
    private Double effectiveTotalOrderValue;
    private Double totalDiscountableOrderValue;
    private Double totalDiscount;
    private Double percentageDiscount;
    private Double fixedDiscount;
    private Customer customer;
    private List<Item> items = new ArrayList<>();

    public Order() {
        this.totalOrderValue = 0.0;
        this.effectiveTotalOrderValue = 0.0;
        this.totalDiscountableOrderValue = 0.0;
        this.totalDiscount = 0.0;
        this.percentageDiscount = 0.0;
        this.fixedDiscount = 0.0;
    }
    
    public Order(Long orderNo, Date createdDate, String createdBy, Double totalOrderValue, Double effectiveTotalOrderValue, Double totalDiscountableOrderValue, Double totalDiscount, Double percentageDiscount, Double fixedDiscount, Customer customer, List<Item> items) {
        this.orderNo = orderNo;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
        this.totalOrderValue = totalOrderValue;
        this.effectiveTotalOrderValue = effectiveTotalOrderValue;
        this.totalDiscountableOrderValue = totalDiscountableOrderValue;
        this.totalDiscount = totalDiscount;
        this.percentageDiscount = percentageDiscount;
        this.fixedDiscount = fixedDiscount;
        this.customer = customer;
        this.items = items;
    }
    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Double getTotalOrderValue() {
        return totalOrderValue;
    }

    public void setTotalOrderValue(Double totalOrderValue) {
        this.totalOrderValue = totalOrderValue;
    }

    public Double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(Double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public Double getFixedDiscount() {
        return fixedDiscount;
    }

    public void setFixedDiscount(Double fixedDiscount) {
        this.fixedDiscount = fixedDiscount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    public Double getTotalDiscountableOrderValue() {
        return totalDiscountableOrderValue;
    }
    public void setTotalDiscountableOrderValue(Double totalDiscountableOrderValue) {
        this.totalDiscountableOrderValue = totalDiscountableOrderValue;
    }

    public Double getEffectiveTotalOrderValue() {
        return this.effectiveTotalOrderValue;
    }

    public void setEffectiveTotalOrderValue(Double effectiveTotalOrderValue) {
        this.effectiveTotalOrderValue = effectiveTotalOrderValue;
    }

    public Double getTotalDiscount() {
        return this.totalDiscount;
    }

    public void setTotalDiscount(Double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    @Override
    public String toString() {
        return "Order [orderNo=" + orderNo + ", createdDate=" + createdDate + ", createdBy=" + createdBy
                + ", totalOrderValue=" + totalOrderValue + ", effectiveTotalOrderValue=" + effectiveTotalOrderValue
                + ", totalDiscountableOrderValue=" + totalDiscountableOrderValue + ", totalDiscount=" + totalDiscount
                + ", percentageDiscount=" + percentageDiscount + ", fixedDiscount=" + fixedDiscount + ", customer="
                + customer + ", items=" + items + "]";
    }

}
