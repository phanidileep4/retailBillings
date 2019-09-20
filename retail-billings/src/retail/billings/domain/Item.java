package retail.billings.domain;

public class Item {

    private String identity;
    private Integer itemSequence;
    private String itemCode;
    private String itemName;
    private double itemPrice = 0.00;
    private Boolean isGroceryItem;
    
    public Item() {}
    public Item(String identity, Integer itemSequence, String itemCode, String itemName, Double itemPrice, Boolean isGroceryItem) {
        this.identity = identity;
        this.itemSequence = itemSequence;
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.isGroceryItem = isGroceryItem;
    }
    
    public String getIdentity() {
        return identity;
    }
    public void setIdentity(String identity) {
        this.identity = identity;
    }
    public Integer getItemSequence() {
        return itemSequence;
    }
    public void setItemSequence(Integer itemSequence) {
        this.itemSequence = itemSequence;
    }
    public String getItemCode() {
        return itemCode;
    }
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public double getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
    public Boolean getIsGroceryItem() {
        return isGroceryItem;
    }
    public void setIsGroceryItem(Boolean isGroceryItem) {
        this.isGroceryItem = isGroceryItem;
    }
    @Override
    public String toString() {
        return "Item [identity=" + identity + ", itemSequence=" + itemSequence + ", itemCode=" + itemCode
                + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", isGroceryItem=" + isGroceryItem + "]";
    }
    
}