package retail.billings.bl;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import retail.billings.config.BillingConstants;
import retail.billings.domain.Item;
import retail.billings.domain.Order;

public class OrderAction {

    public Order calculateDiscounts(Order order) {

        if (null == order) {
            return null;
        } else {
            this.getPercentageDiscountableOrderValue(order);
        }
        
        switch (order.getCustomer().getCustType()) {
        case REGULAR:
            Calendar currCal = Calendar.getInstance(Locale.US);
            currCal.setTime(new Date());
            Calendar custCal = Calendar.getInstance(Locale.US);
            custCal.setTime(order.getCustomer().getCreatedDate());
            int diff = currCal.get(Calendar.YEAR) - custCal.get(Calendar.YEAR);
            if (custCal.get(Calendar.MONTH) > currCal.get(Calendar.MONTH)
                    || (custCal.get(Calendar.MONTH) == currCal.get(Calendar.MONTH)
                            && custCal.get(Calendar.DATE) > currCal.get(Calendar.DATE))) {
                diff--;
            }
            if (diff >= BillingConstants.REGULAR_CUST_AGE) {
                order.setPercentageDiscount(order.getTotalDiscountableOrderValue() * BillingConstants.REGULAR_PERCENTAGE
                        / BillingConstants.CENT);
            }
            break;
        case AFFILIATE:
            order.setPercentageDiscount(order.getTotalDiscountableOrderValue() * BillingConstants.AFFILIATE_PERCENTAGE
                    / BillingConstants.CENT);
            break;
        case EMPLOYEE:
            order.setPercentageDiscount(order.getTotalDiscountableOrderValue() * BillingConstants.EMPLOYEE_PERCENTAGE
                    / BillingConstants.CENT);
            break;
        default:
            order.setPercentageDiscount(0.00);
            break;
        }
        order.setFixedDiscount(Math.floor(order.getTotalOrderValue() / 100) * 5);
        order.setTotalDiscount(order.getPercentageDiscount() + order.getFixedDiscount());
        order.setEffectiveTotalOrderValue(order.getTotalOrderValue() - order.getTotalDiscount());
        return order;
    }
    
    private void getPercentageDiscountableOrderValue(Order order) {
        if (null != order.getItems()) {
            Double totalDiscountableOrderValue = 0.0;
            Double totalOrderValue = 0.0;
            for (Item item:order.getItems()) {
                if (!item.getIsGroceryItem()) {
                    totalDiscountableOrderValue += item.getItemPrice();
                }
                totalOrderValue += item.getItemPrice();
            }
            order.setTotalDiscountableOrderValue(totalDiscountableOrderValue);
            order.setTotalOrderValue(totalOrderValue);
        }
    }

    
    /*public static void main(String[] args) throws Exception {
        OrderAction oa = new OrderAction();
        
        
        
        Item item1 = new Item();
        item1.setIdentity("1");
        item1.setItemSequence(1);
        item1.setItemCode("12RL");
        item1.setItemName("ROSE");
        item1.setItemPrice(110.00);
        item1.setIsGroceryItem(false);
        

        Item item2 = new Item();
        item2.setIdentity("1");
        item2.setItemSequence(1);
        item2.setItemCode("12RL");
        item2.setItemName("ROSE");
        item2.setItemPrice(120.00);
        item2.setIsGroceryItem(false);
        

        Item item3 = new Item();
        item3.setIdentity("1");
        item3.setItemSequence(1);
        item3.setItemCode("12RL");
        item3.setItemName("ROSE");
        item3.setItemPrice(130.00);
        item3.setIsGroceryItem(true);
        
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        
        Calendar cal = Calendar.getInstance(Locale.US);
        cal.set(Calendar.YEAR, 2014);
        Customer customer = new Customer();
        customer.setCustId(1234L);
        customer.setName("S");
        customer.setEmail("ss");
        customer.setPhone("1231212");
        customer.setCustType(CustomerType.REGULAR);
        customer.setCreatedDate(cal.getTime());
        
        Order order = new Order();
        order.setOrderNo(1L);
        order.setCreatedDate(new Date());
        order.setCreatedBy("dfsadf");
        order.setCustomer(customer);
        order.setItems(items);
        
        System.out.println(oa.calculateDiscounts(order));
    }
*/}
