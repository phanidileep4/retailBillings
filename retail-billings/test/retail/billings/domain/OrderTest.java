package retail.billings.domain;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import org.junit.Before;
import org.junit.Test;

public class OrderTest {

    Order order = new Order();
    Order orderConst;
    Calendar cal = Calendar.getInstance(Locale.US);
    @Before
    public void setUp() throws Exception {
        Item itemConst = new Item("1", 1, "12RL", "ROSE", 100.00, false);
        List<Item> itemsConst = new ArrayList<>();
        itemsConst.add(itemConst);
        Customer customerConst = new Customer(1234L, "S", "ss", "1231212", CustomerType.AFFILIATE, cal.getTime());
        order.setOrderNo(1L);
        order.setCreatedDate(cal.getTime());
        order.setCreatedBy("S");
        order.setTotalOrderValue(100.00);
        order.setEffectiveTotalOrderValue(95.00);
        order.setTotalDiscountableOrderValue(100.00);
        order.setTotalDiscount(5.00);
        order.setPercentageDiscount(0.00);
        order.setFixedDiscount(5.00);
        order.setCustomer(customerConst);
        order.setItems(itemsConst);
        orderConst = new Order(1L, cal.getTime(), "S", 100.00, 95.00, 100.00, 5.00, 0.00, 5.00, customerConst, itemsConst);
    }

    @Test
    public void execute() {
        assertEquals(orderConst.getOrderNo(), order.getOrderNo());
        assertEquals(orderConst.getCreatedDate(), order.getCreatedDate());
        assertEquals(orderConst.getCreatedBy(), order.getCreatedBy());
        assertEquals(orderConst.getTotalOrderValue(), order.getTotalOrderValue());
        assertEquals(orderConst.getEffectiveTotalOrderValue(), order.getEffectiveTotalOrderValue());
        assertEquals(orderConst.getTotalDiscountableOrderValue(), order.getTotalDiscountableOrderValue());
        assertEquals(orderConst.getTotalDiscount(), order.getTotalDiscount());
        assertEquals(orderConst.getPercentageDiscount(), order.getPercentageDiscount());
        assertEquals(orderConst.getFixedDiscount(), order.getFixedDiscount());
        assertEquals(orderConst.getCustomer(), order.getCustomer());
        assertEquals(orderConst.getItems(), order.getItems());
        assertNotNull(order.hashCode());
        assertNotNull(order.toString());
    }

}
