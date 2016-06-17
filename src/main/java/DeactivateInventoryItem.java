public class DeactivateInventoryItem {

    private final InventoryItem inventoryItem;

    public DeactivateInventoryItem(InventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    public void process() {
        inventoryItem.handleDeactivate(this);
    }
}
