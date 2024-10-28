import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Menu> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(Menu item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (Menu item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public List<Menu> getItems() {
        return items;
    }
}
