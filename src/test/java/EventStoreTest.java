import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EventStoreTest {

    @Test
    public void testDeactivateCommandDeactivatesInventoryItem() throws Exception {
        InventoryItem inventoryItem = new InventoryItem(22, "New inventory item");
        InventoryCommandHandlers.handle(new DeactivateInventoryItem(inventoryItem));
        assertEquals(false, inventoryItem.isActive());
    }

}
