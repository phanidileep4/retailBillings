package retail.billings.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Locale;

import org.junit.Before;
import org.junit.Test;


public class CustomerTest {

    Customer customer = new Customer();
    Customer customerTest;

    Calendar cal = Calendar.getInstance(Locale.US);

    @Before
    public void setUp() throws ParseException {
        customer.setCustId(1234L);
        customer.setName("S");
        customer.setEmail("ss");
        customer.setPhone("1231212");
        customer.setCustType(CustomerType.REGULAR);
        customer.setCreatedDate(cal.getTime());
        
        customerTest = new Customer(1234L, "S", "ss", "1231212", CustomerType.REGULAR, cal.getTime());
    }

    @Test
    public void execute() {
        assertEquals(customerTest.getCustId(), customer.getCustId());
        assertEquals(customerTest.getName(), customer.getName());
        assertEquals(customerTest.getEmail(), customer.getEmail());
        assertEquals(customerTest.getPhone(), customer.getPhone());
        assertEquals(customerTest.getCustType(), customer.getCustType());
        assertEquals(customerTest.getCreatedDate(), customer.getCreatedDate());
        assertNotNull(customer.hashCode());
        assertNotNull(customer.toString());

    }
}
