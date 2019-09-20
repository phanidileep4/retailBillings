package retail.billings.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class ItemTest {

    Item item = new Item();
    Item itemConst;

    @Before
    public void setUp() throws Exception {
        item.setIdentity("1");
        item.setItemSequence(1);
        item.setItemCode("12RL");
        item.setItemName("ROSE");
        item.setItemPrice(10.00);
        item.setIsGroceryItem(false);
        itemConst = new Item("1", 1, "12RL", "ROSE", 10.00, false);
    }

    @Test
    public void execute() {
        assertEquals(itemConst.getIsGroceryItem(), item.getIsGroceryItem());
        assertEquals(itemConst.getIdentity(), item.getIdentity());
        assertEquals(itemConst.getItemSequence(), item.getItemSequence());
        assertEquals(itemConst.getItemCode(), item.getItemCode());
        assertEquals(itemConst.getItemName(), item.getItemName());
        assertEquals(itemConst.getItemPrice(), item.getItemPrice(), 0);
        assertNotNull(item.hashCode());
        assertNotNull(item.toString());
    }

}
