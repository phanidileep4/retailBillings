package retail.billings.bl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import retail.billings.domain.Customer;
import retail.billings.domain.CustomerType;
import retail.billings.domain.Item;
import retail.billings.domain.Order;

public class OrderActionTest {

    Order order = new Order();
    Order orderConst;

    @Before
    public void setUp() throws Exception {
        Item item1 = new Item("1", 1, "12RL", "ROSE", 110.00, false);
        Item item2 = new Item("1", 1, "12RL", "ROSE", 120.00, false);
        Item item3 = new Item("1", 1, "12RL", "ROSE", 130.00, true);
        List<Item> itemsConst = new ArrayList<>();
        itemsConst.add(item1);
        itemsConst.add(item2);
        itemsConst.add(item3);
        
        Calendar cal = Calendar.getInstance(Locale.US);
        cal.set(Calendar.YEAR, 2014);
        Customer customerConst = new Customer(1234L, "S", "ss", "1231212", CustomerType.REGULAR, cal.getTime());
        cal.set(Calendar.YEAR, 2019);
        order.setOrderNo(1L);
        order.setCreatedDate(cal.getTime());
        order.setCreatedBy("sss");
        order.setCustomer(customerConst);
        order.setItems(itemsConst);
        orderConst = new Order(1L, cal.getTime(), "sss", 360.0, 333.5, 230.0, 26.5, 11.5, 15.0, customerConst, itemsConst);
    }

    @Test
    public void test() {
        OrderAction oa = new OrderAction();
        order = oa.calculateDiscounts(order);
        
        assertEquals(orderConst.getTotalOrderValue(), order.getTotalOrderValue());
    }

}
