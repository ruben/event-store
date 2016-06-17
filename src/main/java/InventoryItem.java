public class InventoryItem {
    private boolean active = true;

    public InventoryItem(int id, String name) {
    }

    public boolean isActive() {
        return active;
    }

    public void handleDeactivate(DeactivateInventoryItem deactivateInventoryItem) {
        this.active = false;
    }
}
