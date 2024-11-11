package flower.store;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {
    private String name;
    private double price;
}

import java.util.List;

@Data
public class Order {
    private List<Item> items;
    private double totalAmount;

    public Order(List<Item> items) {
        this.items = items;
        this.totalAmount = items.stream().mapToDouble(Item::getPrice).sum();
    }
}
